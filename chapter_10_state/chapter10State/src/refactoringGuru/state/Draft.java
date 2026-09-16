package refactoringGuru.state;

import refactoringGuru.Document;
import refactoringGuru.User;

public class Draft extends IDocumentState{



    public Draft(Document document) {
        super(document);
    }

    @Override
    public void render(User user) {
        if(user.role.equals("Admin") || user.role.equals("Author")){
            System.out.println("rendering document");
        } else {
            System.out.println("don't have access to this document!");
        }
    }

    @Override
    public void publish(User user) {
        if(user.role.equals("Author")) {
            document.changeState(new Moderation(document));
            System.out.println("document sent to moderation!");
        } else {
            System.out.println("only author could send to moderation");
        }
    }
}

package refactoringGuru.state;

import refactoringGuru.Document;
import refactoringGuru.User;

public class Moderation extends IDocumentState{

    public Moderation(Document document) {
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

        if(user.role.equals("Admin")){
            document.changeState(new Published(document));
            System.out.println("document published!");
        } else {
            System.out.println("only admin can publish!");
        }
    }
}

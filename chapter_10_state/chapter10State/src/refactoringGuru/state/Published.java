package refactoringGuru.state;

import refactoringGuru.Document;
import refactoringGuru.User;

public class Published extends IDocumentState{
    public Published(Document document) {
        super(document);
    }

    @Override
    public void render(User user) {
        System.out.println("Rendering!");
    }

    @Override
    public void publish(User user) {

        System.out.println("No else to go!");
    }
}

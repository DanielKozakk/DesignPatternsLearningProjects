package refactoringGuru.state;

import refactoringGuru.Document;
import refactoringGuru.User;

public abstract class IDocumentState {

    Document document;

    public IDocumentState(Document document) {
        this.document = document;
    }

    public abstract void  render(User user);
    public abstract void  publish( User user);

}

package refactoringGuru;

import refactoringGuru.state.Draft;
import refactoringGuru.state.IDocumentState;

public class Document {


    IDocumentState iDocumentState = new Draft(this);

    public void changeState(IDocumentState state){
        iDocumentState = state;
    }

    public void publish(User user){
        iDocumentState.publish(user);
    }

    public void render(User user){
        iDocumentState.render(user);
    }


}

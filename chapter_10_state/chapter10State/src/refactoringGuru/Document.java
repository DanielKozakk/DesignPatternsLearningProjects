package refactoringGuru;

public class Document {

    DocumentState documentState = DocumentState.DRAFT;

    public void publishDocument(User user){
        switch (documentState){
            case DRAFT -> {
                documentState = DocumentState.MODERATION;
                System.out.println("document sent to moderation!");
            }
            case DocumentState.MODERATION ->{
                if(user.role.equals("Admin")) {
                    documentState = DocumentState.PUBLISHED;

                    System.out.println("document published!");
                } else {
                    System.out.println("only admin is allowed to publish!");
                }
            }
        }
    }
}

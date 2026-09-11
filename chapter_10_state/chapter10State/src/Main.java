import refactoringGuru.Document;
import refactoringGuru.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    User admin = new User("aAdmin");
    Document doc = new Document();
    doc.publishDocument(admin);
    doc.publishDocument(admin);
}

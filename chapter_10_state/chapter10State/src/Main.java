import refactoringGuru.Document;
import refactoringGuru.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    User admin = new User("Admin");
    User author = new User("Author");
    User reader = new User("reader");

    Document doc = new Document();

    doc.publish(author);


    doc.publish(admin);

    doc.publish(admin);
}

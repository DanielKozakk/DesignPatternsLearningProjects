import ISupposeItlooksLikeThis.Original;
import ISupposeItlooksLikeThis.OriginalInterface;
import ISupposeItlooksLikeThis.Proxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    OriginalInterface original = new Original();
    OriginalInterface proxy = new Proxy(original);

    proxy.generateMessage();


}

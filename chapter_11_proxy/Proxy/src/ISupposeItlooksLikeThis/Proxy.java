package ISupposeItlooksLikeThis;

public class Proxy implements OriginalInterface{
    OriginalInterface original;

    public Proxy(OriginalInterface original) {
        this.original = original;
    }

    @Override
    public void generateMessage() {

        System.out.println("proxy message before");
        original.generateMessage();
        System.out.println("proxy message after");
    }
}

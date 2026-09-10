package composite.bookComposite.menu;

import java.util.Collection;

public abstract class MenuComponent {

    String getName() {
        throw new UnsupportedOperationException();
    }

    String getDescription() {
        throw new UnsupportedOperationException();
    }

    double getPrice() {
        throw new UnsupportedOperationException();
    }

    void print() {
        throw new UnsupportedOperationException();
    }


    void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    MenuComponent getChild(int id) {
        throw new UnsupportedOperationException();
    }


}

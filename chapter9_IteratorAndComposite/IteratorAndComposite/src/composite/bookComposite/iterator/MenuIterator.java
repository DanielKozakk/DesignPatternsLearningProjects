package composite.bookComposite.iterator;

import composite.bookComposite.menu.MenuItem;

public interface MenuIterator {
    MenuItem getNext();
    boolean hasNext();
}

package iterator.headFirstMenuProblem.iterator;

import iterator.headFirstMenuProblem.menu.MenuItem;

public interface MenuIterator {
    MenuItem getNext();
    boolean hasNext();
}

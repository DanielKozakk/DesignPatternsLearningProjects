package iterator.headFirstMenuProblem.iterator;

import iterator.headFirstMenuProblem.menu.CafeMenu;
import iterator.headFirstMenuProblem.menu.MenuItem;

import java.util.Iterator;

public class CafeMenuIterator implements MenuIterator {
    Iterator<MenuItem> javaIterator;
    public CafeMenuIterator(CafeMenu cafeMenu) {

        javaIterator = cafeMenu.getMenuItems().values().iterator();
    }

    @Override
    public MenuItem getNext() {
        MenuItem menuItem = null;

        if(javaIterator.hasNext()){
            menuItem = javaIterator.next();
        }
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return javaIterator.hasNext();
    }
}

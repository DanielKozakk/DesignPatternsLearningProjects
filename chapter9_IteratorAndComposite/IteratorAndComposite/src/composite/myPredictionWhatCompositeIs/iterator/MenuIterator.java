package composite.myPredictionWhatCompositeIs.iterator;

import composite.myPredictionWhatCompositeIs.menu.MenuElementHolder;

public interface MenuIterator {
    MenuElementHolder getNext();
    boolean hasNext();
}

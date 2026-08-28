package composite.myPredictionWhatCompositeIs.iterator;

import composite.myPredictionWhatCompositeIs.composite.MenuElementHolder;

public interface MenuIterator {
    MenuElementHolder getNext();
    boolean hasNext();
}

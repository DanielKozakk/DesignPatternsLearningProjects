package compositePrediction.iterator;

import compositePrediction.MenuItem;

public interface MenuIterator {
    MenuItem getNext();
    boolean hasNext();
}

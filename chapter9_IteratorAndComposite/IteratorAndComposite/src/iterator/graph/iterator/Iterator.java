package iterator.graph.iterator;

import iterator.graph.Node;

public interface Iterator {
    Node getNext();
    boolean hasNext();
}

package iterator.graph.iterator;

import iterator.graph.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstIterator implements Iterator {
    Node node;

    Queue<Node> queue = new LinkedList<>();

    public BreadthFirstIterator(Node node) {
        this.node = node;
    }

    @Override
    public Node getNext() {



    }

    @Override
    public boolean hasNext() {
        return false;
    }
}

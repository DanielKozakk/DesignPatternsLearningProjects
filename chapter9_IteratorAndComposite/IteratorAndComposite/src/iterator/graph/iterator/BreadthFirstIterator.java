package iterator.graph.iterator;

import iterator.graph.Node;

import java.util.*;

public class BreadthFirstIterator implements Iterator {


    Queue<Node> queue = new LinkedList<>();
    List<Node> visitedNodes = new ArrayList<>();

    public BreadthFirstIterator(Node startingNode) {
        queue.add(startingNode);
    }

    @Override
    public Node getNext() {

        if(queue.isEmpty()){
            return null;
        }
        Node searchedNode = queue.poll();

        for(Node neighbour : searchedNode.getNeighbours()){
            if(!visitedNodes.contains(neighbour)) {
                queue.add(neighbour);
            }

        }
        visitedNodes.add(searchedNode);
        return searchedNode;
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}

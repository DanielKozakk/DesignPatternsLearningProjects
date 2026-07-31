package iterator.graph.iterator;

import iterator.graph.Node;

import java.util.*;

public class DepthFirstIterator implements Iterator {

    Stack<Node> stack = new Stack<>();

    Set<Node> returnedNodes = new HashSet<>();
    List<Node> visitedNeighboursNodes = new ArrayList<>();

    public DepthFirstIterator(Node startingNode) {
        stack.add(startingNode);
    }

    @Override
    public Node getNext() {

        if (stack.isEmpty()) {
            return null;
        }
        Node searchedNode = stack.peek();

        boolean hasUnvisitedNeighbours = false;

        for (Node neighbour : searchedNode.getNeighbours()) {
            if (returnedNodes.contains(neighbour)) {
                continue;
            }
            if (!visitedNeighboursNodes.contains(neighbour)) {
                hasUnvisitedNeighbours = true;
                stack.add(neighbour);

                break;
            }
        }
        if (!hasUnvisitedNeighbours) {
            visitedNeighboursNodes.add(stack.pop());
        }



        if(returnedNodes.contains(searchedNode)){
            return getNext();
        }

        returnedNodes.add(searchedNode);
        return searchedNode;
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

package iterator.graph;

import iterator.graph.iterator.BreadthFirstIterator;
import iterator.graph.iterator.DepthFirstIterator;
import iterator.graph.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Node implements IterableCollection{

    private List<Node> neighbours = new ArrayList<>();

    private String name;

    public Node(String name) {
        this.name = name;
    }

    public void addNeighbour(Node node){
        neighbours.add(node);
        node.neighbours.add(this);
    }


    public String getName() {
        return name;
    }

    public List<Node> getNeighbours() {
        return neighbours;
    }

    @Override
    public Iterator createIterator() {
        return new DepthFirstIterator(this);
    }


    @Override
    public String toString() {
        return name;
    }
}

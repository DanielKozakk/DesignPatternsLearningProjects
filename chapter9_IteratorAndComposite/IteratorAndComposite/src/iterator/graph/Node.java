package iterator.graph;

import iterator.graph.iterator.BreadthFirstIterator;
import iterator.graph.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Node implements IterableCollection{

    private List<Node> neighbours = new ArrayList<>();
    private boolean visited = false;
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public void addNeighbour(Node node){
        neighbours.add(node);
    }

    public boolean isVisited() {
        return visited;
    }

    public String getName() {
        return name;
    }

    public List<Node> getNeighbours() {
        return neighbours;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }


    @Override
    public Iterator createIterator() {
        return new BreadthFirstIterator(this);
    }
}

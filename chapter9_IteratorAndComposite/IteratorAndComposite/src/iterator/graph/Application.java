package iterator.graph;

import iterator.graph.iterator.Iterator;

public class Application {
    public void start(){
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");
        Node i = new Node("I");
        Node j = new Node("J");
        Node k = new Node("K");
        Node l = new Node("L");

        a.addNeighbour(b);
        b.addNeighbour(c);
        b.addNeighbour(d);
        a.addNeighbour(e);
        e.addNeighbour(f);
        f.addNeighbour(g);
        e.addNeighbour(h);
        h.addNeighbour(i);
        i.addNeighbour(j);
        i.addNeighbour(k);
        e.addNeighbour(l);

        Iterator breathFirst = a.createIterator();
        Node a2 = breathFirst.getNext();
        Node b2 = breathFirst.getNext();
        Node c2 = breathFirst.getNext();
        Node d2 = breathFirst.getNext();
        Node e2 = breathFirst.getNext();
        Node f2 = breathFirst.getNext();
        Node g2 = breathFirst.getNext();
        Node h2 = breathFirst.getNext();
        Node i2 = breathFirst.getNext();
        Node j2 = breathFirst.getNext();

        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println(d2);
        System.out.println(e2);
        System.out.println(f2);
        System.out.println(g2);
        System.out.println(h2);
        System.out.println(i2);
        System.out.println(j2);
    }
}

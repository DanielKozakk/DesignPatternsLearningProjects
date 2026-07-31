import iterator.graph.Node;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
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





}

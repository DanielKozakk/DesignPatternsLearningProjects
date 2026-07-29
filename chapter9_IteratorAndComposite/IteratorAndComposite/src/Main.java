import iterator.graph.IterableCollection;
import iterator.graph.MyCollection;
import iterator.iterator.BasicIterator;
import iterator.iterator.FilterIterator;
import iterator.iterator.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    MyCollection myCol = new MyCollection();


    myCol.addItem("a");
    myCol.addItem("b");
    myCol.addItem("cccc");
    myCol.addItem("ccc21231c");


    Iterator iterator = myCol.createIterator();
    if(iterator instanceof BasicIterator){

        iterator = new FilterIterator((BasicIterator) iterator);

        System.out.println(iterator.getNext());
        System.out.println(iterator.getNext());

    }





}

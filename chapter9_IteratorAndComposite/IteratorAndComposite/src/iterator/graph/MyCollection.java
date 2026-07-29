package iterator.graph;

import iterator.iterator.BasicIterator;
import iterator.iterator.Iterator;
import iterator.iterator.ReverseIterator;

import java.util.ArrayList;
import java.util.List;

public class MyCollection implements IterableCollection {

   public List<String> items = new ArrayList<>();

    public void addItem(String item){
        items.add(item);
    }

    @Override
    public Iterator createIterator() {
        return new BasicIterator(this);
    }
}

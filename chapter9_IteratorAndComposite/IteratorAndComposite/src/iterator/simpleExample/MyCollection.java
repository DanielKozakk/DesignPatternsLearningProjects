package iterator.simpleExample.myCollection;

import iterator.simpleExample.iterator.BasicIterator;
import iterator.simpleExample.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class MyCollection implements iterator.simpleExample.myCollection.IterableCollection {

   public List<String> items = new ArrayList<>();

    public void addItem(String item){
        items.add(item);
    }

    @Override
    public Iterator createIterator() {
        return new BasicIterator(this);
    }
}

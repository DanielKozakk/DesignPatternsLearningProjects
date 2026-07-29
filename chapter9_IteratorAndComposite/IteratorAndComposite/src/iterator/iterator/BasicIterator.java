package iterator.iterator;

import iterator.graph.MyCollection;

public class BasicIterator implements Iterator {

    MyCollection myCollection;

    int iterationState = 0;

    public BasicIterator(MyCollection myCollection) {
        this.myCollection = myCollection;
    }

    @Override
    public String getNext() {
        String item = null;
        try {
            item = myCollection.items.get(iterationState);
        } catch(IndexOutOfBoundsException e){

        }
        iterationState ++;
        return item;
    }

    @Override
    public boolean hasNext() {
        return iterationState < myCollection.items.size();
    }
}

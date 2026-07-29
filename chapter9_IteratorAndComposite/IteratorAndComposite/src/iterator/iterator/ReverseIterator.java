package iterator.iterator;

import iterator.graph.MyCollection;

public class ReverseIterator implements Iterator {

    MyCollection myCollection;

    int iterationState;

    public ReverseIterator(MyCollection myCollection) {
        this.myCollection = myCollection;
        iterationState = myCollection.items.size() - 1;
    }

    @Override
    public String getNext() {
        String item = null;
        try {
            item = myCollection.items.get(iterationState);
        } catch(IndexOutOfBoundsException e){

        }
        iterationState --;
        return item;
    }

    @Override
    public boolean hasNext() {
        return iterationState < myCollection.items.size();
    }
}

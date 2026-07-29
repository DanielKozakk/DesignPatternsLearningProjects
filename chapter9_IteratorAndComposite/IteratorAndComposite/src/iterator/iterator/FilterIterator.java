package iterator.iterator;


public class FilterIterator implements Iterator {

    BasicIterator basicIterator;


    public FilterIterator(BasicIterator basicIterator) {
        this.basicIterator = basicIterator;
    }

    @Override
    public String getNext() {

        boolean found = false;
        String item = null;

        while(!found && basicIterator.hasNext()){

            item = basicIterator.getNext();
            if(item.length() > 3){
                found = true;
            }
        }

        return item;


    }

    @Override
    public boolean hasNext() {
        return basicIterator.hasNext();
    }
}

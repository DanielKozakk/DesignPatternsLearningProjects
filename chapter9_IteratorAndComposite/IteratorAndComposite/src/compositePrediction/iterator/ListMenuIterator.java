package compositePrediction.iterator;

import compositePrediction.MenuItem;
import compositePrediction.menu.ListMenu;

public class ListMenuIterator implements MenuIterator{
    ListMenu menu;

    int currentIndex = 0;
    public ListMenuIterator(ListMenu menu) {
        this.menu = menu;
    }

    @Override
    public MenuItem getNext() {

        MenuItem item = null;
        if(hasNext()){
            item = menu.getMenuItems().get(currentIndex);
            currentIndex ++;
        }
        return item;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < menu.getMenuItems().size();
    }
}

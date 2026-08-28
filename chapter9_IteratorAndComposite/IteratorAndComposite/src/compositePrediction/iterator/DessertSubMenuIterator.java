package compositePrediction.iterator;

import compositePrediction.MenuItem;
import compositePrediction.menu.submenu.ListDessertSubmenu;

public class DessertSubMenuIterator implements MenuIterator{
    ListDessertSubmenu menu;

    int currentIndex = 0;
    public DessertSubMenuIterator(ListDessertSubmenu menu) {
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

package composite.bookComposite.iterator;

import composite.bookComposite.menu.MenuItem;
import composite.bookComposite.menu.PancakeHouseMenu;

public class PankackeHouseMenuIterator implements MenuIterator {
    PancakeHouseMenu pancakeHouse;
    int currentPosition;

    public PankackeHouseMenuIterator(PancakeHouseMenu pancakeHouseMenu) {
        this.pancakeHouse = pancakeHouseMenu;

    }

    @Override
    public MenuItem getNext() {
        MenuItem menuItem = null;
        if(hasNext()){
            menuItem = pancakeHouse.getMenuItems().get(currentPosition);
            currentPosition++;
        }
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < pancakeHouse.getMenuItems().size();
    }
}

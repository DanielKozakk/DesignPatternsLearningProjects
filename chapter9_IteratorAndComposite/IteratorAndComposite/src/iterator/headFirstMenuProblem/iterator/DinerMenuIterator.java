package iterator.headFirstMenuProblem.iterator;

import iterator.headFirstMenuProblem.menu.DinerMenu;

import java.awt.*;

public class DinerMenuIterator implements MenuIterator {
    DinerMenu dinerMenu;
    int currentPosition;

    public DinerMenuIterator(DinerMenu dinerMenu) {
        this.dinerMenu = dinerMenu;

    }

    @Override
    public MenuItem getNext() {
        MenuItem menuItem = null;
        if(hasNext()){
            menuItem = dinerMenu.getMenuItems()[currentPosition];
            currentPosition++;
        }
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < dinerMenu.getNumberOfItems();
    }
}

package composite.myPredictionWhatCompositeIs.iterator;

import composite.myPredictionWhatCompositeIs.menu.ListMenu;
import composite.myPredictionWhatCompositeIs.menu.MenuElementHolder;

import java.util.List;

public class ListMenuIterator implements MenuIterator{

    List<MenuElementHolder> menuItems;

    int currentIndex = 0;
    public ListMenuIterator(ListMenu menu) {
        this.menuItems = menu.getMenuElements().stream().toList();
    }

    @Override
    public MenuElementHolder getNext() {

        MenuElementHolder item = null;
        if(hasNext()){
            item = menuItems.get(currentIndex);
            currentIndex ++;
        }
        return item;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < menuItems.size();
    }
}

package composite.myPredictionWhatCompositeIs.iterator;

import composite.myPredictionWhatCompositeIs.menu.MenuElementHolder;
import composite.myPredictionWhatCompositeIs.menu.submenu.ListDessertSubmenu;

import java.util.List;

public class DessertSubMenuIterator implements MenuIterator {
    List<MenuElementHolder> menuItems;

    int currentIndex = 0;

    public DessertSubMenuIterator(ListDessertSubmenu menu) {
        this.menuItems = menu.getMenuElements().stream().toList();
    }

    @Override
    public MenuElementHolder getNext() {

        MenuElementHolder item = null;
        if (hasNext()) {
            item = menuItems.get(currentIndex);
            currentIndex++;
        }
        return item;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < menuItems.size();
    }
}


package composite.myPredictionWhatCompositeIs.iterator;

import composite.myPredictionWhatCompositeIs.composite.MenuElementHolder;
import composite.myPredictionWhatCompositeIs.menu.ListMenu;
import composite.myPredictionWhatCompositeIs.menu.MenuGeneralComposite;

import java.util.List;

public class MenuGeneralCompositeIterator implements MenuIterator{

    List<MenuElementHolder> menuItems;

    int currentIndex = 0;
    public MenuGeneralCompositeIterator(MenuGeneralComposite menu) {
        this.menuItems = menu.getList();
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

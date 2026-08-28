package composite.myPredictionWhatCompositeIs.menu;

import composite.myPredictionWhatCompositeIs.composite.MenuElementHolder;
import composite.myPredictionWhatCompositeIs.iterator.MenuGeneralCompositeIterator;
import composite.myPredictionWhatCompositeIs.iterator.MenuIterator;

import java.util.List;

public class MenuGeneralComposite implements IterableMenu {
    List<MenuElementHolder> list;

    public MenuGeneralComposite(List<MenuElementHolder> list) {
        this.list = list;
    }

    @Override
    public MenuIterator createIterator() {
        return new MenuGeneralCompositeIterator(this);
    }

    public List<MenuElementHolder> getList() {
        return list;
    }
}

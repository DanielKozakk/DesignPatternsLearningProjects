package iterator.headFirstMenuProblem.menu.submenu;

import iterator.headFirstMenuProblem.iterator.MenuIterator;
import iterator.headFirstMenuProblem.menu.IterableMenu;
import iterator.headFirstMenuProblem.menu.MenuElementHolder;

import java.util.Collection;
import java.util.List;

public class DessertSubmenu implements IterableMenu, MenuElementHolder {
    public DessertSubmenu() {
    }

    @Override
    public MenuIterator createIterator() {
        return null;
    }

    @Override
    public Collection<MenuElementHolder> getMenuElements() {
        return List.of();
    }
}

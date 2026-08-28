package composite.myPredictionWhatCompositeIs.menu.submenu;

import composite.myPredictionWhatCompositeIs.MenuItem;
import composite.myPredictionWhatCompositeIs.iterator.DessertSubMenuIterator;
import composite.myPredictionWhatCompositeIs.iterator.MenuIterator;
import composite.myPredictionWhatCompositeIs.menu.IterableMenu;
import composite.myPredictionWhatCompositeIs.menu.MenuElementHolder;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListDessertSubmenu implements IterableMenu, MenuElementHolder {


    List<MenuItem> menuItems = new ArrayList<>();

    private static String name = "Desert SubMenu";


    public ListDessertSubmenu() {

        addItem("Awesome Dssert!",
                "Licking counts",
                true,
                2.99);

        addItem("Awesome Dssert!",
                "Blowjob for everyone",
                true,
                0.1);




    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);

    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Collection<MenuElementHolder> getMenuElements() {
        return menuItems.stream().map(menuItem -> (MenuElementHolder) menuItem).toList();
    }

    @Override
    public boolean isContainer() {
        return true;
    }
    @Override
    public MenuIterator createIterator() {
        return new DessertSubMenuIterator(this);
    }

    @Override
    public String getName() {
        return name;
    }
}

package compositePrediction.menu.submenu;

import compositePrediction.MenuItem;
import compositePrediction.iterator.MenuIterator;
import compositePrediction.menu.IterableMenu;


import java.util.ArrayList;
import java.util.List;

public class ListDessertSubmenu implements IterableMenu {
    @Override
    public MenuIterator createIterator() {
        return null;
    }

    List<MenuItem> menuItems = new ArrayList<>();


    public ListDessertSubmenu() {

        addItem("Awesome Dssert!",
                "Licking counts",
                true,
                2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);

    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}

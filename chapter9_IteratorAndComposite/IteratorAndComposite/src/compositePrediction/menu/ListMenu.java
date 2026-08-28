package compositePrediction.menu;


import compositePrediction.MenuItem;
import compositePrediction.iterator.ListMenuIterator;
import compositePrediction.iterator.MenuIterator;

import java.util.ArrayList;
import java.util.List;

public class ListMenu implements IterableMenu {

    List<MenuItem> menuItems = new ArrayList<>();


    public ListMenu() {

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);
    }

    @Override
    public MenuIterator createIterator() {
        return new ListMenuIterator(this);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}

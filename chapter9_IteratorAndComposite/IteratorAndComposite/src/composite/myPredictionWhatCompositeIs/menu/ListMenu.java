package composite.myPredictionWhatCompositeIs.menu;


import composite.myPredictionWhatCompositeIs.MenuItem;
import composite.myPredictionWhatCompositeIs.iterator.ListMenuIterator;
import composite.myPredictionWhatCompositeIs.iterator.MenuIterator;
import composite.myPredictionWhatCompositeIs.menu.submenu.ListDessertSubmenu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListMenu implements IterableMenu, MenuElementHolder {

    List<MenuElementHolder> menuItems = new ArrayList<>();
    private static String name = "Desert SubMenu";


    public ListMenu() {

        addMenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true,
                2.99);

//        addMenuItem("Regular Pancake Breakfast",
//                "Pancakes with fried eggs, sausage",
//                false,
//                2.99);
//        addMenuItem("Blueberry Pancakes",
//                "Pancakes made with fresh blueberries",
//                true,
//                3.49);
//        addMenuItem("Waffles",
//                "Waffles with your choice of blueberries or strawberries",
//                true,
//                3.59);

        menuItems.add(new ListDessertSubmenu());

    }

    public void addMenuItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);
    }


    @Override
    public MenuIterator createIterator() {
        return new ListMenuIterator(this);
    }

    @Override
    public String getName() {
        return ListMenu.name;
    }


    @Override
    public Collection<MenuElementHolder> getMenuElements() {
        return menuItems.stream().toList();
    }

    @Override
    public boolean isContainer() {
        return true;
    }
}

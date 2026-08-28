package iterator.headFirstMenuProblem.menu;

import iterator.headFirstMenuProblem.iterator.CafeMenuIterator;
import iterator.headFirstMenuProblem.iterator.MenuIterator;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CafeMenu implements IterableMenu, MenuElementHolder {
    Map<String, MenuItem> menuItems = new HashMap<String, MenuItem>();


    public CafeMenu() {

        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29);

    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    public Map<String, MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public MenuIterator createIterator() {
        return new CafeMenuIterator(this);
    }

    @Override
    public Collection<MenuElementHolder> getMenuElements() {
        return menuItems.values().stream().map(menuItem -> (MenuElementHolder) menuItem).toList();
    }
}

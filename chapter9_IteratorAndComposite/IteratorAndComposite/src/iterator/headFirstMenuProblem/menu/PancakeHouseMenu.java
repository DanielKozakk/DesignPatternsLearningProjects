package iterator.headFirstMenuProblem.menu;

import iterator.headFirstMenuProblem.iterator.MenuIterator;
import iterator.headFirstMenuProblem.iterator.PankackeHouseMenuIterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements IterableMenu{
    List<MenuItem> menuItems = new ArrayList<>();

    public PancakeHouseMenu() {

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

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description,vegetarian, price);
        this.menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public MenuIterator createIterator() {
        return new PankackeHouseMenuIterator(this);
    }
}

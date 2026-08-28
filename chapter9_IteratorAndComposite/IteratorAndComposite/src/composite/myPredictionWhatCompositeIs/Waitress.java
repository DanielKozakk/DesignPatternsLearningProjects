package composite.myPredictionWhatCompositeIs;


import composite.myPredictionWhatCompositeIs.iterator.MenuIterator;
import composite.myPredictionWhatCompositeIs.menu.IterableMenu;
import composite.myPredictionWhatCompositeIs.menu.MenuElementHolder;

import java.util.List;

public class Waitress {

    List<IterableMenu> menus;

    public Waitress(List<IterableMenu> menus) {
        this.menus = menus;
    }

    public void print() {

        for (IterableMenu menu : menus) {
            printMenu(menu);
        }
    }

    private void printMenu(IterableMenu iterableMenu){
        MenuIterator iterator = iterableMenu.createIterator();

        System.out.println("");
        System.out.println("MENU: " + iterableMenu.getName());
        while (iterator.hasNext()) {

            MenuElementHolder menuElement = iterator.getNext();

            if(menuElement.isContainer()){
                printMenu((IterableMenu) menuElement);
            } else {
                MenuItem menuItem = (MenuItem) menuElement;

                System.out.println("");
                System.out.print(menuItem.getName() + " ");
                System.out.println(menuItem.getPrice() + " ");
                System.out.println(menuItem.getDescription());
            }


        }
    }



}

package compositePrediction;


import compositePrediction.iterator.MenuIterator;
import compositePrediction.menu.IterableMenu;

import java.util.List;

public class Waitress {

    List<IterableMenu> menus;

    public Waitress(List<IterableMenu> menus) {
        this.menus = menus;
    }

    public void print(){

        for(IterableMenu menu : menus){

            MenuIterator iterator = menu.createIterator();
            while(iterator.hasNext()){
                MenuItem menuItem = iterator.getNext();
                System.out.println("");
                System.out.print(menuItem.getName() + " ");
                System.out.println(menuItem.getPrice() + " ");
                System.out.println(menuItem.getDescription());
            }

        }

    }

}

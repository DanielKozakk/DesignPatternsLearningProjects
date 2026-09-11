package composite.bookComposite;

import composite.bookComposite.iterator.MenuIterator;
import composite.bookComposite.menu.IterableMenu;
import composite.bookComposite.menu.MenuComponent;
import composite.bookComposite.menu.MenuItem;

import java.util.List;

public class Waitress {

    MenuComponent menus;

    public Waitress(MenuComponent menus) {
        this.menus = menus;
    }

    public void print(){

        menus.print();
//        for(IterableMenu menu : menus){
//
//            MenuIterator iterator = menu.createIterator();
//            while(iterator.hasNext()){
//                MenuItem menuItem = iterator.getNext();
//                System.out.println("");
//                System.out.print(menuItem.getName() + " ");
//                System.out.println(menuItem.getPrice() + " ");
//                System.out.println(menuItem.getDescription());
//            }
//
//        }

    }

}

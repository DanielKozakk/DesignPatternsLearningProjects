package composite.myPredictionWhatCompositeIs;


import composite.myPredictionWhatCompositeIs.iterator.MenuIterator;
import composite.myPredictionWhatCompositeIs.menu.IterableMenu;
import composite.myPredictionWhatCompositeIs.composite.MenuElementHolder;
import composite.myPredictionWhatCompositeIs.menu.MenuGeneralComposite;

import java.util.List;

public class Waitress {

    MenuGeneralComposite menus;

    public Waitress(MenuGeneralComposite menus) {
        this.menus = menus;
    }

    public void print() {


            MenuIterator iterator = menus.createIterator();

            while (iterator.hasNext()) {
                iterator.getNext().printMenuElementInfo();
            }
    }

}

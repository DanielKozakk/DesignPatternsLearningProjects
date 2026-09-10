package composite.myPredictionWhatCompositeIs;


import composite.myPredictionWhatCompositeIs.composite.*;
import composite.myPredictionWhatCompositeIs.iterator.*;
import composite.myPredictionWhatCompositeIs.menu.*;
import composite.myPredictionWhatCompositeIs.menu.submenu.*;


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

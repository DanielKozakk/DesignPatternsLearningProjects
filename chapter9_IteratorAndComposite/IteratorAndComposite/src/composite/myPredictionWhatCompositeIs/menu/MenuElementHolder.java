package composite.myPredictionWhatCompositeIs.menu;

import java.util.Collection;

public interface MenuElementHolder {
    Collection<MenuElementHolder> getMenuElements();

    boolean isContainer();
}

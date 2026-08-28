
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import composite.myPredictionWhatCompositeIs.Waitress;
import composite.myPredictionWhatCompositeIs.composite.MenuElementHolder;
import composite.myPredictionWhatCompositeIs.menu.IterableMenu;
import composite.myPredictionWhatCompositeIs.menu.ListMenu;
import composite.myPredictionWhatCompositeIs.menu.MenuGeneralComposite;

void main() {
  List<MenuElementHolder> list = List.of(new ListMenu());
  MenuGeneralComposite menuGeneralComposite = new MenuGeneralComposite(list);
    Waitress waitress = new Waitress(menuGeneralComposite);
    waitress.print();
}




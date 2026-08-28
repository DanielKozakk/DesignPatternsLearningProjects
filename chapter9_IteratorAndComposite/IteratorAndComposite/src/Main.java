
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import composite.myPredictionWhatCompositeIs.Waitress;
import composite.myPredictionWhatCompositeIs.menu.IterableMenu;
import composite.myPredictionWhatCompositeIs.menu.ListMenu;

void main() {
  List<IterableMenu> list = List.of(new ListMenu());
    Waitress waitress = new Waitress(list);
    waitress.print();
}




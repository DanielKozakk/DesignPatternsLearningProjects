
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import compositePrediction.Waitress;
import compositePrediction.menu.IterableMenu;
import compositePrediction.menu.ListMenu;

void main() {
  List<IterableMenu> list = List.of(new ListMenu());
    Waitress waitress = new Waitress(list);
    waitress.print();
}




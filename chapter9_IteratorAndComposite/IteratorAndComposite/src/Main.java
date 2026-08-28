
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import compositePrediction.Waitress;
import compositePrediction.menu.IterableMenu;
import compositePrediction.menu.ListMenu;
import compositePrediction.menu.submenu.ListDessertSubmenu;

void main() {
  List<IterableMenu> list = List.of(new ListMenu(), new ListDessertSubmenu());
    Waitress waitress = new Waitress(list);
    waitress.print();
}




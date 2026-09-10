
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import composite.bookComposite.Waitress;
import composite.bookComposite.menu.CafeMenu;
import composite.bookComposite.menu.DinerMenu;
import composite.bookComposite.menu.IterableMenu;
import composite.bookComposite.menu.PancakeHouseMenu;

void main() {

    List<IterableMenu> list = List.of(new CafeMenu(), new DinerMenu(), new PancakeHouseMenu());
    Waitress waitress = new Waitress(list);

    waitress.print();

}




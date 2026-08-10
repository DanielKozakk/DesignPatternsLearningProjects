import iterator.headFirstMenuProblem.Waitress;
import iterator.headFirstMenuProblem.menu.DinerMenu;
import iterator.headFirstMenuProblem.menu.IterableMenu;
import iterator.headFirstMenuProblem.menu.PancakeHouseMenu;
import iterator.socialNetworkRefactoringGuru.Profile;
import iterator.socialNetworkRefactoringGuru.SocialSpammer;
import iterator.socialNetworkRefactoringGuru.collection.Facebook;
import iterator.socialNetworkRefactoringGuru.collection.SocialNetwork;
import iterator.socialNetworkRefactoringGuru.iterator.ProfileIterator;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
    List<IterableMenu> menus = new ArrayList<>(){{
        add(new DinerMenu());
        add(new PancakeHouseMenu());
    }};

    Waitress waitress = new Waitress(menus);
    waitress.print();
}




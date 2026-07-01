import enumerationAdapter.adapter.EnumerationAdapter;
import enumerationAdapter.client.ClientOfEnumeration;
import ownImplementation.adapter.SquareMeterAdapter;
import ownImplementation.client.Apartment;
import ownImplementation.service.SquareLegacyCounterService;
import refactoringGuruJavaExample.adapters.SquarePegAdapter;
import refactoringGuruJavaExample.round.RoundHole;
import refactoringGuruJavaExample.square.SquarePeg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//    SquareLegacyCounterService squareLegacyCounterService = new SquareLegacyCounterService();
//    SquareMeterAdapter squareMeterAdapter = new SquareMeterAdapter(squareLegacyCounterService, 2,2);
//    Apartment apartment = new Apartment(squareMeterAdapter);
//
//    System.out.println(apartment.isApartmentLarge());

    ClientOfEnumeration client = new ClientOfEnumeration();

    List list = new ArrayList<>();
    Iterator listIterator = list.iterator();
    EnumerationAdapter enumerationAdapter = new EnumerationAdapter(listIterator);

    ClientOfEnumeration clientOfEnumeration = new ClientOfEnumeration();
    System.out.println(clientOfEnumeration.getEnumeration(enumerationAdapter));
}


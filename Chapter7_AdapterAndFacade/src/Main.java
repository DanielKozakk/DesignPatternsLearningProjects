import enumerationAdapter.adapter.EnumerationAdapter;
import enumerationAdapter.client.ClientOfEnumeration;
import manysubclasses.Sub1;
import manysubclasses.Sub2;
import manysubclasses.SubAdapter;
import manysubclasses.Superclass;
import ownImplementation.adapter.SquareMeterAdapter;
import ownImplementation.client.Apartment;
import ownImplementation.service.SquareLegacyCounterService;
import refactoringGuruJavaExample.adapters.SquarePegAdapter;
import refactoringGuruJavaExample.round.RoundHole;
import refactoringGuruJavaExample.square.SquarePeg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    Superclass sub1 = new Sub1("sub1");
    Superclass sub2 = new Sub2("sub1");

    SubAdapter adapter = new SubAdapter("adapter", sub1);

    adapter.addedFunctionality("new");

    System.out.println(sub1.getName());

}


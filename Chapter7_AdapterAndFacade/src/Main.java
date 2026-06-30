import refactoringGuruJavaExample.adapters.SquarePegAdapter;
import refactoringGuruJavaExample.round.RoundHole;
import refactoringGuruJavaExample.square.SquarePeg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    RoundHole roundHole = new RoundHole(5);
    SquarePeg squarePeg = new SquarePeg(8);

    SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

    System.out.println(roundHole.fits(squarePegAdapter));
}

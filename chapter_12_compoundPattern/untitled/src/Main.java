import duckReunion.abstractFactory.AbstractDuckFactory;
import duckReunion.abstractFactory.CountingDuckFactory;
import duckReunion.composite.DuckFlockComposite;
import duckReunion.countingDecorator.QuackCountingDecorator;
import duckReunion.model.Quackable;
import duckReunion.model.goose.Goose;
import duckReunion.model.goose.GooseAdapter;
import duckReunion.observer.Observer;
import duckReunion.observer.QuackableObserver;
import duckReunion.observer.QuackableSubject;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {



}






///  duck reunion

void duckReunion(){
    AbstractDuckFactory abstractDuckFactory = new CountingDuckFactory();
    Quackable flock = createFlock(abstractDuckFactory);
    simulate(flock);
    System.out.println(QuackCountingDecorator.getCount());
}

        Quackable createFlock(AbstractDuckFactory duckFactory) {
            Quackable mallardDuck = duckFactory.createMallardDuck();
            subscribeToNewObserver(mallardDuck, "Mallard Duck Observer");


            Quackable redheadDuck = duckFactory.createRedheadDuck();
            subscribeToNewObserver(redheadDuck, "Redhead Observer");

            Quackable rubberDuck = duckFactory.createRubberDuck();
            subscribeToNewObserver(rubberDuck, "Rubber Duck Observer");
            Quackable duckCall = duckFactory.createDuckCall();
            subscribeToNewObserver(duckCall, "Duck Call Observer");

            Quackable gooseDuck = new GooseAdapter(new Goose());
            subscribeToNewObserver(gooseDuck, "Goose Duck Adapter Observer");
            Quackable gregariousSubflock = createSubFlockOfGregariousDucks(duckFactory);
            subscribeToNewObserver(gregariousSubflock, "Gregarious Duck Observer");

            List<Quackable> list = List.of(mallardDuck, redheadDuck, rubberDuck, duckCall, gooseDuck, gregariousSubflock);

            return new DuckFlockComposite(list);

        }

        void subscribeToNewObserver(QuackableSubject observable, String newObserverName) {
            QuackableObserver newObserver = new Observer(newObserverName);
            observable.subscribe(newObserver);
        }

        Quackable createSubFlockOfGregariousDucks(AbstractDuckFactory duckFactory) {

            Quackable first = duckFactory.createGregariousDuck();
            Quackable second = duckFactory.createGregariousDuck();
            Quackable third = duckFactory.createGregariousDuck();

            List<Quackable> gregariousSubFlock = List.of(first, second, third);
            return new DuckFlockComposite(gregariousSubFlock);

        }


        void simulate(Quackable duck) {
            duck.quack();
        }


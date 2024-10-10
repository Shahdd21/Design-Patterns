package behavioral.mediator.mediator_exercise;


public class Main {
    public static void main(String[] args) {

        ControlTowerMediator controlTowerMediator = new ControlTower();

        Airplane travel = new Airplane("Travel", controlTowerMediator);
        Airplane commercial = new Airplane("Commercial", controlTowerMediator);

        travel.requestLanding();
        commercial.requestTakeoff();

    }
}
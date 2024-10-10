package behavioral.mediator.mediator_exercise;

public class ControlTower implements ControlTowerMediator{

    public ControlTower() {

    }

    @Override
    public void requestLanding(Airplane airplane, String request) {
        airplane.receiveNotification("Recieved: "+ request+"\n Answer: go land");
    }

    @Override
    public void requestTakeoff(Airplane airplane, String request) {
        airplane.receiveNotification("Recieved: "+request+"\n Answer: take off");
    }
}

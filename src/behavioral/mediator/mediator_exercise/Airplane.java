package behavioral.mediator.mediator_exercise;

public class Airplane {

    private String type;
    private final ControlTowerMediator controlTowerMediator;

    public Airplane(String type, ControlTowerMediator controlTowerMediator) {
        this.type = type;
        this.controlTowerMediator = controlTowerMediator;
    }

    public String getType() {
        return type;
    }

    public void requestLanding(){
        controlTowerMediator.requestLanding(this,getType()+" airplane is requesting to land");
    }

    public void requestTakeoff(){
        controlTowerMediator.requestTakeoff(this,getType()+" airplane is requesting to take off");
    }

    public void receiveNotification(String message){
        System.out.println(message);
    }
}

package behavioral.mediator.mediator_exercise;

public interface ControlTowerMediator {
    void requestLanding(Airplane airplane, String request);
    void requestTakeoff(Airplane airplane, String request);
}

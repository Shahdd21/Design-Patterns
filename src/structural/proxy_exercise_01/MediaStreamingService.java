package structural.proxy_exercise_01;

public class MediaStreamingService implements StreamingService {

    @Override
    public void display() {
        System.out.println("Displaying videos now");
    }
}

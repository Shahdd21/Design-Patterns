package structural.proxy_exercise_01;

public class VideoStreaming implements MediaStreamingService{
    @Override
    public void display() {
        System.out.println("Streaming restricted videos for admins");
    }
}

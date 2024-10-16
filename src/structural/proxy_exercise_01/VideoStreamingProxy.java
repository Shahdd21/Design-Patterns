package structural.proxy_exercise_01;

public class VideoStreamingProxy implements MediaStreamingService{

    private VideoStreaming videoStreaming;
    private UserType userType;

    public VideoStreamingProxy(UserType userType) {
        this.userType = userType;
    }

    @Override
    public void display() {
        if(userType == UserType.CUSTOMER)
            System.out.println("Doesn't have access");
        else{
            videoStreaming = new VideoStreaming();
            videoStreaming.display();
        }
    }
}

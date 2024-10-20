package structural.proxy_exercise_01;

public class MediaStreamingServiceProxy implements StreamingService {

    private final MediaStreamingService mediaStreamingService;
    private UserRole userRole;

    public MediaStreamingServiceProxy(MediaStreamingService mediaStreamingService, UserRole userRole) {
        this.mediaStreamingService = mediaStreamingService;
        this.userRole = userRole;
    }

    @Override
    public void display() {
        if(userRole == UserRole.CUSTOMER){
            System.out.println("Permission Denied.");
        }
        else{
            System.out.println("Permission provided");
            mediaStreamingService.display();
        }
    }
}

package ultimate;

public class ThirdPartyAPI implements ThirdPartyAPIProxy{
    public void processMessage(String message){
        System.out.println("Processing messages");
    }
}

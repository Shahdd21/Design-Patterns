package ultimate;

import java.util.HashMap;
import java.util.Map;

public class ThirdPartyAPICachingProxy implements ThirdPartyAPIProxy{

    private ThirdPartyAPI thirdPartyAPI;
    private Map<String,String> cachedMessages ;

    public ThirdPartyAPICachingProxy(ThirdPartyAPI thirdPartyAPI) {
        this.thirdPartyAPI = thirdPartyAPI;
        cachedMessages = new HashMap<>();
    }

    @Override
    public void processMessage(String message) {
        if(cachedMessages.containsKey(message)) {
            System.out.println("Retrieving from cache");
            cachedMessages.get(message);
        }
        else{
            thirdPartyAPI.processMessage(message);
            cachedMessages.put(message, message+" after being processed");
        }
    }
}

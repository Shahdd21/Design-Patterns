package behavioral.mediator;

import java.util.*;

public class ChatManagement implements ChatMediator{

    private final Map<String,List<User>> groups;

    public ChatManagement() {
        groups = new HashMap<>();
    }

    @Override
    public void sendDirectMessage(String message, User fromUser, User toUser) {
        System.out.println("Sending message: "+message+"to user: "
                +toUser.getName()+" from user: "+fromUser.getName());

        toUser.receiveDirectMessage(message,fromUser);
    }

    @Override
    public void sendGroupMessage(String message, User fromUser, String groupName) {
        System.out.println("Sending message: "+message+"to Group: "
                +groupName+" from user: "+fromUser.getName());

        for(User user : groups.get(groupName)){
            if(!user.getName().equals(fromUser.getName())){
                user.receiveGroupMessage(message,groupName,fromUser);
            }
        }
    }

    @Override
    public void registerUserIntoGroup(User user, String groupName) {
        if(groups.containsKey(groupName)){
            groups.get(groupName).add(user);
        }
        else{
            groups.put(groupName, new ArrayList<>());
            groups.get(groupName).add(user);
        }
    }
}

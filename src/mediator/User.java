package mediator;

public class User {
    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void sendDirectMessage(String message, User toUser){
        chatMediator.sendDirectMessage(message,this,toUser);
    }

    public void sendGroupMessage(String message, String groupName){
        chatMediator.sendGroupMessage(message,this, groupName);
    }

    public void receiveDirectMessage(String message, User fromUser){
        System.out.println("User: "+getName()+" is receiving message: "+message+"from user: "
                +fromUser.getName());
    }

    public void receiveGroupMessage(String message,String groupName, User fromUser){
        System.out.println("User: "+getName()+" is receiving message: "+message+"from user: "
                +fromUser.getName() + "in group: "+groupName);
    }
}

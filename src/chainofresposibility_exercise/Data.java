package chainofresposibility_exercise;

public class Data {

    private String type;
    private int size;
    private String user;

    public Data(String user,String type, int size) {
        this.user = user;
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public String getUser() {
        return user;
    }
}

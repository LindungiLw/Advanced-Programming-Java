package object_class.ex4;

public class UserV2 {
    private String id;
    public UserV2(String id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj;
        return id.equals(user.id);
    }
}

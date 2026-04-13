import java.util.ArrayList;
import java.util.List;

public class User extends Person {

    private final List<User> followers = new ArrayList<>();
    private final List<User> following = new ArrayList<>();
    private final List<String> feed = new ArrayList<>();

    public User(String name){
        super(name);
    }

    public void addFollower(User u){
        this.followers.add(u);
        u.following.add(this);
    }


    public void send(String message){
        for(User u: followers)
        {
            u.getUpdate(message);
        }
    }

    public void getUpdate(String message)
    {
        feed.add(message);
    }

    @Override
    public String toString() {
        return getName()
                + "; followers: " + namesOf(this.followers)
                + "; following: " + namesOf(this.following)
                + "; feed: " + this.feed;
    }

    private List<String> namesOf(List<User> users) {
        List<String> names = new ArrayList<>();
        for (User u : users) {
            names.add(u.getName());
        }
        return names;
    }

}

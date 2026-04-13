import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User extends Person {

    private final Set<User> following = new HashSet<>();
    private final Set<User> followers = new HashSet<>();
    private final List<String> feed = new ArrayList<>();

    public User(String name)
    {
        super(name);
    }

    public synchronized void send(String message){
        if(message != null){
            for (User u : followers){
                u.receive(message);
            }
        }
    }

    public synchronized void receive(String message){
        this.feed.add(message);
    }

    public synchronized void addFollower(User u){
        this.followers.add(u);
        u.follow(this);
    }

    public synchronized void follow(User u)
    {
        this.following.add(u);
    }

    public String toString()
    {
        return getName() + "; followers: " + namesOf(followers) + "; following: " + namesOf(following) + "; feed: " + feed;
    }

    public String namesOf(Set<User> users){
        int count = users.size();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(User u : users){
            sb.append(u.getName());
            if(count > 1){
                sb.append(",");
            }
            count--;
        }
        sb.append("]");
        return sb.toString();
    }


}

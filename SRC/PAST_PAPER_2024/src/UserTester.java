import java.util.Arrays;

public class UserTester {


    static void main() {

        User[] users = { new User("Al"), new User("Bo"), new User("Ed") };
        users[0].addFollower(users[1]);
        users[0].addFollower(users[2]);
        users[0].addFollower(users[1]); // !
        users[1].addFollower(users[2]);
        users[2].addFollower(users[0]);
        users[2].addFollower(users[2]); // !
        users[0].send("Hello!");
        users[1].send("Yay Java!");
        Arrays.stream(users).forEach(System.out::println);

    }



}

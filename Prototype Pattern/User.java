import java.util.ArrayList;
 
import com.classes.User;
 
public class UserService {
    ArrayList users;
     
    public UserService() {
        users = new ArrayList();
        users.add(new User("Krish","Krish@gmail.com"));
        users.add(new User("Niron","Niron@gmail.com"));
        users.add(new User("Roshni","Roshni@gmail.com"));
        users.add(new User("Kalana","Kalana@gmail.com"));
        users.add(new User("Shani","Shani@gmail.com"));
        users.add(new User("Malindu","Malindu@gmail.com"));
    }
    public ArrayList getUsers(){
        return users;
    }
}
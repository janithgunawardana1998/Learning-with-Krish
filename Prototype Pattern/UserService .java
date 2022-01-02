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
}package com.classes;
 
import java.util.ArrayList;
import java.util.List;
 
import com.service.UserService;
 
public class UserDetails implements Cloneable{
    private ArrayList userList;
     
    public UserDetails() {
        this.userList=new ArrayList<>();
    }
     
    public UserDetails(ArrayList users) {
        this.userList = users;
    }
     
    public void getUsers() {
        UserService s = new UserService();
        this.userList = s.getUsers();
    }
     
    public ArrayList getUsersList(){
        return userList;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
            List temp = new ArrayList();
            for(User s : this.getUsersList()){
                temp.add(s);
            }
            return new UserDetails((ArrayList) temp);
    }
}
package two.can.User.model;

import java.util.ArrayList;

//import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;

public class User {


    @Id
    String username;
    String password;
    //@ApiModelProperty(required = false, hidden = true)
    ArrayList<Friends> friendslist = new ArrayList<Friends>();//friends list
    ArrayList<Group> grouplist = new ArrayList<Group>();//group list

    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public ArrayList<Friends> getFriends(){
        return this.friendslist;
    }
    
    public void setFriends(ArrayList<Friends> list){
        list = this.friendslist;
    }
    
    public void addFriend(Friends friend){
        friendslist.add(friend);
    }


    public ArrayList<Group> getGroup(){
        return this.grouplist;
    }
    
    public void setGroup(ArrayList<Group> list){
        list = this.grouplist;
    }
    
    public void addGroup(Group group){
        grouplist.add(group);
    }
        
}
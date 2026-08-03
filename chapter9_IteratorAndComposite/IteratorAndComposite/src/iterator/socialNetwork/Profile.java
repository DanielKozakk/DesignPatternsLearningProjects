package iterator.socialNetwork;

import iterator.socialNetwork.collection.Facebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Profile {
    int id;
    String company;

    List<Profile> friends = new ArrayList<>();

    public Profile(String company, Facebook facebook) {
        this.company = company;
        id = Facebook.createNewId();
        facebook.addProfile(this);

    }

    public void addFriend(Profile profile){
        friends.add(profile);
    }

    public void receiveMessage(String message){
        System.out.println("ProfileID: " + id + "received message: " + message);
    }

    public int getId() {
        return id;
    }

    public List<Profile> getFriends(){
        return friends;
    }

    public List<Profile> getCoworkers(){
        return friends.stream().filter(friend -> Objects.equals(friend.company, company)).toList();
    }

    public int getFriendsCount(){
        return friends.size();
    }
}

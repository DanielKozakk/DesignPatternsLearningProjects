package iterator.socialNetwork.collection;

import iterator.socialNetwork.Profile;
import iterator.socialNetwork.iterator.FacebookIterator;
import iterator.socialNetwork.iterator.IteratorType;
import iterator.socialNetwork.iterator.ProfileIterator;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork {

    private static int currentProfileId = 0;
    List<Profile> profiles = new ArrayList<>();

    public static int createNewId(){
        int current = currentProfileId;
        currentProfileId ++;
        return current;
    }

    public void addProfile(Profile profile){
        profiles.add(profile);
    }
    public List<Profile> getProfileFriends(int profileId, IteratorType type){

        List<Profile> friends = null;
        if(type.equals(IteratorType.FRIENDS)){
            friends = profiles.get(profileId).getFriends();
        } else {
            friends = profiles.get(profileId).getCoworkers();
        }

        return friends;
    }



    @Override
    public ProfileIterator createFriendsIterator(int profileId) {
        return new FacebookIterator(this, profileId, IteratorType.FRIENDS);
    }

    @Override
    public ProfileIterator createCoworkersIterator(int profileId) {
        return new FacebookIterator(this, profileId, IteratorType.COWORKERS);
    }
}

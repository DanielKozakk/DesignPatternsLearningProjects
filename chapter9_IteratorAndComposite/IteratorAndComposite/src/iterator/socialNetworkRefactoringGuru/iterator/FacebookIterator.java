package iterator.socialNetworkRefactoringGuru.iterator;

import iterator.socialNetworkRefactoringGuru.Profile;
import iterator.socialNetworkRefactoringGuru.collection.Facebook;

import java.util.List;

public class FacebookIterator implements ProfileIterator {

    Facebook facebook;
    List<Profile> requestedFriends;
    IteratorType type;

    int currentState = 0;


    public FacebookIterator(Facebook facebook, int profileId, IteratorType type) {
        this.facebook = facebook;
        this.requestedFriends = facebook.getProfileFriends(profileId, type);
        this.type = type;
    }

    @Override
    public Profile getNext() {
        Profile result = null;
        if(hasMore()){
            result = requestedFriends.get(currentState);
            currentState++;
        }
        return result;
    }

    @Override
    public boolean hasMore() {
        return currentState < requestedFriends.size();
    }

}

package iterator.socialNetwork;

import iterator.socialNetwork.iterator.ProfileIterator;

public class SocialSpammer {

    public void send(ProfileIterator iterator, String message){

        while(iterator.hasMore()){
            Profile profile = iterator.getNext();
            profile.receiveMessage(message);
        }
    }
}

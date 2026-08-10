package iterator.socialNetworkRefactoringGuru;

import iterator.socialNetworkRefactoringGuru.collection.Facebook;
import iterator.socialNetworkRefactoringGuru.collection.SocialNetwork;
import iterator.socialNetworkRefactoringGuru.iterator.ProfileIterator;

public class Application {

    public void main(){
        Facebook network = new Facebook();
        SocialSpammer spammer = new SocialSpammer();

        Profile profile1 = new Profile("A", network);
        Profile profile2 = new Profile("A", network);
        Profile profile3 = new Profile("B", network);

        profile1.addFriend(profile2);
        profile1.addFriend(profile3);

        sendSpamToCoworkers(network, spammer, profile1.getId());
    }

    public void sendSpamToFriends(SocialNetwork network, SocialSpammer spammer, int profileId) {
        ProfileIterator iterator = network.createFriendsIterator(profileId);
        spammer.send(iterator, "message to friends");
    }

    public void sendSpamToCoworkers(SocialNetwork network, SocialSpammer spammer, int profileId) {
        ProfileIterator iterator = network.createCoworkersIterator(profileId);
        spammer.send(iterator, "message to coworkers");
    }
}

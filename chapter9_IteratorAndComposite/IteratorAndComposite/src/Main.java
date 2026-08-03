import iterator.graph.Node;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import iterator.graph.iterator.Iterator;
import iterator.socialNetwork.Profile;
import iterator.socialNetwork.SocialSpammer;
import iterator.socialNetwork.collection.Facebook;
import iterator.socialNetwork.collection.SocialNetwork;
import iterator.socialNetwork.iterator.ProfileIterator;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
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


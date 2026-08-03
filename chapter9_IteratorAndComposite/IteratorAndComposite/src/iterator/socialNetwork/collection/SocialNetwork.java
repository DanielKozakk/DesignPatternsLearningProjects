package iterator.socialNetwork.collection;

import iterator.socialNetwork.Profile;
import iterator.socialNetwork.iterator.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(int profileId);
    ProfileIterator createCoworkersIterator(int profileId);
}

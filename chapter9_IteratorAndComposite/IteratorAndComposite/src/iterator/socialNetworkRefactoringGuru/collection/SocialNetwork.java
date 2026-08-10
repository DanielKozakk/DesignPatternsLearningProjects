package iterator.socialNetworkRefactoringGuru.collection;

import iterator.socialNetworkRefactoringGuru.iterator.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(int profileId);
    ProfileIterator createCoworkersIterator(int profileId);
}

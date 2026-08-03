package iterator.socialNetwork.iterator;

import iterator.socialNetwork.Profile;

public interface ProfileIterator {
    Profile getNext();
    boolean hasMore();
}

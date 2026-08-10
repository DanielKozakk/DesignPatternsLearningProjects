package iterator.socialNetworkRefactoringGuru.iterator;

import iterator.socialNetworkRefactoringGuru.Profile;

public interface ProfileIterator {
    Profile getNext();
    boolean hasMore();
}

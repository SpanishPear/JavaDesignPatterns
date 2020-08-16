package Behavioural.Iterator.Iterators;

import Behavioural.Iterator.Profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}

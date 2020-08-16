package Behavioural.Iterator.SocialNetworks;

import Behavioural.Iterator.Iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}

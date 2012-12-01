/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titanPlayer.bll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Kyle
 */
public class Library {
    
    List<Song> songs;
    UserAccount user;
    
    public Library() {
        songs = new ArrayList<>();
    }
    
    public void addSong(Song songToAdd) {
        songs.add(songToAdd);
    }
    
    public int songCount() {
        return songs.size();
    }

    public void removeSong(Song songToRemove) {
        songs.remove(songToRemove);
    }
    
    public void sortByTitle() {
        Collections.sort(songs, new TitleComparator());
    }
    
    public void sortByArtist() {
        Collections.sort(songs, new ArtistComparator());
    }
    
    public Song getSong(int index) {
        return songs.get(index);
    }

    public void assignUser(UserAccount user) {
        this.user = user;
    }
    
    public UserAccount getUser() {
        return this.user;
    }
    
}

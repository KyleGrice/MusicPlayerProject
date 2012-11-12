/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titanPlayer.bll;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kyle
 */
public class Library {
    
    List<Song> songs;
    
    public Library() {
        songs = new ArrayList<Song>();
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
}

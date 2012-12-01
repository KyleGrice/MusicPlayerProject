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
public class Playlist {
    
    private String playlistName;
    ArrayList<Song> songs;
    
    public Playlist(String nameOfList) {
        this.playlistName = nameOfList;
        songs = new ArrayList<>();
    }
    
    public String getName() {
        return this.playlistName;
    }
    
    public void addSong(Song songToAdd) {
        songs.add(songToAdd);
    }
    
    public int songCount() {
        return songs.size();
    }
    
    public ArrayList<Song> getSongList() {
        return songs;
    }
}

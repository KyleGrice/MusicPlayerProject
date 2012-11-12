/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titanPlayer.bll;

/**
 *
 * @author Kyle
 */
public class Playlist {
    
    private String playlistName;
    private int currentSongIndex;
    
    public Playlist(String nameOfList) {
        this.playlistName = nameOfList;
        this.currentSongIndex = 0;
    }
    
    public String getName() {
        return this.playlistName;
    }
    
    public void skipSong() {
        this.currentSongIndex++;
    }
    
    public int getCurrentSongIndex() {
        return this.currentSongIndex;
    }
    
    public void stopSong() {
        this.currentSongIndex = -1;
    }
}

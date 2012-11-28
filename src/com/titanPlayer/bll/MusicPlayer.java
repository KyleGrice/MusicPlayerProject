/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titanPlayer.bll;

/**
 *
 * @author Kyle
 */
public class MusicPlayer {
    
    private int currentSongIndex;
    private boolean isPlaying;
    
    public MusicPlayer() {
        currentSongIndex = 0;
        isPlaying = false;
    }
    
    public void skipSong() {
        this.currentSongIndex++;
    }
    
    public int getCurrentSongIndex() {
        return this.currentSongIndex;
    }
    
    public void stopSong() {
        isPlaying = false;
    }
    
    public boolean getPlayingStatus() {
        return isPlaying;
    }
}

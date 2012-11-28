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
    
    public Playlist(String nameOfList) {
        this.playlistName = nameOfList;
    }
    
    public String getName() {
        return this.playlistName;
    }
}

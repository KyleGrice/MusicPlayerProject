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
public class PlaylistRepository {
    List<Playlist> playlists;
    
    public PlaylistRepository() {
        playlists = new ArrayList<>();
    }
    
    public void addPlaylist(Playlist playlistToAdd) {
        playlists.add(playlistToAdd);
    }
    
    public int playlistCount() {
        return playlists.size();
    }
    
    public boolean playlistExists(String nameOfPlaylist) {
        boolean playlistExists = false;
        for (int i = 0; i < playlists.size(); i++) {
            if (playlists.get(i).getName().equals(nameOfPlaylist)) {
                playlistExists = true;
            }
        }
        
        return playlistExists;
    }
    
    public Playlist getPlaylist(String nameOfPlaylist) {
        int index = 0;
        
        for (int i = 0; i < playlists.size(); i++) {
            if (playlists.get(i).getName().equals(nameOfPlaylist)) {
                index = i;
            }
        }
        
        return playlists.get(index);
    }
}

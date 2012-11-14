/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titanPlayer.bll;

import java.util.Comparator;

/**
 *
 * @author Kyle
 */
public class Song implements Comparable<Song>{
    
    private String title;
    private String artist;
    
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getArtist() {
        return this.artist;
    }

    @Override
    public int compareTo(Song o) {
        return title.compareTo(o.title);
    }
    
}


// Define two comparators
// I am not sure of the best place to put these yet;
// should they stay here, or get their own file?
class TitleComparator implements Comparator {
    
    @Override
    public int compare(Object song1, Object song2) {
        
        String song1Title = ((Song)song1).getTitle();
        String song2Title = ((Song)song2).getTitle();
        
        return song1Title.compareTo(song2Title);
    }
}

class ArtistComparator implements Comparator {
    
    @Override
    public int compare(Object song1, Object song2) {
        
        String song1Artist = ((Song)song1).getArtist();
        String song2Artist = ((Song)song2).getArtist();
        
        return song1Artist.compareTo(song2Artist);
    }
}
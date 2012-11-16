/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titanPlayer.bll;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Kyle
 */
public class MP3Filter extends FileFilter{

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        
        String path = f.getAbsolutePath().toLowerCase();
        String extension = "mp3";
        
        if ((path.endsWith(extension) && (path.charAt(path.length() - extension.length() - 1)) == '.')) {
            return true;
        }
        
//        String extension = getExtension(f);
//        if (extension.equals("mp3")) {
//            return true;
//        }
        
        return false;
    }

    @Override
    public String getDescription() {
        return "mp3 files";
    }
    
    private String getExtension(File f) {
        String fileName = f.getAbsolutePath().toLowerCase();
        int index = fileName.lastIndexOf('.');
        if (index > 0 && index < fileName.length() - 1) {
            return fileName.substring(index + 1).toLowerCase();
        }
        else {
            return "";
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gurhan
 */
public class StringUtils {
    
    public static boolean included(String word, String searched) {
        if (word.length() == 0 || searched.length() == 0) {
            return false;
        }
        word = word.toUpperCase();
        searched = searched.toUpperCase();
        word = word.trim();
        searched = searched.trim();
        
        if (word.contains(searched)) {
            return true;
        }
        else {
            return false;
        }
    }
    
}

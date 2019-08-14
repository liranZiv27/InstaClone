package com.liran.instaclone.Utils;

/**
 * Created by Liran on 14/08/2019.
 */

public class StringManipulation {

    public static String expandUsername(String username){
        return username.replace(".", " ");
    }

    public static String condenseUsername(String username){
        return username.replace(" " , ".");
    }
}

package com.example.xyz.socket;

import java.io.File;

public class Furl {

    public static void main(String[] args) throws Exception {
        File file = new File("123.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
    }

}

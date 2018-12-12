package com.example.dimitri.myapplication;

public class DataManager {

    private static DataManager INSTANCE;

    private DataManager(){
    }

    public static DataManager getInstance(){
        if (INSTANCE == null){
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

}

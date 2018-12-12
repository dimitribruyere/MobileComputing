package com.example.dimitri.myapplication;

public class DataManager {

    private static DataManager INSTANCE;
    public String name;

    private DataManager(){
    }

    public static DataManager getInstance(){
        if (INSTANCE == null){
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    public static void setInstance(DataManager INSTANCE) {
        DataManager.INSTANCE = INSTANCE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

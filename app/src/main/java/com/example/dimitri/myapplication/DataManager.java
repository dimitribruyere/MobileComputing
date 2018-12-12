package com.example.dimitri.myapplication;

import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private static DataManager INSTANCE;
    public List<String> names;

    private DataManager(){
        names = new ArrayList<>();
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

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void addName(String name){
        this.names.add(name);
    }
}

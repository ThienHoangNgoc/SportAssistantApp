package com.example.sportassistantapp.recyclerViewItemModels;

import java.util.ArrayList;

public class TrainingDayItem {

    private ArrayList<ExerciseItem> itemList;

    public TrainingDayItem(){

    }

    public TrainingDayItem(ArrayList<ExerciseItem> itemList) {
        this.itemList = itemList;
    }

    public ArrayList<ExerciseItem> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<ExerciseItem> itemList) {
        this.itemList = itemList;
    }
}

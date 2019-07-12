package com.example.sportassistantapp.recyclerViewItemModels;

import java.util.ArrayList;

public class TrainingDayItem {

    private String workOutDayTitle;
    private ArrayList<ExerciseItem> itemList;


    public TrainingDayItem() {

    }

    public TrainingDayItem(String workOutDayTitle, ArrayList<ExerciseItem> itemList) {
        this.workOutDayTitle = workOutDayTitle;
        this.itemList = itemList;
    }

    public String getWorkOutDayTitle() {
        return workOutDayTitle;
    }

    public void setWorkOutDayTitle(String workOutDayTitle) {
        this.workOutDayTitle = workOutDayTitle;
    }

    public ArrayList<ExerciseItem> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<ExerciseItem> itemList) {
        this.itemList = itemList;
    }
}

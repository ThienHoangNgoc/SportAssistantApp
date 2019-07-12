package com.example.sportassistantapp.recyclerViewItemModels;

import java.util.ArrayList;

public class WorkoutDayItem {

    private String workOutDayTitle;
    private ArrayList<ExerciseItem> itemList;


    public WorkoutDayItem() {

    }

    public WorkoutDayItem(String workOutDayTitle, ArrayList<ExerciseItem> itemList) {
        this.workOutDayTitle = workOutDayTitle;
        this.itemList = itemList;
    }

    public String getWorkOutDayTitle() {
        return workOutDayTitle;
    }

    public void setWorkOutDayTitle(String workOutDayTitle) {
        this.workOutDayTitle = workOutDayTitle;
    }

    public ArrayList<ExerciseItem> getAllExerciseItems() {
        return itemList;
    }

    public void setAllExerciseItems(ArrayList<ExerciseItem> itemList) {
        this.itemList = itemList;
    }
}

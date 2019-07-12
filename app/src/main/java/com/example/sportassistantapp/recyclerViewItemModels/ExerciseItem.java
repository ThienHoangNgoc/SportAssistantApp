package com.example.sportassistantapp.recyclerViewItemModels;

public class ExerciseItem {

    private String name;
    private String sets;
    private String information;

    public ExerciseItem() {

    }

    public ExerciseItem(String name, String sets, String information) {
        this.name = name;
        this.sets = sets;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSets() {
        return sets;
    }

    public void setSets(String sets) {
        this.sets = sets;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}

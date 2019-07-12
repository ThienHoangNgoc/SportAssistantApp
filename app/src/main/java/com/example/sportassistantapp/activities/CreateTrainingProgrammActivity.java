package com.example.sportassistantapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sportassistantapp.R;
import com.example.sportassistantapp.recyclerViewAdapter.WorkoutDayAdapter;
import com.example.sportassistantapp.recyclerViewItemModels.ExerciseItem;
import com.example.sportassistantapp.recyclerViewItemModels.WorkoutDayItem;

import java.util.ArrayList;


public class CreateTrainingProgrammActivity extends AppCompatActivity {

    ArrayList<WorkoutDayItem> allData;
    RecyclerView workOutDayRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_training_programm);

        workOutDayRecyclerView = findViewById(R.id.workout_day_recycler_view_list);
        allData = new ArrayList<>();
        WorkoutDayItem w1 = new WorkoutDayItem();
        WorkoutDayItem w2 = new WorkoutDayItem();
        WorkoutDayItem w3 = new WorkoutDayItem();
        allData.add(w1);
        allData.add(w2);
        allData.add(w3);
        workOutDayRecyclerView.setHasFixedSize(true);
        WorkoutDayAdapter adapter = new WorkoutDayAdapter(allData, this);
        workOutDayRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        workOutDayRecyclerView.setAdapter(adapter);


    }
}

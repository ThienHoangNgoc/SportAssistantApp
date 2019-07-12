package com.example.sportassistantapp.recyclerViewAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sportassistantapp.R;
import com.example.sportassistantapp.recyclerViewItemModels.WorkoutDayItem;

import java.util.ArrayList;

public class WorkoutDayAdapter extends RecyclerView.Adapter<WorkoutDayAdapter.ItemRowHolder> {

    private ArrayList<WorkoutDayItem> dataList;
    private Context context;

    public WorkoutDayAdapter(ArrayList<WorkoutDayItem> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }


    @NonNull
    @Override
    public ItemRowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.create_training_program_workout_list_item, null);
        ItemRowHolder itemRowHolder = new ItemRowHolder(itemView);
        return itemRowHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemRowHolder holder, int position) {
        final String workoutDayTitle = dataList.get(position).getWorkOutDayTitle();
        ArrayList exerciseItems = dataList.get(position).getAllExerciseItems();
        holder.itemTitle.setText(workoutDayTitle);
        ExerciseAdapter exerciseAdapter = new ExerciseAdapter(context, exerciseItems);
        holder.recyclerViewList.setHasFixedSize(true);
        holder.recyclerViewList.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerViewList.setAdapter(exerciseAdapter);


    }

    @Override
    public int getItemCount() {
        return (null != dataList ? dataList.size() : 0);
    }

    public class ItemRowHolder extends RecyclerView.ViewHolder {

        protected TextView itemTitle;
        protected RecyclerView recyclerViewList;


        public ItemRowHolder(View view) {
            super(view);
            this.itemTitle = view.findViewById(R.id.workout_day_title);
            this.recyclerViewList = view.findViewById(R.id.exercise_recycler_view_list);
        }
    }


}

package com.example.sportassistantapp.recyclerViewAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sportassistantapp.R;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder> {

    public static class ExerciseViewHolder extends RecyclerView.ViewHolder {

        public EditText exerciseNameInput;
        public EditText exerciseSetsInput;
        public EditText exerciseInfoInput;

        public ExerciseViewHolder(@NonNull View itemView) {
            super(itemView);
            exerciseNameInput = itemView.findViewById(R.id.exercise_name_input);
            exerciseSetsInput = itemView.findViewById(R.id.set_quantity_input);
            exerciseInfoInput = itemView.findViewById(R.id.exercise_information_input);
        }
    }

    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.create_training_programm_exercise_list_item, parent, false);
        ExerciseViewHolder viewHolder = new ExerciseViewHolder(layoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}

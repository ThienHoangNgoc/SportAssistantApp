package com.example.sportassistantapp.recyclerViewAdapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sportassistantapp.recyclerViewItemModels.ExerciseItem;

import java.util.ArrayList;

public class TrainingDayAdapter extends RecyclerView.Adapter<TrainingDayAdapter.ItemRowHolder> {

    @NonNull
    @Override
    public ItemRowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemRowHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ItemRowHolder  extends RecyclerView.ViewHolder{

        public ItemRowHolder(View view){
            super(view);
        }
    }

    private ArrayList<ExerciseItem> dataList;
    private Context context;

    public TrainingDayAdapter(Context context, ArrayList<ExerciseItem> dataList){
        this.context = context;
        this.dataList = dataList;
    }


}

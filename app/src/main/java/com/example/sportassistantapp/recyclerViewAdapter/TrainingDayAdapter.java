package com.example.sportassistantapp.recyclerViewAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sportassistantapp.R;
import com.example.sportassistantapp.recyclerViewItemModels.ExerciseItem;

import java.util.ArrayList;

public class TrainingDayAdapter extends RecyclerView.Adapter<TrainingDayAdapter.ItemRowHolder> {

    private ArrayList<ExerciseItem> dataList;
    private Context context;

    public TrainingDayAdapter(ArrayList<ExerciseItem> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }


    @NonNull
    @Override
    public ItemRowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.create_training_program_day_list_item, null);
        ItemRowHolder itemRowHolder = new ItemRowHolder(itemView);
        return itemRowHolder;
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



    public TrainingDayAdapter(Context context, ArrayList<ExerciseItem> dataList){
        this.context = context;
        this.dataList = dataList;
    }


}

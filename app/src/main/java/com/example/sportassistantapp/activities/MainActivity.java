package com.example.sportassistantapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sportassistantapp.R;
import com.example.sportassistantapp.Utils.Utils;
import com.example.sportassistantapp.dao.SportInfoItemDAO;
import com.example.sportassistantapp.roomDB.SportInfoItemDatabase;
import com.example.sportassistantapp.roomDBModel.SportInfoItem;

public class MainActivity extends AppCompatActivity {

    private View nameView;
    private View dateView;
    private View weightView;
    private View repetitionView;
    private TextView nameLabel;
    private TextView dateLabel;
    private TextView weightLabel;
    private TextView repetitionLabel;
    private EditText nameInput;
    private EditText dateInput;
    private EditText weightInput;
    private EditText repetitionInput;

    private SportInfoItemDatabase database = Room.databaseBuilder(this, SportInfoItemDatabase.class, "sportitemdb")
            .allowMainThreadQueries()
            .build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewSetup();
        setLabelNames();
        insertValuesIntoDb(Utils.EditTextToString(nameInput), Utils.EditTextToString(dateInput), Utils.EditTextToString(weightInput), Utils.EditTextToString(repetitionInput));
    }

    private void viewSetup() {
        nameView = findViewById(R.id.sport_entry_name_view);
        dateView = findViewById(R.id.sport_entry_date_view);
        weightView = findViewById(R.id.sport_entry_weight_view);
        repetitionView = findViewById(R.id.sport_entry_repetition_view);
        nameLabel = nameView.findViewById(R.id.sport_item_text_label);
        dateLabel = dateView.findViewById(R.id.sport_item_text_label);
        weightLabel = weightView.findViewById(R.id.sport_item_text_label);
        repetitionLabel = repetitionView.findViewById(R.id.sport_item_text_label);
        nameInput = nameView.findViewById(R.id.sport_item_input);
        dateInput = dateView.findViewById(R.id.sport_item_input);
        weightInput = weightView.findViewById(R.id.sport_item_input);
        repetitionInput = repetitionView.findViewById(R.id.sport_item_input);
    }

    private void setLabelNames() {
        nameLabel.setText(R.string.sport_info_item_title_01);
        dateLabel.setText(R.string.sport_info_item_title_02);
        weightLabel.setText(R.string.sport_info_item_title_03);
        repetitionLabel.setText(R.string.sport_info_item_title_04);
    }

    private void insertValuesIntoDb(String name, String date, String weight, String repetition) {
        SportInfoItemDAO itemDAO = database.getItemDAO();
        SportInfoItem item = new SportInfoItem();
        item.setName(name);
        item.setDate(date);
        item.setWeight(weight);
        item.setRepetitions(repetition);
        itemDAO.insert(item);
    }
}

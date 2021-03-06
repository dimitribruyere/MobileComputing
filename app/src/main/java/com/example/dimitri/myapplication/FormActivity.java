package com.example.dimitri.myapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class FormActivity extends AppCompatActivity
{
    public final static String NAME_KEY = "USER_NAME";

    private Button buttonValidate;
    private EditText editTextName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        initViews();
    }

    private void initViews() {
        buttonValidate = findViewById(R.id.activity_form_button_validate);
        editTextName = findViewById(R.id.activity_form_edittext_name);

        buttonValidate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                saveData();
            }
        });
    }

    private void saveData() {
        String name = editTextName.getText().toString();
        if(!name.isEmpty()){
            DataManager.getInstance().addName(name);
        }
        finish();
    }
}

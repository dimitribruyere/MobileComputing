package com.example.dimitri.myapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private RecyclerView recyclerView;
    private Button buttonNext;
    private NameListAdapter nameListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameListAdapter = new NameListAdapter();

        initViews();
        initList();
    }

    @Override
    protected void onResume() {
        super.onResume();
        nameListAdapter.updateData(DataManager.getInstance().getNames());
    }

    private void initViews(){
        buttonNext = findViewById(R.id.activity_main_button_next);
        recyclerView = findViewById(R.id.activity_main_recyclerview);
        buttonNext.setOnClickListener(this);
    }

    private void initList() {
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(nameListAdapter);
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
//    {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == 1){
//            if (resultCode == RESULT_OK && data.getExtras() != null){
//                String userName = data.getExtras().getString(FormActivity.NAME_KEY);
//                textViewName.setText(userName);
//            }
//        }
//    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.activity_main_button_next:
                Intent intent = new Intent(this, FormActivity.class);
                startActivity(intent);
                break;
        }
    }
}

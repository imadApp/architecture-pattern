package com.app.english.architecturepattern.MVC.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.app.english.architecturepattern.MVC.data.ModelVC;
import com.app.english.architecturepattern.R;

public class MVC extends AppCompatActivity {
     TextView tvShmodel;
     Button getModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);

        tvShmodel = findViewById(R.id.tvShow);
        getModel= findViewById(R.id.getModel);
        getModel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                tvShmodel.setText(getshFromDatabase().getName());
            }
        });

    } public ModelVC getshFromDatabase(){
        return  new ModelVC(100 ,"name" ,"2022/2/2" , "bon");
    }
}
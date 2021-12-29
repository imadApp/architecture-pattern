package com.app.english.architecturepattern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.app.english.architecturepattern.MVC.Ui.MVC;
import com.app.english.architecturepattern.MVP.ui.MVP;
import com.app.english.architecturepattern.MVVM.ui.MVVM;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnclickMVVM(View view) {
        startActivity(new Intent(this , MVVM.class));
    }
    public void OnClickMVC(View view) {
        startActivity(new Intent(this , MVC.class));
    }
    public void OnClickMVP(View view) {
        startActivity(new Intent(this , MVP.class));
    }
}
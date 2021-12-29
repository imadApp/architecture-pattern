package com.app.english.architecturepattern.MVVM.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviderKt;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.app.english.architecturepattern.R;

public class MVVM extends AppCompatActivity {
    MovieViewModel movieViewModel ;
    TextView tvName ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvm);

        tvName = findViewById(R.id.tvName);

         movieViewModel = new
                ViewModelProvider(this).get(MovieViewModel.class);
        movieViewModel.nameMutaleLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                //set data four text
                tvName.setText(s.toString());
            }});
    }

    public void OnClick(View view) {
        //show text four text
          movieViewModel.getName();
    }
}
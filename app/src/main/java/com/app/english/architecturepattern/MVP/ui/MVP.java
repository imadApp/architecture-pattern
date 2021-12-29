package com.app.english.architecturepattern.MVP.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.app.english.architecturepattern.MVP.data.ModelVP;
import com.app.english.architecturepattern.R;

public class MVP extends AppCompatActivity implements MovieName {
    MoviePresenter presenter ;
    TextView Name , Title ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);

        Name = findViewById(R.id.tvName );
        Title = findViewById(R.id.tvTitle );
        presenter = new MoviePresenter(this);
    }
    public void Click(View view) {
        presenter.getMovieName();
    }
    @Override
    public void onGetMovieName(ModelVP model) {
        Name.setText(model.getName());
        Title.setText(model.getTitle());
    }
}
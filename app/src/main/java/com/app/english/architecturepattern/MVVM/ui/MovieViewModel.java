package com.app.english.architecturepattern.MVVM.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.app.english.architecturepattern.MVVM.data.ModelMVVM;

public class MovieViewModel extends ViewModel {
       // Manuale
    MutableLiveData<String> nameMutaleLiveData = new MutableLiveData<>();
    private ModelMVVM getModelFromDatabase(){
          return  new ModelMVVM(19 , "name" , "2022/2/2" ,
                  "very Good") ;

    } public void getName() {
        String Name = getModelFromDatabase().getName();
        nameMutaleLiveData.setValue(Name);
    }
}

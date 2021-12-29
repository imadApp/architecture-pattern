
package com.app.english.architecturepattern.MVP.ui;

import com.app.english.architecturepattern.MVP.data.ModelVP;

public class MoviePresenter {
    MovieName view ;
    public MoviePresenter(MovieName view) {
        this.view = view;
    } public ModelVP getMovieFromDatabase() {
        return new ModelVP(1 , "name" , "2020/2/2" , "Very Good");
    }
    public void getMovieName(){
        view.onGetMovieName(getMovieFromDatabase());
}  /* public void getMovieTitle() {
        this.view.OnGetMovieTitle(getMovieFromDatabase().getTitle());
    }
    */
}
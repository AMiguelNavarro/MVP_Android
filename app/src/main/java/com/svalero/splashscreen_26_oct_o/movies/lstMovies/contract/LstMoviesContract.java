package com.svalero.splashscreen_26_oct_o.movies.lstMovies.contract;

import com.svalero.splashscreen_26_oct_o.beans.Movie;
import com.svalero.splashscreen_26_oct_o.beans.User;

import java.util.ArrayList;

public interface LstMoviesContract {

    interface View {

    }

    interface Presenter {

    }

    /* Esta interface es una instancia en memoria para que el modelo cuando venga del segundo plano
     * me diga si ha ido bien o mal
     * */
    interface Model {
        //Programación reactiva
        interface OnLstMoviesListener{
            void onFinished(ArrayList<Movie> movies);
            void onFailure(String error);
        }
    }
}

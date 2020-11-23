package com.svalero.splashscreen_26_oct_o.movies.lstMovies.model;

import android.os.Handler;

import com.svalero.splashscreen_26_oct_o.beans.Movie;
import com.svalero.splashscreen_26_oct_o.movies.lstMovies.contract.LstMoviesContract;
import com.svalero.splashscreen_26_oct_o.movies.lstMovies.contract.LstMoviesContract.Model.OnLstMoviesListener;

import java.util.ArrayList;

public class LstMoviesModel {

    final boolean respuesta = true;

    public LstMoviesModel(){

    }

    public void getMoviesWS(final LstMoviesContract.Model.OnLstMoviesListener onLstMoviesListener){
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Cargar otra pantalla
                if (respuesta){
                    onLstMoviesListener.onFinished(new ArrayList());
                } else {
                    onLstMoviesListener.onFailure("Error de Servidor");
                }
            }
        }, 4000);
    }

}

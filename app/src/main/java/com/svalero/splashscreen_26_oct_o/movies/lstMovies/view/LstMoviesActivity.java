package com.svalero.splashscreen_26_oct_o.movies.lstMovies.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.svalero.splashscreen_26_oct_o.R;
import com.svalero.splashscreen_26_oct_o.beans.Movie;
import com.svalero.splashscreen_26_oct_o.movies.lstMovies.contract.LstMoviesContract;
import com.svalero.splashscreen_26_oct_o.movies.lstMovies.presenter.LstMoviesPresenter;

import java.util.ArrayList;

public class LstMoviesActivity extends AppCompatActivity implements LstMoviesContract.View {

    private LstMoviesPresenter lstMoviesPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_movies);

        lstMoviesPresenter = new LstMoviesPresenter(this);
        lstMoviesPresenter.getMovies();
    }

    public void success(ArrayList<Movie> lstMovies) {
        Toast.makeText(this, "Lista Movies", Toast.LENGTH_SHORT).show();

        //TODO actualiar la vista con la lista de movies
    }

    public void error(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    /* La implementacion de los métodos de Viiew del contract*/
    @Override
    public void succes() {

    }

    @Override
    public void error() {

    }
    // Toast es un mensaje que se muestra al usuario durante un tiempo para informarle de algo
}
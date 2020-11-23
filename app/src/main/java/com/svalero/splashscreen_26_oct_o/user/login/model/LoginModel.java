package com.svalero.splashscreen_26_oct_o.user.login.model;

import android.os.Handler;

import com.svalero.splashscreen_26_oct_o.beans.User;
import com.svalero.splashscreen_26_oct_o.user.login.contract.LoginContract;

public class LoginModel {
    final boolean respuesta = true;
    //Ya habla con la cloud
    public void loginUserWS(final User user, final LoginContract.Model.OnLoginUserListener onLoginUserListener) {
        //2º Simular consulta a la API para el login (Se simula que a los 4 segundos trae los datos)

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Cargar otra pantalla
                if (respuesta){
                    onLoginUserListener.onFinished(user);
                } else {
                    onLoginUserListener.onFailure("Error de Servidor");
                }
            }
        }, 4000);
    }

}

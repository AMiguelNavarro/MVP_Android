package com.svalero.splashscreen_26_oct_o.user.login.presenter;

import android.content.Intent;
import android.os.Handler;

import com.svalero.splashscreen_26_oct_o.RelativeLayout;
import com.svalero.splashscreen_26_oct_o.beans.User;
import com.svalero.splashscreen_26_oct_o.user.login.contract.LoginContract;
import com.svalero.splashscreen_26_oct_o.user.login.model.LoginModel;
import com.svalero.splashscreen_26_oct_o.user.login.view.LoginActivity;

public class LoginPresenter {
    //Login Controller = Login Presenter (es el negociador, la capa del medio)

    private LoginActivity loginActivity;
    private LoginModel loginModel;
    private boolean isValidacionCorrecta = true;

    public LoginPresenter(LoginActivity loginActivity){
        this.loginActivity = loginActivity;
        this.loginModel = new LoginModel();
    }

    public void login(String email, String password){
        //1º Validar los datos
        // TODO crear una clase aparte para la validacion (estática)

        //2ºConsultar el API para Login
        if (isValidacionCorrecta){
            User user = new User();
            user.setEmail(email);
            user.setPassword(password);
            loginModel.loginUserWS(user, new LoginContract.Model.OnLoginUserListener() {
                @Override
                public void onFinished(User user) {
                    loginActivity.success(user);
                }

                @Override
                public void onFailure(String error) {
                    loginActivity.error(error);
                }
            });
        }




    }
}

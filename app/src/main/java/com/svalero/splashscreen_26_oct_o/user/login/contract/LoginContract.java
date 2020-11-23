package com.svalero.splashscreen_26_oct_o.user.login.contract;

import com.svalero.splashscreen_26_oct_o.beans.User;

public interface LoginContract {

    interface View {

    }

    interface Presenter {

    }

    /* Esta interface es una instancia en memoria para que el modelo cuando venga del segundo plano
    * me diga si ha ido bien o mal
    * */
    interface Model {
        //Programación reactiva
        interface OnLoginUserListener{
            void onFinished(User user);
            void onFailure(String error);
        }
    }
}

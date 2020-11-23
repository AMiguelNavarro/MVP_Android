package com.svalero.splashscreen_26_oct_o.beans;

public class User {
    //Almacena info y genera puntos de acceso para el que quiera consumirla
    private String email;
    private String password;

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.company;

public class User {

    private String login;
    private int password;
    private Basket basket;

    public User(String login,int password,Basket basket){

        this.login = login;
        this.password = password;
        this.basket = basket;

    }

    public void setLogin(String login){

        this.login = login;

    }

    public String getLogin(){

        return login;

    }

    public void setLogin(int password){

        this.password = password;

    }

    public int getPassword(){

        return password;

    }

    public void setBasket(Basket basket){

        this.basket = basket;

    }

    public Basket getBasket(){

        return basket;

    }

    @Override
    public String toString() {
        return "User{" + "login='" + login + '\'' + ", password=" + password + ", basket=" + basket + '}';
    }
}

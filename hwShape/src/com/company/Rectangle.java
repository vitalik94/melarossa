package com.company;

public class Rectangle extends Shape {

    private String form;

    public Rectangle() {

        this.form = form;

    }

    public Rectangle(String color, String form) {

        super(color);
        this.form = form;

    }

    public void setForm(String form) {

        this.form = form;

    }

    public String getForm() {

        return form;

    }

    @Override
    public void draw() {

        System.out.println("фигура rectangle");

    }

}

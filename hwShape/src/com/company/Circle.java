package com.company;

public class Circle extends Shape {

    private String form;

    public Circle() {

        this.form = form;

    }

    public Circle(String color, String form) {

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

        System.out.println("фигура сircle");

    }

}

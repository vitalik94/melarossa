package com.company;

public class Product {

    private String name;
    private int price;
    private int rating;

    public Product(String name,int price,int rating){

        this.name = name;
        this.price = price;
        this.rating = rating;

    }

    public void setName(String name){

        this.name = name;

    }

    public String getName(){

      return name;

    }

    public void setPrice( int price){

        this.price = price;

    }

    public int getPrice(){

        return price;

    }

    public void setRating( int rating){

        this.rating = rating;

    }

    public int getRating(){

        return rating;

    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", price=" + price + ", rating=" + rating + '}';
    }

}

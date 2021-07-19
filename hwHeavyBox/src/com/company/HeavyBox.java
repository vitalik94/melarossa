package com.company;

public class HeavyBox {

    private int weight;
    private String contentsBox;

    public HeavyBox(int weight, String contentsBox) {

        this.weight = weight;
        this.contentsBox = contentsBox;

    }

    public void setWeight(int weight) {

        this.weight = weight;

    }

    public int getWeight() {

        return weight;

    }

    public void setContentsBox(String contentsBox) {

        this.contentsBox = contentsBox;

    }

    public String getContentsBox() {

        return contentsBox;

    }

    @Override
    public String toString() {
        return "HeavyBox{" + "weight=" + weight + ", contentsBox='" + contentsBox + '\'' + '}';
    }

}

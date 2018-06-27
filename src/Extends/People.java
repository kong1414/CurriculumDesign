package Extends;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/25 11:29
 */
public class People {
    private double height, weight;

    People() {
    }

    People(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public void speakHello() {
        System.out.println("People.speakHello()");
    }

    public void averageHeight() {
        System.out.println("People.averageHeight()");
    }

    public void averageWeight() {
        System.out.println("People.averageWeight()");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

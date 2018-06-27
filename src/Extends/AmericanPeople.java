package Extends;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/25 11:20
 */
public class AmericanPeople extends People {
    public AmericanPeople() {
    }

    public AmericanPeople(double height, double weight) {
        super(height, weight);
    }

    public void americanBoxing() {
        System.out.println("AmericanPeople.americanBoxing()");
    }

    @Override
    public void speakHello() {
        System.out.println("AmericanPeople.speakHello()");
    }

    @Override
    public void averageHeight() {
        System.out.println("AmericanPeople.averageHeight()");
    }

    @Override
    public void averageWeight() {
        System.out.println("AmericanPeople.averageWeight()");
    }
}

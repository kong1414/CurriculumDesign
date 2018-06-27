package Extends;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/25 11:22
 */
public class BeijingPeople extends ChinaPeople {
    BeijingPeople() {
    }

    BeijingPeople(double height, double weight) {
        super(height, weight);
    }

    public void beijingOpera() {
        System.out.println("BeijingPeople.beijingOpera()");
    }

    @Override
    public void speakHello() {
        System.out.println("BeijingPeople.speakHello()");
    }

    @Override
    public void averageHeight() {
        System.out.println("BeijingPeople.averageHeight()");
    }

    @Override
    public void averageWeight() {
        System.out.println("BeijingPeople.averageWeight()");
    }
}
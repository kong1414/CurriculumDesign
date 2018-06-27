package Extends;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/25 11:26
 */
public class ChinaPeople extends People {
    public ChinaPeople() {
    }

    public ChinaPeople(double height, double weight) {
        super(height, weight);
    }

    public void chinaGongfu() {
        System.out.println("ChinaPeople.chinaGongfu()");
    }

    @Override
    public void speakHello() {
        System.out.println("ChinaPeople.speakHello()");
    }

    @Override
    public void averageHeight() {
        System.out.println("ChinaPeople.averageHeight()");
    }

    @Override
    public void averageWeight() {
        System.out.println("ChinaPeople.averageWeight()");
    }
}

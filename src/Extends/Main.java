package Extends;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/25 11:30
 */
public class Main {
    public static void main(String[] args) {
        People people = new People();
        ChinaPeople chinaPeople = new ChinaPeople();
        BeijingPeople beijingPeople = new BeijingPeople();
        AmericanPeople americanPeople = new AmericanPeople();

        people.speakHello();
        people.averageHeight();
        people.averageWeight();

        chinaPeople.chinaGongfu();
        chinaPeople.speakHello();
        chinaPeople.averageHeight();
        chinaPeople.averageWeight();

        beijingPeople.beijingOpera();
        beijingPeople.speakHello();
        beijingPeople.averageHeight();
        beijingPeople.averageWeight();

        americanPeople.americanBoxing();
        americanPeople.speakHello();
        americanPeople.averageHeight();
        americanPeople.averageWeight();
    }
}

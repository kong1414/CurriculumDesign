package teacherAndStudentManagement;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/27 10:24
 */
public class Graduate implements StudentInterface, TeacherInterface {
    private String name;
    private String sex;
    private int age;
    private double fee;
    // 每学期学费
    private double pay;
    // 月工资

    public Graduate(String name) {
        this.name = name;
        sex = "M";
        age = 0;
        fee = 0.0;
        pay = 0.0;
    }

    public Graduate(String name, String sex, int age, double fee, double pay) {
        super();
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.fee = fee;
        this.pay = pay;
    }


    @Override
    public String toString() {
        return "name:" + getName() + " sex:" + getAge() + " age:" + getAge() + " fee:" + getFee() + " pay:" + getPay();
    }

    public String count() {
        double x = pay - fee;
        if (x >= 0) {
            return "" + x;
        } else {
            return "provide a loan";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public double getFee() {
        return fee;
    }

    @Override
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public double getPay() {
        return pay;
    }

    @Override
    public void setPay(double pay) {
        this.pay = pay;
    }

}

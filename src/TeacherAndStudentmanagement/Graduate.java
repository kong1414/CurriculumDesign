package teacherAndStudentmanagement;

public class Graduate implements StudentInterface, TeacherInterface {
	private String name;
	private String sex;
	private int age;
	private double fee; // 每学期学费
	private double pay; // 月工资

	public Graduate(String name) {
		this.name = name;
		sex = "M";
		age = 0;
		fee = 0.0;
		pay = 0.0;
	}

	@Override
	public String toString() {
		return "name:" + getName() + " sex:" + getAge() + " age:" + getAge() + " fee:" + getFee() + " pay:" + getPay();
	}

	public String count() {
		double x = pay - fee;
		if (x >= 0)
			return "" + x;
		else
			return "provide a loan";
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

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

}

package teacherAndStudentmanagement;

public class StudentAndTeacherDemo {
	public static void main(String[] args) {
		Graduate g;
		g = new Graduate("zhangsan");
		g.setAge(20);
		g.setSex("M");
		g.setFee(9800);
		g.setPay(1000);
		System.out.println(g.count());

		g.setPay(12000);
		System.out.println(g.count());
	}
}

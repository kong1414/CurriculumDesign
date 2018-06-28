package teacherAndStudentManagement;

/**
 * @Description:
 * @Author: QiuGuanLin
 * @Date: 2018/6/27 10:23
 */
public class StudentAndTeacherDemo {
    public static void main(String[] args) {
        Graduate graduate = new Graduate("zhangsan", "M", 22, 9800, 1000);
        System.out.println(graduate.count());
        graduate.setPay(12000);
        System.out.println(graduate.count());
    }
}

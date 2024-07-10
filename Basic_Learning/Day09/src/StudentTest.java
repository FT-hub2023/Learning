import com.manage.domain.Student;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三", 23));
        students.add(new Student("李四", 17));
        students.add(new Student("王五", 18));
        ArrayList<Student> newArrayList = arrayFilter(students);
        System.out.println(newArrayList);
    }

    private static ArrayList<Student> arrayFilter(ArrayList<Student> students) {
        ArrayList<Student> newArrayList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge() < 18) {
                newArrayList.add(students.get(i));
            }
        }
        return newArrayList;
    }
}

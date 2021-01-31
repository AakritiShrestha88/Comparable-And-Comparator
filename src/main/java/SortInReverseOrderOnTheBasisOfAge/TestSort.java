package SortInReverseOrderOnTheBasisOfAge;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {
    public static void main(String[] args) {
        ArrayList<Student> details = new ArrayList<Student>();
        details.add(new Student(1,21,"Aakriti"));
        details.add(new Student(2,22,"Aakriti2"));
        details.add(new Student(3,23,"Aakriti3"));
        details.add(new Student(9,24,"Aakriti4"));
        Collections.sort(details);
        for(Student al:details){
            System.out.println(al.getAge()+" "+al.getRollnumber()+" "+al.getName());
        }
    }
}

package SortOnTheBasisOfAge;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {


    public static void main(String[] args) {
        ArrayList<Student> record = new ArrayList<Student>();
        record.add(new Student(21,1,"Aakriti"));
        record.add(new Student(22,2,"Aakriti2"));
        record.add(new Student(20,3,"Aakriti3"));
        record.add(new Student(19,4,"Aakriti4"));

        Collections.sort(record);
        for(Student all:record){
            System.out.println(all.getAge()+" "+all.getName()+" "+all.getRollNumber()+" ");

        }
    }
}

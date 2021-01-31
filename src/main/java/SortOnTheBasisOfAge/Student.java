package SortOnTheBasisOfAge;

//the example of a Comparable interface that sorts the list elements on the basis of age.
 public class Student implements Comparable<Student>{
     private int age;
     private int rollNumber;
     private String name;

    public Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student o) {
        if (age == o.age){
            return 0;
        }
        else if (age>o.age){
            return 1;
        }
        return -1;
    }

}

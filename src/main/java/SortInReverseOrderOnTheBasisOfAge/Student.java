package SortInReverseOrderOnTheBasisOfAge;

public class Student implements Comparable<Student>{
    private int rollnumber;
    private int age;
    private String name;

    public Student(int rollnumber, int age, String name) {
        this.rollnumber = rollnumber;
        this.age = age;
        this.name = name;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                "rollnumber=" + rollnumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student o) {
        if(age == o.age){
            return 0;
        }
        else if(age<o.age){
            return 1;
        }
        else {
            return -1;
        }
    }
}

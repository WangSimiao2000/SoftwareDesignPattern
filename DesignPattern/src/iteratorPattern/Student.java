package iteratorPattern;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public int compareTo(Student stu){
        if(this.age > stu.age){
            return -1;
        }else if(this.age < stu.age){
            return 1;
        }
        return 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
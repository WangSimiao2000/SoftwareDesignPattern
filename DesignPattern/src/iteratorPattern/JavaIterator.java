package iteratorPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class JavaIterator {
    List<Student> slist=null;
    public JavaIterator(){
        Student[] stu=new Student[5];
        slist=new ArrayList<Student>();
        stu[0]=new Student("张三", 32);
        stu[1]=new Student("李四", 25);
        stu[2]=new Student("王五", 21);
        stu[3]=new Student("赵六", 38);
        stu[4]=new Student("周七", 26);
        for(int i=0;i<5;i++){
            slist.add(stu[i]);
        }
    }
    public void display(){
        Iterator<Student> t=slist.iterator();
        System.out.println("遍历获得的原始数据：");
        while(t.hasNext()){
            Student student=t.next();
            System.out.println("姓名："+student.getName()+"今年"+student.getAge()+"岁");
        }
        Collections.sort(slist);
        Iterator<Student> it=slist.iterator();
        System.out.println("========================================");
        System.out.println("按年龄从大到小排序：");
        while(it.hasNext()){
            Student student=it.next();
            System.out.println("姓名："+student.getName()+"今年"+student.getAge()+"岁");
        }
    }

}
package Collections.listInterFACE;

import java.util.*;

class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Set_HashSet {
    public static void main(String[] args) {

        Set<Student> st=new HashSet<>();
        Student s1=new Student(1,"abhi");
        Student s2=new Student(1,"abhi");
        st.add(s1);
        st.add(s2);
        System.out.println(st);






//        Set<Integer> hs2=new HashSet<>();//gives output randomly
//        Set<Integer> hs1=new LinkedHashSet<>();//gives output in the seques u provide it
//        Set<Integer> hs=new TreeSet<>();//gives output in sorted manner
//
//
//        hs.add(50);
//        hs.add(20);
//        hs.add(40);
//        hs.add(10);
//        hs.add(30);
//
//        System.out.println(hs.remove(20));
//
//        System.out.println(hs);
    }
}

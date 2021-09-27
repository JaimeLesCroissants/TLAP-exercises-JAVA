import java.util.*;
public class ArrayExcercise{
  public static void main(String[] args){
    Student[] studentArray={
      new Student(87,10001,"Fred"),
      new Student(28,10002,"Tom"),
      new Student(100,10003,"Alistair"),
      new Student(78,10004,"Sasha"),
      new Student(84,10005,"Erin"),
      new Student(98,10006,"Belinda"),
      new Student(75,10007,"Leslie"),
      new Student(70,10008,"Candy"),
      new Student(81,10009,"Aretha"),
      new Student(68,10010,"Veronica")
    };
    
    System.out.println(Arrays.toString(studentArray));
    Arrays.sort(studentArray,new SortByName());
    System.out.println(Arrays.toString(studentArray));
  }
}

class Student{
  int grade;
  int ID;
  String name;
  
  Student(int grade,int ID,String name){
    this.grade=grade;
    this.ID=ID;
    this.name=name;
  }
  public String toString(){
    return " "+this.grade+" "+this.ID+"  "+this.name+" ";
  }
}
class SortByGrade implements Comparator<Student>{
  public int compare(Student a,Student b){
    return a.grade-b.grade;
  }
}

class SortByID implements Comparator<Student>{
  public int compare(Student a,Student b){
    return a.ID-b.ID;
  }
}
class SortByName implements Comparator<Student>{
  public int compare(Student a, Student b){
    return a.name.compareTo(b.name);
  }
}
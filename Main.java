// Create a class Student containing instance variables roll and name and a
// parameterized constructor. Create two objects of that class from the main class
// and print them (Hints: Override toString method of Object class).
 class Student {
  int roll;
  String name;
  Student(int roll,String name){
    this.roll=roll;
    this.name=name;
  }
  public String toString(){
    return "Roll no: "+roll+" Name: "+name;
  }
}
public class Main {
  public static void main(String[] args) {
    Student s1=new Student(1,"Rahul");
    Student s2=new Student(2,"Romit");
    System.out.println(s1.toString());
    System.out.println(s2.toString());
  }
}


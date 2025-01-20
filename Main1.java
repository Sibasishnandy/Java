// Create a class EMP having instance variable name and id. Create its subclass
// (say Scientist) which has instance variable no_of_publication and experience.
// Now create its subclass, say Dscientist which has instance variable award. Put a
// method: public String toString () { } in every class where you describe about
// the class and from main create object of each class and print each object.
class EMP {
  String name;
  int id;
  EMP(String name,int id){
    this.name=name;
    this.id=id;
  }
  public String toString(){
    return "EMP [name=" + name + ", id=" + id +"]";
  }
}
class Scientist extends EMP{
  int no_of_publication;
  String experience;
  Scientist(String name,int id,int no_of_publication){
    super(name, id);
    this.no_of_publication=no_of_publication;
  }
  public String toString(){
    return "Scientist [name=" + name + ", id=" + id + ", no of Publications="+no_of_publication +"]";
    
  }
}
class Dscientist extends Scientist{
  String award;
  Dscientist(String name,int id,int no_of_publication,String experience,String award){
    super(name,id,no_of_publication);
    this.award=award;
  }
  public String toString(){
    return "Scientist [name=" + name + ", id=" + id + ", no of Publications="+no_of_publication +"award= "+award +"]";
  }
}
class Main1{
  public static void main(String[] args) {
    EMP emp=new EMP("Rahul",1);
    System.out.println(emp.toString());
    Scientist sc=new Scientist("Rahul",1,5);
    System.out.println(sc.toString());
    Dscientist ds=new Dscientist("Rahul",1,5,"5 years","Nobel Prize");
    System.out.println(ds.toString());
  }
}
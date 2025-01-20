//  class B{

//  }
//  class A {
//   public void m(Object a){
//     System.out.println(a.toString());
//   }
//   public static void main(String[] args) {
//     A a = new A();
//     B b=new B();
//     a.m(a);
//     a.m(b);
//   } 
// }
class A{
  public Object m(){
    return new A();
  }
  public static void main(String[] args) {
    A a=new A();
    System.out.println(a.m().getClass());
  }
}
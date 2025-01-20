
class P{
  void show(){
    System.out.println("Hello");
  }
}
class C1 extends P{
  void show(){
    System.out.println("Hello form child 1");
  }
}
class C2 extends P{
  void show(){
    System.out.println("Hello from child 2");
  }
}
class C3 extends P{
  void show(){
    System.out.println("Hello from child 3");
  }
}
class Test{
  public static void main(String[] args) {
    C1 c1=new C1();
    C2 c2=new C2();
    C3 c3=new C3();
    c1.show();
    c2.show();
    c3.show();

  }
}
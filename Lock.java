class MyThready extends Thread{
  Q q;
  String s;
  MyThready(Q q,String s){
    this.q=q;
    this.s=s;
  }
  public void run(){
    q.m(s);
  }
}
class Q{
  void m(String s){
    for(int i=0;i<5;i++){
      System.out.print("Good morning :");
      try{
        Thread.sleep(1000);
      }catch(Exception e){}
      System.out.println(s);
    }
   
  }
}
 class Lock{
  public static void main(String[] args){
    Q q=new Q();
    MyThready t1=new MyThready(q,"Kohli");
    MyThready t2=new MyThready(q,"Dhoni");
    t1.start();
    t2.start();
  }
}

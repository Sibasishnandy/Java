class Q{
  int n;
  boolean val=false;
  public synchronized void put(int n)throws InterruptedException{
    while(val){
      wait();
    }
    this.n=n;
    System.out.println("Put:"+n);
    val=true;
    notify();
  }
  public synchronized void get()throws InterruptedException{
    while(!val){
      wait();
    }
    System.out.println("Got:"+n);
    val=false;
    notify();
  }
}
class Producer extends Thread{
  Q q;
  Producer(Q q) {
    this.q=q;
  }
  public void run(){
    int i=0;
    while(true){
      try{
        q.put(i++);
      }catch(Exception e){}
      
    }
  }

}
class Consumer extends Thread{
  Q q;
  Consumer(Q q) {
    this.q=q;
  }
  public void run(){
    while(true){
      try{
        q.get();
      }catch(Exception e){}
    }
  }
}
public class ProdCon {
  public static void main(String[] args) {
    Q q=new Q();
    Producer p=new Producer(q);
    Consumer c=new Consumer(q);
    p.start();
    c.start();
    
  }
  
}

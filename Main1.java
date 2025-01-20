class MyThread extends Thread{
  public void run(){
    for(int i=0;i<3;i++){
      System.out.println("Child Thread is running "+Thread.currentThread().getName()+" Priority :"+getPriority());
    }
  }
}
public class Main1 {
  public static void main(String[] args) {
    MyThread t[]=new MyThread[5];
    for(int i=0;i<=4;i++){
      t[i]=new MyThread();
      t[i].setPriority(i+1);
      t[i].start();
    }
    for(int i=0;i<3;i++){
      System.out.println("Main Thread is running "+Thread.currentThread().getName()+" Priority :"+ Thread.currentThread().getPriority());
    }
    

  }
}

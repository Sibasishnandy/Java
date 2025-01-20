class Myrunnable implements Runnable{
  Myrunnable(){
    System.out.println("Myrunnable() is called");
  }
  public void run(){
    for(int i=0;i<3;i++){
      System.out.println("Child thread");
      try{
        Thread.sleep(1000);
      }catch(InterruptedException e){}
    }
  }
}
class Main{
  public static void main(String[] args) {
    Thread t=new Thread(new Myrunnable(),"Child thread");
    t.start();
    for(int i=0;i<3;i++){
      System.out.println("Main thread");
      try{
        Thread.sleep(2000);
      }catch(InterruptedException e){}
    }
    
  }
}
class MyRunnable implements Runnable{
    public void run() {
        System.out.println("Priority :"+ Thread.currentThread().getPriority()+" Name:"+Thread.currentThread().getName());
    }
}
class ThreadExample4{
    public static void main(String[] args) {
        int j=1;
        MyRunnable r=new MyRunnable();

        Thread.currentThread().setName("Sachin ");

        for(int i=0;i<5;i++){

            Thread t=new Thread (r,"Dhoni "+j);
            t.setPriority(j);
            t.start();

            j++;
        }

        for(int i=0;i<3;i++){
            System.out.println("Sachin Thread "+Thread.currentThread().getName());
        }

    }
}
class  Accountholder
{
	String name;
	int accountno;
	String accounttype;
	int ballance;
	Accountholder(String name,int accountno,String accounttype,int ballance){
		this.name=name;
		this.accountno=accountno;
    this.accounttype=accounttype;
    this.ballance=ballance;
	}
  public void display(){
    System.out.println("Account Holder Name: "+name);
    System.out.println("Account ballance: "+ballance);
    System.out.println("Account type:"+accounttype);
    System.out.println("Account number:"+accountno);
  }
  public void withdraw(int x){
    if(ballance<x){
      System.out.println("Insufficient balance");
    }else{
      System.out.println("You have withdrawn :"+x);
      ballance=ballance-x;
    }
  }
  public void deposit(int x){
    System.out.println("You have deposited :"+x);
    ballance=ballance+x;
    System.out.println("Your new ballance is :"+ballance);
  }
  public static void main(String[] args) {
    Accountholder obj=new Accountholder("Rahul",12345,"Savings",10000);
    obj.display();
    obj.withdraw(10000);
    obj.display();
    obj.withdraw(1000);

  }
}

// Assume that a bank maintains two kinds of account for its customers, one called
// savings account and other called current account. The savings account provides
// compound interest and withdrawal facilities but no cheque book facility. The
// current account provides cheque book facility but no interest. Current account
// holders should also maintain a minimum balance (say Rs. 1000) and if the balance
// falls below this level a service charge is imposed (say Rs. 100).
// Create a class Account that stores customer name, account number and type of
// account. From this class derive two classes Curr_Acct and Savn_Acct
// respectively to make them more specific to their requirements. Include the
// necessary methods to achieve the following tasks:
// a. Accept deposit from a customer and update the balance.
// b. Display the balance.
// c. Compute and deposit interest.
// d. Permit withdrawal and update the balance.
// e. Check for minimum balance, impose penalty, if necessary, and update
// the balance.
// Use constructors to initialize the class members.
class Account{
  String name;
  int accountNumber;
  String accountType;
  
  Account(String name,int accountNumber,String accountType){
    this.name=name;
    this.accountNumber=accountNumber;
    this.accountType=accountType;
  }
}
class Curr_Acct extends Account{
  double balance;
  Curr_Acct(String name,int accountNumber,String accountType,double balance){
    super(name,accountNumber,accountType);
    this.balance=balance;
  }
  public void deposit(double x){
    System.out.println("You have deposited:"+x);
    balance+=x;
    System.out.println("Your new Ballance is :"+balance);
  }
  public void withdrawal(double x){
    if(x>balance){
      System.out.println("Insufficient balance");
    }
    else{
      System.out.println("You have withdrawn:"+x);
      balance-=x;
      System.out.println("Your new Ballance is :"+balance);
      if(balance<1000){
        System.out.println("Minimum balance not met, penalty of Rs.100 will be imposed");
        balance-=100;
        System.out.println("Your new Ballance is :"+balance);
      }
    }
  }
  public void interest(){
    System.out.println("Interest of 2% will be added to your account");
    balance+=balance*0.02;
    System.out.println("Your new Ballance is :"+balance);
  }
  public void display(){
    System.out.println("Account Holder Name: "+name);
    System.out.println("Account Number: "+accountNumber);
    System.out.println("Account Type: "+accountType);
    System.out.println("Balance: "+balance);
  }
}
class Savn_Acct extends Account{
  double balance;
  Savn_Acct(String name,int accountNumber,String accountType,double balance){
    super(name,accountNumber,accountType);
    this.balance=balance;
  }
  public void deposit(double x){
    System.out.println("You have deposited:"+x);
    balance+=x;
    System.out.println("Your new Ballance is :"+balance);
  }
  public void withdrawal(double x){
    if(x>balance){
      System.out.println("Insufficient balance");
    }
    else{
      System.out.println("You have withdrawn:"+x);
      balance-=x;
      System.out.println("Your new Ballance is :"+balance);
    }
  }
  public void interest(){
    System.out.println("Interest of 2% will be added to your account");
  }
  public void display(){
    System.out.println("Account Holder Name: "+name);
    System.out.println("Account Number: "+accountNumber);
    System.out.println("Account Type: "+accountNumber);
    System.out.println("Balance: "+balance);
  }

}
class Main2 {
  public static void main(String[] args) {
    Savn_Acct acc=new Savn_Acct("Rahul",12345,"Savings",100000);
    acc.deposit(1000);
    acc.withdrawal(500);
    acc.display();
    acc.interest();
    acc.display();

    
  }
}

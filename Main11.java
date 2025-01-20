import java.util.Scanner;
public class Main11 {
  public static void game(){
    Scanner sc=new Scanner(System.in);
    int count=0;
    String answer;
    while(count<3){
      System.out.println("Who is the inventor of java?");
      answer=sc.nextLine();
      if(answer.equalsIgnoreCase("James Gosling")){
        System.out.println("That is correct!");
        return;
      }
      else{
        if(count==2){
          System.out.println("Sorry, you have used up all your chances. The answer is James Gos");
          return;
        }
        System.out.println("That is incorrect!");
      }
      count++;
    }
  }
  public static void main(String[] args) {
    game();
  }
}

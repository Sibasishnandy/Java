import java.util.Arrays;
public class Main8 {
  public static void sortstring(){
    String s="STRING";
    StringBuilder ans=new StringBuilder();
    char[] charr=new char[s.length()];

    for(int i=0;i<s.length();i++)
      charr[i]=s.charAt(i);

    Arrays.sort(charr);

    for(int i=0;i<s.length();i++){
      ans.append(Character.toString(charr[i]));
    }

    System.out.println(ans);
    
  }
  public static void main(String[] args) {
    sortstring();
  }
  
}

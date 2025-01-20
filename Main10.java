public class Main10 {
  public static String repeat(String s,int i){
    String ans="";
    int count=0;
    int len=s.length();
    int first=len-i;
    String r=s.substring(first, len);
    while(count!=i){
      ans+=r;
      count++;
    }
    return ans;
  }
  public static void main(String[] args) {
    System.out.println(repeat("Sibasish", 4));
  }
}

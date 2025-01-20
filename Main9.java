public class Main9 {
  public static String deleteMe(String s,int i){
    int len=s.length();
    if(i<0 || i>=len){
      return s;
    }
    return s.substring(0,i)+s.substring(i+1,len);
  }
  public static void main(String[] args) {
    System.out.println(deleteMe("sibasish", 3));
  }
}

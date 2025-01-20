public class Main7 {
  public static void ans(){
    String s="CAtDog";
    StringBuilder s1=new StringBuilder();
    int len=s.length();
    if(len%2==0){
      for(int i=0;i<len/2;i++)
        s1.append(s.charAt(i));
    }
    System.out.println(s1);
  }
  public static void main(String[] args) {
    ans();

  }
  
}

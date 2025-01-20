// Given two strings, append them together (known as "concatenation") and return the result.
// However, if the concatenation creates a double-char, then omit one of the chars. If the inputs are
// “Mark” and “Kate” then the ouput should be “markate”. (The output should be in lowercase)
class Main4 {
  public static void concatenate(String s1,String s2){
    char r1[]=new char[100];
    char r2[]=new char[100];
    String value="";

    String result1 = s1.toLowerCase();
    String result2 = s2.toLowerCase();

    for(int i=0;i<result1.length();i++){
      r1[i]=result1.charAt(i);
    }
      
    for(int i=0;i<result2.length();i++){
      r2[i]=result2.charAt(i);
    }



    if(r1[result1.length()-1]==r2[0]){
      for(int i=0;i<result2.length();i++){
        r2[i]=r2[i+1];
      }
      for(int i=0;i<result1.length();i++){
        String ans=Character.toString(r1[i]);
        value=value+ans;
      }
      for(int i=0;i<result2.length()-1;i++){
        String ans=Character.toString(r2[i]);
        value=value+ans;
      }
      System.out.println(value);
    }

    else{
      System.out.print(result1+result2);
    }

    
  }
  public static void main(String[] args) {
    concatenate("Sibasish ", " Nandy");
  }
}

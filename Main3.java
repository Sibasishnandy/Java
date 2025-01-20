class Main3 {
  void stringReverse(){
    String s="abba";
    String reverse="";
    for(int i=s.length()-1;i>=0;i--){
      String n=Character.toString(s.charAt(i));
      reverse+=n;
    }
    System.out.println("Reversed word is :"+reverse);

    if(reverse.equals(s)){
      System.out.println("The string is a palindrome");
    }
  }
  public static void main(String[] args) {
    Main3 m3=new Main3();
    // StringBuffer sb=new StringBuffer("hello");
    // System.out.println(sb.reverse());
    m3.stringReverse();
  }
  
}

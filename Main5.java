 class Main5 {
  public static void generate(String s1,String s2){
    StringBuilder s=new StringBuilder();

    int minlen=Math.min(s1.length(), s2.length());

    for(int i=0;i<minlen;i++){
      s.append(s1.charAt(i));
      s.append(s2.charAt(i));
    }

    if(minlen<s1.length()){
      s.append(s1.substring(minlen));
    }
    else if(minlen<s2.length()){
      s.append(s2.substring(minlen));
    }

    System.out.println(s);
  }
  public static void main(String[] args) {
    generate("ABC", "DE");
  }
  
}

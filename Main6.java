 class Main6 {
  public static void substring(){
    String str = "Academy of technology";
    String sub="tech";
    int index=str.indexOf(sub);
    if(index!=-1){
      System.out.println("Substring found at index "+index);
    }

  }
  public static void main(String[] args) {
    substring();
  }
  
}

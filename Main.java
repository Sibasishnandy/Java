
class Main{
  void frequency(String x){
    String s=x.toLowerCase();
    int count=0,j=0;
    boolean[] b=new boolean[100];
    char[] store=new char[100];
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      store[j]=ch;
      j++;
    }
    for(int i=0;i<s.length();i++){
      if(b[i]==false)
      count++;
      for(int k=i+1;k<s.length();k++){
        if(store[i]==store[k] && b[k]==false){
          count++;
          b[k]=true;
        }
      }
      
      if(store[i]==' ' && b[i]==false){
        System.out.println("space"+" "+count);
      }
      else if(b[i]==false && store[i]!=' ')
      System.out.println(store[i]+" "+count);
      count=0;
    }
  }
  public static void main(String[] args) {
    Main m=new Main();
    m.frequency("HelloHHello Sibu nandy motherhod bara");

  }
}
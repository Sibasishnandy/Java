
public class Main12 {
  public static void passwordgenerator(String s1,int i){
    String password="";
    String s=s1.trim();
    char c[]=new char[s.length()];


    String no=Integer.toString(i);
    String digpass=no.substring(no.length()-4);


    for(int k=0;k<s.length();k++)
      c[k]=s.charAt(k);

    password=password+Character.toString(c[0]);

    for(int k=0;k<s.length();k++){
      if(c[k]==' '){
        password=password+Character.toString(c[k+1]);
      }
    }

    System.out.println(password+digpass);


    


  }
  public static void main(String[] args) {
    passwordgenerator("Sibasish Kumar Nandy     ",160012);
  }  
}

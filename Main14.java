
class Main14{
  static void search(int [] a,int num){
    int low=0,mid;
    int high=a.length-1;
    while(low<=high){
      mid=(low+high)/2;
      if(a[mid]==num){
        System.out.println("Element is present at index "+mid);
        return;
      }
      else if(num>a[mid]){
        low=mid+1;
      }
      else{
        high=mid-1;
      }

    }
    System.out.println("Not present");

  }
  public static void main(String [] args){
    int [] a={-20,-13,4,5,6,7,8,9};
    search(a,-20);
  }
}
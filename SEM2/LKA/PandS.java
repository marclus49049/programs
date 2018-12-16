import java.util.*;
class PandS{

  static void paging() {
    int[] arr = new int[5];
    for(int i=0; i<arr.length; i++){
      arr[i] = i;
    }
    System.out.println("Array Created");
    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    }
  }

  static void segment(){
    ArrayList alist = new ArrayList<>();
    alist.add(1);
    alist.add("marclus");
    alist.add(2);
    System.out.println("Arraylist Created");
    Iterator i = alist.iterator();
    while(i.hasNext()){
      System.out.println(i.next().toString());
    }

  }
  public static void main(String[] args) {
    System.out.println("Paging Code Executed");
    paging();
    System.out.println("\nSegmentation Code Executed");
    segment();
  }
}

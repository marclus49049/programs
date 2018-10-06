import java.util.*;

class HashAssign {

  public static void main(String[] args) {
    // ArrayList <String> aList = new ArrayList<>(); // or we can use
    LinkedHashSet <String> lhSet = new LinkedHashSet<>();

    String s = "This is is a a value" ;
    String [] data = s.split(" ");
    // for (String word : data){
    //   if (aList.contains(word)){
    //     continue;
    //   }
    //   aList.add(word);
    // }
    //
    // for (String word : aList){
    //     System.out.println(word);
    // }
    for (String word : data){
      lhSet.add(word);
    }
    System.out.println(lhSet);
    StringBuffer sb = new StringBuffer();
    for (String x: lhSet){
      sb.append(x+" ");
    }
    System.out.println(sb.toString());
  }

}

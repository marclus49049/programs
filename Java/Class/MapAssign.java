import java.util.*;
import java.io.*;

class MapAssign{
  public static void main(String[] args) throws IOException{

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    //Integer[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Integer usr_num;
    TreeMap <Integer, Integer> count = new TreeMap<>();
    // for (Integer num : nums){
    //   count.put(num, 0);
    // }
    // System.out.println(count);
    // System.out.println("All values entered");
    System.out.println("Enter -1 to exit else enter only a single digit number between 0-9 ");
    while(true){
      System.out.print("Enter a number: ");
      usr_num = Integer.parseInt(input.readLine());
      if(usr_num == -1){
        break;
      } else{
        if(count.containsKey(usr_num)){
          count.put(usr_num, count.get(usr_num)+1);
        } else {
          count.put(usr_num, 1);
        }
      }
      // else if(usr_num > 9){
      //   while(usr_num!=0){
      //     Integer mod = usr_num % 10;
      //     count.put(mod, count.get(mod)+1);
      //     usr_num = usr_num / 10;
      //   }
      // }
    }
    System.out.println(count);
  }
}

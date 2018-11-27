import java.io.*;
import java.util.*;
class test{

  @SuppressWarnings("unchecked")
  static <T> T add(T num1, T num2){
    if (num1.getClass() == Integer.class){
      return (T) (Integer) ((Integer)num1 + (Integer)num2);
    } else if(num1.getClass() == Double.class){
      return (T) (Double) ((Double)num1 + (Double)num2);
    }
    return null;
  }
  public static void main(String[] args) throws IOException {
    ArrayList num = new ArrayList<>();
    String input1, input2;
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    input1 = input.readLine();
    input2 = input.readLine();
    try {
      num.add(0, Integer.parseInt(input1));
      num.add(1,Integer.parseInt(input2));
    } catch (NumberFormatException e) {
      num.add(0,Double.parseDouble(input1));
      num.add(1,Double.parseDouble(input2));
    }
    System.out.print(add(num.get(0), num.get(1)));
  }
}

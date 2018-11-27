public class Ext1{
  public static void show(Object obj){
    System.out.println(obj);
  }
  public static void main(String[] args) {
    String s= "Abc";
    show(s);
    int x=10;
    // show(x);
    // Integer I = new Integer(x); //boxing
    // show(I); //
    // int y = I.intValue(); //unboxing
    Integer I = x; //boxing
    int y = I; //unboxing
    //show(x);
  }
}

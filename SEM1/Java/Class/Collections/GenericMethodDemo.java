class GenericMethodDemo {
  public static <T,U> void show(T t, U x){
    System.out.println(t);
  }
  public static void main(String[] args) {
    Data<Integer> data = new Data<Integer>();
    show("abc", 1);
    show(1, "abc");
  }
}

import java.io.*;

class ArrayPrim {
  public static void main(String[] args) throws IOException {
    int arr[] = new int[5]; int cnt = 0, tempVar = 0;

    InputStreamReader ioStream = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(ioStream);

    while (cnt < arr.length) {
      System.out.print("Enter a Number: ");
      arr[cnt] = Integer.parseInt(input.readLine());
      cnt++;
    }

    cnt = 0;
    //printing even numbers

    for (int i = 0; i<arr.length; i++){
      for (int j = 0; j<arr.length; j++) {
        if(arr[i]<arr[j]) {
          tempVar = arr[i];
          arr[i] = arr[j];
          arr[j] = tempVar;
        }
      }
    }
    for (int i = 0; i<arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}

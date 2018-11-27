import java.io.*;

class NumberToWord {
  public static void main(String[] args) throws IOException {
    String ones[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String tens[] = {"Ten","Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    int userInput = 0, count=0;
    InputStreamReader ioStream = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(ioStream);
    System.out.print("Enter A number from 1 - 99 : ");
    userInput = Integer.parseInt(input.readLine());

    if(userInput<10) {
      System.out.println(ones[userInput-1]);
    } else if((userInput%10)==0) {
      System.out.println(tens[(userInput/10)-1]);
    } else if(userInput>9) {
      int temp[] = {0, 0} ;
      while (userInput!=0) {
        temp[count] = userInput % 10;
        userInput = userInput / 10;
        count++;
      }
      System.out.println(tens[temp[1]-1]+ " " +ones[temp[0]-1]);
    }

  }
}

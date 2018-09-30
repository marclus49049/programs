package com.symbi.Card;
import java.io.*;

class FlashCardData implements CardSearchable {
  FlashCard[] flashCards = new FlashCard[10];
  void loadData(){
    //read all data from cards_data.txt and put it in array of flash card
    // The name of the file to open.
    String fileName = "cards_data.txt";
    String line = null;
    try {
      FileReader fileReader = new FileReader(fileName);
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      while((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }

      bufferedReader.close();

      } catch (IOException e) {
        System.out.print(e);
      }
  }
}

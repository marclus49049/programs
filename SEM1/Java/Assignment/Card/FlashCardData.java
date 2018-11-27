package com.symbi.Card;
import java.io.*;
import java.util.*;

class FlashCardData implements CardSearchable {
  int size;
  ArrayList <FlashCard> flashCards = new ArrayList<>(); // will store the object of flash card

  // Read date from the file and then creates an object of FlashCard and adds into the array list
  public void loadData(){
    //read all data from cards_data.txt and put it in array of flash card
    // The name of the file to open.
    String fileName = "/home/marclus/College/Java/Assignment/Card/com/symbi/Card/cards_data.txt";
    String line;
    String [] data;
    try {
      FileReader fileReader = new FileReader(fileName);
      BufferedReader br = new BufferedReader(fileReader);
      while((line = br.readLine()) != null){
        data = line.split(";");
        flashCards.add(new FlashCard(data[0], data[1], data[2]));
      }
      br.close();

      // for (int i=0; i < flashCards.size(); i++){
      //   flashCards.get(i).displayCard();
      // }

      } catch (IOException e) {
        System.out.print(e);
      }
  }

  //Overriding the method searchCard here we store all the cards with the same subject that we got from the user in the main program into an arraylist
  // also it generates a random integer less than the size of the arrayList cards and then returns only one object from that arrayList form that randomly genereated integer
  public Card searchCard(String sub){
    ArrayList<FlashCard> cards;
    Card card;
    try {
      cards = searchSubject(sub);
      Random random = new Random();
      size = cards.size();
      for (int i= 0; i < size; i++){
        int index = random.nextInt(cards.size());
        card = cards.get(index);
        cards.remove(index);
        return card;
      }
    } catch (CardNotFoundException e){
      System.out.print(e);
    }
    return null;
    }

  public int getSize(){
    return size;
  }

  // this method returns an arratlist of FlashCard from the variable flashCard
  // it searches from that arrayList and check of the subject is equal to the subject in that card and then copies that object into a new arraylist
  // if no cards are founds an error is printed
  public ArrayList<FlashCard> searchSubject(String sub) throws CardNotFoundException{
    ArrayList<FlashCard> cards = new ArrayList<>();
    for (int i = 0; i< flashCards.size(); i++){
      if (flashCards.get(i).cardGetSubject().equals(sub)){
        cards.add(flashCards.get(i));
      }
    }
    if (cards.size() == 0){
      throw new CardNotFoundException("Data on the Subject you are looking for is not found");
    }
    return cards;
  }

  public ArrayList<String> getSubject() {
    ArrayList<String> subjects = new ArrayList<>();
    for (int i = 0;i < flashCards.size();i++){
        if (!subjects.contains(flashCards.get(i).cardGetSubject())) {
        subjects.add(flashCards.get(i).cardGetSubject());
        }
  }
  return subjects;
 }
}

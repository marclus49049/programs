package com.symbi.Card;
import java.util.*;
import java.io.*;

public class Run {
  private  static void printSubjects() throws IOException{
    FlashCardData fcData = new FlashCardData();
    fcData.loadData();
    ArrayList<String> subjects = fcData.getSubject();
    for (int i=0; i < subjects.size(); i++){
      System.out.println((i+1)+" "+subjects.get(i));
    }
    System.out.print("Choose Subject : ");
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String subject = input.readLine();
    Card card = fcData.searchCard(subject);//flashCardsData.searchCard(subjects.get(option-1));
    System.out.println(card.cardGetQuestion());
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println(card.cardGetAnswer());
  }
  // Main method here
  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Press 1 for entering the subject\nPress 2 to exit");
    while(true){
      System.out.print("Select Option: ");
      String choice = input.readLine();
      switch (choice) {
        case "1":
          printSubjects();
          break;
        case "2":
          System.exit(0);
          break;
        default:
          System.out.println("Press 1 for entering the subject\nPress 2 to exit");
      }
    }
  }
}

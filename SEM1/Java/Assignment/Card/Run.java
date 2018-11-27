package com.symbi.Card;
import java.util.*;
import java.io.*;

public class Run {
  private  static void printSubjects() throws IOException{
    FlashCardData fcData = new FlashCardData();
    fcData.loadData();
    ArrayList<String> subjects = fcData.getSubject();
    for (int i=0; i < subjects.size(); i++){
      System.out.println(subjects.get(i));
    }
    System.out.print("Choose Subject : ");
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String subject = input.readLine();
    Card card;
    card = fcData.searchCard(subject);
    System.out.println(card.cardGetQuestion());

    try {
        Thread.sleep(500);
    } catch (InterruptedException e) {
        System.out.println(e);
    }
    System.out.println(card.cardGetAnswer());
}
  // Main method here
  public static void main(String[] args) throws IOException {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while(true){
      System.out.println("\n\n\nPress 1 for entering the subject\nPress 2 to exit");
      System.out.print("Select Option: ");
      String choice = input.readLine();
      switch (choice) {
        case "1":
          printSubjects();
          break;
        case "2":
          System.out.println("Thank you for using my program....\nBye....");
          System.exit(0);
          break;
        default:
          System.out.print("Please Enter Correct Option");
      }
    }
  }
}

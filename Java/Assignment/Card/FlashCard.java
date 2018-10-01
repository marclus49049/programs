package com.symbi.Card;

public class FlashCard extends Card {
  //String subject="", question="", answer="";
  public FlashCard(String subject, String question, String answer){
    cardSetSubject(subject);
    cardSetQuestion(question);
    cardSetAnswer(answer);
  }

  public void displayCard(){
    System.out.println("Subject:"+super.cardGetSubject()+" Question:"+super.cardGetQuestion()+" Answer:"+super.cardGetAnswer());

  }
}

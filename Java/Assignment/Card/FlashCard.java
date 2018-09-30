package com.symbi.Card;

class FlashCard extends Card {
  private String subject="", question="", answer="";
  FlashCard(){
    print("Flash Card Object Created");
  }
  FlashCard(String subject, String question, String answer){
    cardSetSubject(subject);
    cardSetQuestion(question);
    cardSetAnswer(answer);
  }

  public void displayCard(){
    print("Subject:"+card.cardGetSubject()+" Question:"+card.cardGetQuestion()+" Answer:"+card.cardGetAnswer());
  }
}

package com.symbi.Card;

public abstract class Card{
  private String subject, question, answer;
  //setter methods
  void cardSetSubject(String subject){
    this.subject = subject;
  }
  void cardSetAnswer(String answer){
    this.answer = answer;
  }
  void cardSetQuestion(String question){
    this.question = question;
  }

  //getter methods
  String cardGetSubject(){
    return subject;
  }
  String cardGetAnswer(){
    return answer;
  }
  String cardGetQuestion(){
    return question;
  }
}

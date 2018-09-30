package com.symbi.Card;

abstract class Card{
  private String subject, answer, question;

  //setter methods
  abstract void cardSetSubject(String subject);
  abstract void cardSetAnswer(String answer);
  abstract void cardSetQuestion(String question);

  //getter methods
  abstract String cardGetSubject();
  abstract String cardGetAnswer();
  abstract String cardGetQuestion();
}

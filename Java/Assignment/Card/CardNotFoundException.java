package com.symbi.Card;

public class CardNotFoundException extends Exception{
    public CardNotFoundException(String message) {
        System.out.println(message);
    }
}

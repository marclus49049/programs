package com.Acc;
import java.util.*;
class TransactionDemo extends Transactions{
  public TransactionDemo(){

  }
  public static void main(String[] args) {
    HashMap <Integer, ArrayList<Transactions>> hMap = new HashMap <> ();

    Transactions t1 = new Transactions(1, "Deposit", 2000);
    Transactions t2 = new Transactions(2, "Withdraw", 3000);
    ArrayList<Transactions> aList = new ArrayList();
    aList.add(t1);
    aList.add(t2);

    hMap.put(101,aList);
    aList.clear();

    aList.add(new Transactions(1, "Withdraw", 5000));
    aList.add(new Transactions(2, "Withdraw", 2000));
    hMap.put(102, aList);

    TreeSet<Integer> keys = hMap.keySet();
    for(Integer accNo: keys){
      ArrayList <Transactions> tr = new ArrayList<>();
      System.out.prinln("Transaction for account number: "+accNo);
      for (Transactions t: tr){
        System.out.prinln("Transaction "+t.getTrNo+" Type: "+t.getTrType+" Amount: "+t.getTrAmt);
      }
    }
  }
}

package com.Acc;
class Transactions{
  // one transaction can have only one account
  private Integer trNo, trAmt;
  private String trType; //withdraw/deposit

  public Transactions(){

  }

  public Transactions(Integer trNo, String trType, Integer trAmt){
    this.trNo = trNo;
    this.trNo = trNo;
    this.trType = trType;
  }

  //setter methods
  public void setTrNo(int trNo){
    this.trNo = trNo;
  }
  public void setTrAmt(int trAmt){
    this.trAmt = trAmt;
  }
  public void setTrType(String trType){
    this.trType = trType;
  }

  // getter methods
  public Integer getTrNo(){
    return trNo;
  }
  public Integer getTrAmt(){
    return trAmt;
  }
  public String getTrType(){
    return trType;
  }

}

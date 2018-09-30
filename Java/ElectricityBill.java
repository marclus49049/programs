//Get user to enter the no of units and then use those units to calculate the amount;
// 0 - 100 = 2.5, 101 - 300 = 3.5, 301 - 500 = 4.5, 500< = 5;
// if 150 units 100 * 2.5 and then 50 * 3.5;

import java.io.*;

class ElectrcityBill {
    public static void main(String[] args) throws IOException {
      int unitsInput = 0, discountUnits = 0, tempUnits = 0;
      double totalAmount = 0.0;

      InputStreamReader ioStream = new InputStreamReader(System.in);
      BufferedReader input = new BufferedReader(ioStream);

      System.out.println("Enter the total amount of units: ");
      unitsInput = Integer.parseInt(input.readLine());
      tempUnits = unitsInput;

      if(unitsInput>500){
        discountUnits = (unitsInput - 500);
        totalAmount = totalAmount + ( discountUnits * 5);
        unitsInput = unitsInput - discountUnits;
      }
      if (unitsInput>300) {
        discountUnits = (unitsInput - 300);
        totalAmount = totalAmount + ( discountUnits * 4.5);
        unitsInput = unitsInput - discountUnits;
      }
      if(unitsInput>100) {
        discountUnits = (unitsInput - 100);
        totalAmount = totalAmount + ( discountUnits * 3.5);
        unitsInput = unitsInput - discountUnits;
      }
      if (unitsInput>0) {
        discountUnits = (unitsInput - 0);
        totalAmount = totalAmount + ( discountUnits * 2.5);
        unitsInput = unitsInput - discountUnits;
      }

      System.out.println("The total amount for "+tempUnits+" is "+totalAmount);

    } //main
} //class

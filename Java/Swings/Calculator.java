// Marclus Lopes
// Create a Calculator GUI with swings with Add, Sub, Mul, and Div... with 3 label and textField...
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class Calculator implements ActionListener {

  JFrame frame;
  JLabel jLabel1, jLabel2, jLabel3; // Number1, Number2, Result;
  JTextField jTextField1, jTextField2, jTextField3; // Number1, Number2, Result;
  Calculator() {
    frame = new JFrame("Calculator"); // Object of frame

    // JFrame size
    frame.setSize(1000, 600); // width, height

    // Setting frame to visible
    frame.setVisible(true);

    // Creating the elements

      // Labels

      jLabel1 = new JLabel("Number 1");
      jLabel2 = new JLabel("Number 2");
      jLabel3 = new JLabel("Result");

      //TextField

      jTextField1 = new JTextField();  // num1
      jTextField2 = new JTextField();  // num2
      jTextField3 = new JTextField();  // result

      //Buttons
      JButton jButton1, jButton2, jButton3, jButton4, exit; //add, sub, mul, div;

      jButton1 = new JButton("+");
      jButton2 = new JButton("-");
      jButton3 = new JButton("*");
      jButton4 = new JButton("/");
      exit = new JButton("Exit");

    // Adding event to buttons
      jButton1.addActionListener(this);
      jButton2.addActionListener(this);
      jButton3.addActionListener(this);
      jButton4.addActionListener(this);
      exit.addActionListener(this);

    // adding all the elements to the frame

      // adding Labels
      frame.add(jLabel1);
      frame.add(jLabel2);
      frame.add(jLabel3);

      // adding TextFields
      frame.add(jTextField1);
      frame.add(jTextField2);
      frame.add(jTextField3);

      // adding Buttons
      frame.add(jButton1);
      frame.add(jButton2);
      frame.add(jButton3);
      frame.add(jButton4);
      frame.add(exit);

    // Setting bounds of all  the elements

      //label
      int labelWidth = 200, labelHeight = 50;
      jLabel1.setBounds(100, 150, labelWidth, labelHeight); // setBounds(x, y, width, height)
      jLabel2.setBounds(400, 150, labelWidth, labelHeight);
      jLabel3.setBounds(700, 150, labelWidth, labelHeight);

      //textField
      int textWidth = 200, textHeight = 50;
      jTextField1.setBounds(100, 200, textWidth, textHeight);
      jTextField2.setBounds(400, 200, textWidth, textHeight);
      jTextField3.setBounds(700, 200, textWidth, textHeight);

      //button
      int btnWidth = 50, btnHeight = 50;
      jButton1.setBounds(300, 300, btnWidth, btnHeight);
      jButton2.setBounds(400, 300, btnWidth, btnHeight);
      jButton3.setBounds(500, 300, btnWidth, btnHeight);
      jButton4.setBounds(600, 300, btnWidth, btnHeight);
      exit.setBounds(425, 400, btnWidth+50, btnHeight);

    //
    jTextField3.setEnabled(false);

  }
  // implimenting the functionality of the proggram here

  // static <T> T operation(T num1, T num2, String command){
  //   if(num1.getClass() == Double.class){
      // switch(command){
      //   case "+":
      //     return (T) (Double) ((Double)num1 + (Double)num2);
      //     break;
      //   case "-":
      //     return (T) (Double) ((Double)num1 - (Double)num2);
      //     break;
      //   case "*":
      //     return (T) (Double) ((Double)num1 * (Double)num2);
      //     break;
      //   case "/":
      //     return (T) (Double) ((Double)num1 / (Double)num2);
      //     break;
      // }
  //   }else {
  //     switch(command){
  //       case "+":
  //         return (T) (Integer) ((Integer)num1 + (Integer)num2);
  //         break;
  //       case "-":
  //         return (T) (Integer) ((Integer)num1 - (Integer)num2);
  //         break;
  //       case "*":
  //         return (T) (Integer) ((Integer)num1 * (Integer)num2);
  //         break;
  //       case "/":
  //         return (T) (Integer) ((Integer)num1 / (Integer)num2);
  //         break;
  //     }
  //   }
  // }

  // Button Click action is here
  public void actionPerformed (ActionEvent e) {
    Double num1, num2;
    if(e.getActionCommand() == "Exit"){
      System.exit(0);
    }
    // ArrayList num = new ArrayList<>(); // arrayList to store input of type int or double
    // if(e.getActionCommand().equals("Exit")){
    //   System.exit(0);
    // }
    // try{
    //   if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()){
    //     throw new EmptyField("Enter Something into both the fields");
    //   }
    //   num.add(Integer.parseInt(jTextField1.getText()));
    //   num.add(Integer.parseInt(jTextField2.getText()));
    // } catch (EmptyField ex){
    //   JOptionPane.showMessageDialog(frame, ex.getMessage());
    // } catch(NumberFormatException ex){
    //   num.add(Double.parseDouble(jTextField1.getText()));
    //   num.add(Double.parseDouble(jTextField2.getText()));
    // }
    try {
      if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()){
      throw new EmptyField("Enter Some values into both the fields");
      }
      num1 = Double.parseDouble(jTextField1.getText());
      num2 = Double.parseDouble(jTextField2.getText());
      switch(e.getActionCommand()){
        case "+":
          jTextField3.setText(String.valueOf(num1+num2));
          break;
        case "-":
          jTextField3.setText(String.valueOf(num1-num2));
          break;
        case "*":
          jTextField3.setText(String.valueOf(num1*num2));
          break;
        case "/":
          if (num2 == 0){
            throw new ArithmeticException();
          }
          jTextField3.setText(String.valueOf(num1/num2));
          break;
      }
      // operation(num.get(0), num.get(1), e.getActionCommand());
      // switch(e.getActionCommand()){
      //   case "+":
      //     if(num.get(0).getClass() == Double.class){
      //       jTextField3.setText((String)((Double)num.get(0) + (Double)num.get(1)));
      //     }
      //     break;
      // }
    } catch (EmptyField ex){
      JOptionPane.showMessageDialog(frame, ex.getMessage());
    } catch (NumberFormatException ex){
      JOptionPane.showMessageDialog(frame, "Enter Correct Values");
    } catch (ArithmeticException ex) {
      JOptionPane.showMessageDialog(frame, "Number Cant be divided by Zero");
    }
    // System.out.println(e.getActionCommand());
  }


  public static void main(String[] args) {
    new Calculator();
  }
}

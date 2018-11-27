import javax.swing.*; //importing Swings
import java.awt.event.*;

class TestSwing{
  JFrame frame;
  //Constructor (Default)
  TestSwing(){
    frame = new JFrame("Fame Title"); //creating a new JFrame Object

    //Creating a Button object
    JButton buttonArm = new JButton("Armstrong Number");
    buttonArm.setBounds(200, 150, 90, 50);

    JTextField input = new JTextField();
    input.setBounds(200, 90, 90, 50);

    JLabel label = new JLabel("Enter Number");
    label.setBounds(100, 90, 90, 50);

    frame.add(buttonArm); //adding that button object to the frame
    frame.add(input);
    frame.add(label);
    frame.setSize(500, 600); //Setting the frame Size

    frame.setLayout(null);
    frame.setVisible(true); //Making this frame visible

    buttonArm.addActionListener(new ActionListener(){

      public void actionPerformed(ActionEvent e) {
          int num, temp, digit=0, sum= 0;
          num = Integer.parseInt(input.getText());
          temp = num;
          while(temp != 0){
            digit = temp%10;
            sum = sum + (digit*digit*digit);
            temp = temp/10;
          }
          if(num == sum){
            JOptionPane.showMessageDialog(frame, num+" is an Armstrong number");
          } else {
            JOptionPane.showMessageDialog(frame, num+" is not an Armstrong number");
          }
      }
    }); // Prime ends here
  }

  public static void main(String[] args) {
    new TestSwing(); //We are calling the default Constructor here to create the frame and add each element in it
  }
}

package ZipcodeZB;
import ZipcodeZB.Zipcode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPanel extends JPanel{   // jpanel is the base class, GUI panel is the derived class

    private JTextField zipcode;
    private JButton submit;
    private JTextArea output;

    public GUIPanel(){
        this.zipcode = new JTextField("zipcode", 7);
        this.add(this.zipcode);  // static has a class name


        this.submit = new JButton("Submit");
        this.add(submit);
        this.submit.addActionListener;

        this.output = new JTextArea(5, 20);
        this.add(this.output);
        // event handler is like a button press mouse click ect
        new JButton("Northernmost");
        this.output(new JTextArea(getNorthern));
        class SubmitButtonListener implements ActionListener {

            public void actionPerformed(ActionEvent e){
                String code = zipcode.getText();
                output.setText(code);
                
                Zipcode zc = db.search(code);




        }
    }
}

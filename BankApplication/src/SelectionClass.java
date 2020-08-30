import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectionClass implements ActionListener {
    JFrame frame;
    JLabel Welcomelabel= new JLabel("W E L C O M E  TO  O V A N S A  B A N K");
    JButton NewUserBtn = new JButton("New User");
    JButton RtnUserBtn = new JButton("Returning User");

    SelectionClass(){
      createWindow();
      setLocationAndSize();
      addComponentsToFrame();
      actionEvent();
    }

    public void createWindow() {
        frame = new JFrame();
        frame.setTitle("Welcome");
        frame.setBounds(100, 100, 400, 400);
        frame.getContentPane().setBackground(new java.awt.Color(105,105,105));
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    public void setLocationAndSize() {
       Welcomelabel.setBounds(70, 30, 300, 70);
        Welcomelabel.setFont(new Font("arial", Font.BOLD,15));
       NewUserBtn.setBounds(105,110,150,35);
       RtnUserBtn.setBounds(105,150,150,35);

    }
    public void addComponentsToFrame() {
        frame.add(Welcomelabel);
        frame.add(NewUserBtn);
        frame.add(RtnUserBtn);
    }
    public void actionEvent() {
     NewUserBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, "Please proceed to register your details");
             new RegistrationForm();
             frame.dispose();
         }
     });

     RtnUserBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, "Please Log on to your dashboard");
             new LoginForm();
             frame.dispose();
         }
     });
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

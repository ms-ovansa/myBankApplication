import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class LoginForm   implements ActionListener {
    JFrame frame;
    JLabel emailLabel = new JLabel("EMAIL");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField myemailTextField = new JTextField();
    JPasswordField mypasswordField = new JPasswordField();
    JButton registerButton = new JButton("LOGIN");
    JButton resetButton = new JButton("CANCEL");


    LoginForm(){
       mycreateWindow();
       setMyLocationAndSize();
       addmyComponentsToFrame();
        myActionEvent();
    }
    public void mycreateWindow() {
        frame = new JFrame();
        frame.setTitle("Login Form");
        frame.setBounds(40, 40, 380, 350);
        frame.getContentPane().setBackground(new java.awt.Color(105, 105, 105));
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void setMyLocationAndSize() {
        emailLabel.setBounds(20, 20, 80, 70);
        passwordLabel.setBounds(20, 50, 80, 70);
       myemailTextField.setBounds(180, 43, 165, 23);
        mypasswordField.setBounds(180, 80, 165, 23);
        registerButton.setBounds(70, 120, 100, 35);
        resetButton.setBounds(220, 120, 100, 35);

    }
    public void addmyComponentsToFrame() {
        frame.add(emailLabel);
        frame.add(passwordLabel);
        frame.add(myemailTextField);
        frame.add(mypasswordField);
        frame.add(registerButton);
        frame.add(resetButton);

    }
    public void myActionEvent() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==registerButton) {
                    try {
                        //Creating Connection Object
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/RegistrationDB", "root", "sashu");
                        //Preapared Statement
                        PreparedStatement Pstatement = connection.prepareStatement("select name from newuser where email=? and pass=?");
                        Pstatement.setString(1, myemailTextField.getText());
                        Pstatement.setString(2, mypasswordField.getText());

                     ResultSet rs= Pstatement.executeQuery();
                     if (rs.next()){
                         JOptionPane.showMessageDialog(null, "Login Successful "  ,"Alert", JOptionPane.PLAIN_MESSAGE);
                         new ConfirmationScreen();
                         frame.dispose();
                     }
                     else {
                         JOptionPane.showMessageDialog(null, "Incorrect  email-ID or Password.. Try  again  with  correct  details "  ,"Alert", JOptionPane.PLAIN_MESSAGE);

                     }

                    }
                    catch (SQLException e1) {
                        e1.printStackTrace();
                    }

                    }
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

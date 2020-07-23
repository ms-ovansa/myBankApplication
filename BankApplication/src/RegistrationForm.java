import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm implements ActionListener {
    JFrame frame;
    String[] gender = {"Male", "Female"};
    JLabel nameLabel = new JLabel("NAME");
    JLabel genderLabel = new JLabel("GENDER");
    JLabel fatherNameLabel = new JLabel("SURNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JLabel confirmPasswordLabel = new JLabel("CONFIRM PASSWORD");
    JLabel addressLabel = new JLabel("ADDRESS");
    JLabel emailLabel = new JLabel("EMAIL");
    JTextField nameTextField = new JTextField();
    JComboBox genderComboBox = new JComboBox(gender);
    JTextField fatherTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JPasswordField confirmPasswordField = new JPasswordField();
    JTextField cityTextField = new JTextField();
    JTextField emailTextField = new JTextField();
    JButton registerButton = new JButton("REGISTER");
    JButton resetButton = new JButton("CANCEL");


    RegistrationForm() {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();


    }

    //private void jButton1ActionPerformed(java.awt.event.ActionEvent even){

    //}
    public void createWindow() {
        frame = new JFrame();
        frame.setTitle("Registration Form");
        frame.setBounds(40, 40, 380, 600);
        frame.getContentPane().setBackground(new java.awt.Color(105,105,105));
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void setLocationAndSize() {
        nameLabel.setBounds(20, 20, 40, 70);
        genderLabel.setBounds(20, 70, 80, 70);
        fatherNameLabel.setBounds(20, 120, 100, 70);
        passwordLabel.setBounds(20, 170, 100, 70);
        confirmPasswordLabel.setBounds(20, 220, 140, 70);
        addressLabel.setBounds(20, 270, 100, 70);
        emailLabel.setBounds(20, 320, 100, 70);
        nameTextField.setBounds(180, 43, 165, 23);
        genderComboBox.setBounds(180, 93, 165, 23);
        fatherTextField.setBounds(180, 143, 165, 23);
        passwordField.setBounds(180, 193, 165, 23);
        confirmPasswordField.setBounds(180, 243, 165, 23);
        cityTextField.setBounds(180, 293, 165, 23);
        emailTextField.setBounds(180, 343, 165, 23);
        registerButton.setBounds(70, 400, 100, 35);
        resetButton.setBounds(220, 400, 100, 35);
    }

    public void addComponentsToFrame() {
        frame.add(nameLabel);
        frame.add(fatherNameLabel);
        frame.add(genderLabel);
        frame.add(passwordLabel);
        frame.add(confirmPasswordLabel);
        frame.add(addressLabel);
        frame.add(emailLabel);
        frame.add(nameTextField);
        frame.add(genderComboBox);
        frame.add(fatherTextField);
        frame.add(passwordField);
        frame.add(confirmPasswordField);
        frame.add(cityTextField);
        frame.add(emailTextField);
        frame.add(registerButton);
        frame.add(resetButton);
    }

    public void actionEvent() {
        //Adding Action Listener to buttons
        //registerButton.addActionListener(this);
        //resetButton.addActionListener(this);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new ConfirmationScreen();
                frame.dispose();


                JOptionPane.showMessageDialog(registerButton, "Data successfully registered, your account number is : ", "Alert", JOptionPane.PLAIN_MESSAGE);


            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JOptionPane.showMessageDialog(resetButton, "Please fill the required boxes ", "Alert", JOptionPane.WARNING_MESSAGE);


            }
        });


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


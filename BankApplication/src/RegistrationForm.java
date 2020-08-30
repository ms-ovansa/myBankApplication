import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationForm implements ActionListener {
    JFrame frame;
    String[] gender = {"Male", "Female"};
    JLabel nameLabel = new JLabel("FIRST NAME");
    JLabel MiddleLabel = new JLabel("MIDDLE NAME");
    JLabel genderLabel = new JLabel("GENDER");
    JLabel fatherNameLabel = new JLabel("SURNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JLabel confirmPasswordLabel = new JLabel("CONFIRM PASSWORD");
    JLabel addressLabel = new JLabel("ADDRESS");
    JLabel emailLabel = new JLabel("EMAIL");
    JTextField nameTextField = new JTextField();
    JTextField MiddleLabelTextField = new JTextField();
    JComboBox genderComboBox = new JComboBox(gender);
    JTextField fatherTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JPasswordField confirmPasswordField = new JPasswordField();
    JTextField cityTextField = new JTextField();
    JTextField emailTextField = new JTextField();
    JButton registerButton = new JButton("REGISTER");
    JButton resetButton = new JButton("CANCEL");

    long accNumber = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
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
        frame.getContentPane().setBackground(new java.awt.Color(105, 105, 105));
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void setLocationAndSize() {
        nameLabel.setBounds(20, 20, 80, 70);
        MiddleLabel.setBounds(20, 50, 80, 70);
        genderLabel.setBounds(20, 83, 80, 70);
        fatherNameLabel.setBounds(20, 120, 100, 70);
        passwordLabel.setBounds(20, 170, 100, 70);
        confirmPasswordLabel.setBounds(20, 220, 140, 70);
        addressLabel.setBounds(20, 270, 100, 70);
        emailLabel.setBounds(20, 320, 100, 70);
        nameTextField.setBounds(180, 43, 165, 23);
        MiddleLabelTextField.setBounds(180, 80, 165, 23);
        genderComboBox.setBounds(180, 110, 165, 23);
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
        frame.add(MiddleLabel);
        frame.add(fatherNameLabel);
        frame.add(genderLabel);
        frame.add(passwordLabel);
        frame.add(confirmPasswordLabel);
        frame.add(addressLabel);
        frame.add(emailLabel);
        frame.add(nameTextField);
        frame.add(genderComboBox);
        frame.add(MiddleLabelTextField);
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
              //  boolean status = Validation.email_Validation(emailTextField.getText());




                if (e.getSource() == registerButton){
                    try {
                        //Creating Connection Object
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/RegistrationDB", "root", "sashu");
                        //Preapared Statement
                        PreparedStatement Pstatement = connection.prepareStatement("insert into newuser values(?,?,?,?,?,?,?,?)");

                        //Specifying the values of it's parameter
                       /* Pstatement.setString(1, nameTextField.getText());
                        Pstatement.setString(2, MiddleLabelTextField.getText());
                        Pstatement.setString(3, genderComboBox.getSelectedItem().toString());
                        Pstatement.setString(4, fatherTextField.getText());
                        Pstatement.setString(5, passwordField.getText());
                        Pstatement.setString(6, confirmPasswordField.getText());
                        Pstatement.setString(7, cityTextField.getText());
                        Pstatement.setString(8, emailTextField.getText());*/
                        //validation
                        if (nameTextField.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "First name is required");
                        } else {
                            Pstatement.setString(1, nameTextField.getText());
                        }
                        Pstatement.setString(2, MiddleLabelTextField.getText());
                        Pstatement.setString(3, genderComboBox.getSelectedItem().toString());
                        if (fatherTextField.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Surname is required");
                        } else {
                            Pstatement.setString(4, fatherTextField.getText());
                        }

                        //Checking for the Password match
                        if (passwordField.getText().equalsIgnoreCase(confirmPasswordField.getText())) {
                            //Executing query
                            //JOptionPane.showMessageDialog(null, "Password correct");
                            Pstatement.setString(5, passwordField.getText());
                            Pstatement.setString(6, confirmPasswordField.getText());
                        } else {
                            JOptionPane.showMessageDialog(null, "password did not match");
                        }
                        if (cityTextField.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please enter your address");

                        } else {
                            Pstatement.setString(7, cityTextField.getText());
                        }
                        if (emailTextField.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "email address is required");

                        } else {
                            Pstatement.setString(8, emailTextField.getText());
                            JOptionPane.showMessageDialog(registerButton, "Data successfully registered, your account number is : " + accNumber, "Alert", JOptionPane.PLAIN_MESSAGE);
                            new ConfirmationScreen();
                            frame.dispose();
                        }


                        Pstatement.executeUpdate();

                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }


                }

            }
        });


        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (e.getSource() == resetButton) {
                    //Clearing Fields
                    nameTextField.setText("");
                    genderComboBox.setSelectedItem("Male");
                    fatherTextField.setText("");
                    passwordField.setText("");
                    confirmPasswordField.setText("");
                    cityTextField.setText("");
                    emailTextField.setText("");
                }
                JOptionPane.showMessageDialog(resetButton, "Please fill the required boxes ", "Alert", JOptionPane.WARNING_MESSAGE);

            }
        });


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


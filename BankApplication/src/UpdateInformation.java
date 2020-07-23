import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateInformation implements ActionListener {
    JFrame frame;
    JLabel DobLabel = new JLabel("Date of Birth");
    JLabel PhoneLabel = new JLabel("Phone Number");
    JLabel NextofkinLabel = new JLabel("Next of Kin");
    JLabel NoKAddressLabel = new JLabel("Next of Kin Address");
    JLabel NoKPhoneLabel = new JLabel("Next of Kin Phone Number");
    JTextField DobTextField = new JTextField();
    JTextField PhoneTextField = new JTextField();
    JTextField NextofKinField = new JTextField();
    JTextField NokAddressField = new JTextField();
    JTextField NoKPhoneTextField = new JTextField();
    JButton updateButton = new JButton("UPDATE");
    JButton resetButton = new JButton("RESET");

    UpdateInformation() {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();

    }

    public void createWindow() {
        frame = new JFrame();
        frame.setTitle("Update Information");
        frame.setBounds(40, 40, 380, 600);
        frame.getContentPane().setBackground(new java.awt.Color(105,105,105));
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void setLocationAndSize() {
        DobLabel.setBounds(20, 20, 70, 70);
        PhoneLabel.setBounds(20, 70, 100, 70);
        NextofkinLabel.setBounds(20, 120, 100, 70);
        NoKAddressLabel.setBounds(20, 170, 120, 70);
        NoKPhoneLabel.setBounds(20, 220, 150, 70);
        DobTextField.setBounds(180, 43, 165, 23);
        PhoneTextField.setBounds(180, 93, 165, 23);
        NextofKinField.setBounds(180, 143, 165, 23);
        NokAddressField.setBounds(180, 193, 165, 23);
        NoKPhoneTextField.setBounds(180, 243, 165, 23);
        updateButton.setBounds(70, 300, 100, 35);
        resetButton.setBounds(220, 300, 100, 35);
    }

    public void addComponentsToFrame() {
        frame.add(DobLabel);
        frame.add(PhoneLabel);
        frame.add(NextofkinLabel);
        frame.add(NoKAddressLabel);
        frame.add(NoKPhoneLabel);
        frame.add(DobTextField);
        frame.add(PhoneTextField);
        frame.add(NextofKinField);
        frame.add(NokAddressField);
        frame.add(NoKPhoneTextField);
        frame.add(updateButton);
        frame.add(resetButton);
    }

    public void actionEvent() {
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JOptionPane.showMessageDialog(updateButton, "Data successfully updated ", "Alert", JOptionPane.PLAIN_MESSAGE);


            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JOptionPane.showMessageDialog(resetButton, "Please complete your registration ", "Alert", JOptionPane.WARNING_MESSAGE);


            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

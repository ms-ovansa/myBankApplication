import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmationScreen implements ActionListener {
    JFrame frame;
    JLabel WelcomeLabel = new JLabel("WELCOME TO OVANSA BANK ");
    JLabel successlabel = new JLabel(" Please select your next transaction from the given menu ");
    JButton depositBtn = new JButton("Payments");
    JButton UpdateBtn = new JButton("Update Information");

    ConfirmationScreen() {
        createScreenWindow();
        setLocationAndSize();
        addComponentsToFrame();
        depositBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new Deposits();
                frame.dispose();

                JOptionPane.showMessageDialog(depositBtn, "Welcome!", "Alert", JOptionPane.PLAIN_MESSAGE);


            }
        });

        UpdateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new UpdateInformation();
                frame.dispose();
                JOptionPane.showMessageDialog(UpdateBtn, "Please complete your registration", "Alert", JOptionPane.WARNING_MESSAGE);

            }
        });
    }


    public void createScreenWindow() {
        frame = new JFrame();
        frame.setTitle("Confirmation Screen");
        frame.setBounds(100, 100, 600, 600);
        frame.getContentPane().setBackground(new java.awt.Color(105,105,105));
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void setLocationAndSize() {
        WelcomeLabel.setBounds(100, 50, 500, 35);
      //  WelcomeLabel.setForeground(new java.awt.Color(128, 0, 0));
        WelcomeLabel.setFont(new Font("Serif", Font.BOLD, 30));
        successlabel.setBounds(20, 100, 600, 35);
        //successlabel.setForeground(new java.awt.Color(128, 0, 0));
        successlabel.setFont(new Font("Serif", Font.BOLD, 16));
        depositBtn.setBounds(180, 250, 165, 23);
        //depositBtn.setForeground(new java.awt.Color(255, 127, 80));
        //depositBtn.setBackground(new java.awt.Color(128, 0, 0));
        depositBtn.setFont(new Font("Serif", Font.BOLD, 14));
        UpdateBtn.setBounds(180, 325, 165, 23);
        //UpdateBtn.setForeground(new java.awt.Color(255, 127, 80));
       // UpdateBtn.setBackground(new java.awt.Color(128, 0, 0));
        //UpdateBtn.setFont(new Font("Serif", Font.BOLD, 14));

    }

    public void addComponentsToFrame() {
        frame.add(WelcomeLabel);
        frame.add(successlabel);
        frame.add(depositBtn);
        frame.add(UpdateBtn);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transfers implements ActionListener {
    JFrame frame;
    String[] banks = {"Select bank", "GTB", "Zenith Bank", "UnionBank", "First Bank", "EcoBank", "Stanbic Bank", "Fidelity Bank", "FCMB", "Access Bank"};
    JLabel BalanceLabel = new JLabel("#0.00 ");
    JTextField amountInFiguresLabel = new JTextField("Amount To Transfer in Figures ");
    JComboBox banksComboBox = new JComboBox(banks);
    JButton tansferBtn = new JButton("Transfer");
    JButton cancel = new JButton("Cancel");

    Transfers() {
        createScreenWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }

    public void createScreenWindow() {
        frame = new JFrame();
        frame.setTitle("Transfers");
        frame.setBounds(100, 100, 600, 600);
        frame.getContentPane().setBackground(new java.awt.Color(105,105,105));
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void setLocationAndSize() {
        BalanceLabel.setBounds(280, 50, 500, 35);
       // BalanceLabel.setForeground(new java.awt.Color(128, 0, 0));
        BalanceLabel.setFont(new Font("Serif", Font.BOLD, 40));
        amountInFiguresLabel.setBounds(20, 200, 600, 35);
        //amountInFiguresLabel.setForeground(new java.awt.Color(128, 0, 0));
        amountInFiguresLabel.setFont(new Font("Serif", Font.BOLD, 14));
        banksComboBox.setBounds(20, 280, 600, 35);
        //banksComboBox.setForeground(new java.awt.Color(128, 0, 0));
        banksComboBox.setFont(new Font("Serif", Font.BOLD, 14));
        tansferBtn.setBounds(50, 350, 100, 35);
        //tansferBtn.setForeground(new java.awt.Color(128, 0, 0));
        tansferBtn.setFont(new Font("Serif", Font.BOLD, 14));
        cancel.setBounds(350, 350, 100, 35);
        //cancel.setForeground(new java.awt.Color(128, 0, 0));
        cancel.setFont(new Font("Serif", Font.BOLD, 14));
    }

    public void addComponentsToFrame() {
        frame.add(BalanceLabel);
        frame.add(amountInFiguresLabel);
        frame.add(banksComboBox);
        frame.add(tansferBtn);
        frame.add(cancel);
    }

    public void actionEvent() {
        tansferBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JOptionPane.showMessageDialog(tansferBtn, "Transaction successful your new account balance is : ", "Alert", JOptionPane.PLAIN_MESSAGE);


            }
        });

        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JOptionPane.showMessageDialog(cancel, "Transaction cancelled ", "Alert", JOptionPane.ERROR_MESSAGE);


            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

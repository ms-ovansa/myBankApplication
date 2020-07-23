import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Withdrawal implements ActionListener {
    JFrame frame;
    JLabel BalanceLabel = new JLabel("#0.00 ");
    JTextField withdrawInFiguresLabel = new JTextField("Amount in Figures ");
    JButton Withdraw = new JButton("Withdraw");
    JButton cancel = new JButton("Cancel");

    Withdrawal() {
        createScreenWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }

    public void createScreenWindow() {
        frame = new JFrame();
        frame.setTitle("Withdrawals");
        frame.setBounds(100, 100, 600, 600);
        frame.getContentPane().setBackground(new java.awt.Color(105,105,105));
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void setLocationAndSize() {
        BalanceLabel.setBounds(280, 50, 500, 35);
        //BalanceLabel.setForeground(new java.awt.Color(128, 0, 0));
        BalanceLabel.setFont(new Font("Serif", Font.BOLD, 40));
        withdrawInFiguresLabel.setBounds(20, 200, 600, 35);
        //withdrawInFiguresLabel.setForeground(new java.awt.Color(128, 0, 0));
        withdrawInFiguresLabel.setFont(new Font("Serif", Font.BOLD, 14));
        Withdraw.setBounds(50, 325, 100, 35);
        //Withdraw.setForeground(new java.awt.Color(128, 0, 0));
        Withdraw.setFont(new Font("Serif", Font.BOLD, 14));
        cancel.setBounds(350, 325, 100, 35);
        //cancel.setForeground(new java.awt.Color(128, 0, 0));
        cancel.setFont(new Font("Serif", Font.BOLD, 14));
    }

    public void addComponentsToFrame() {
        frame.add(BalanceLabel);
        frame.add(withdrawInFiguresLabel);
        frame.add(Withdraw);
        frame.add(cancel);
    }

    public void actionEvent() {
        Withdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JOptionPane.showMessageDialog(Withdraw, "Transaction successful your new account balance is : ", "Alert", JOptionPane.PLAIN_MESSAGE);


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

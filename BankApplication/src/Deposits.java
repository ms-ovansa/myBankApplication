import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposits implements ActionListener {
    JFrame frame;
    JLabel BalanceLabel = new JLabel("#0.00 ");
    JTextField amountInWordLabel = new JTextField("Amount in words ");
    JTextField amountInFiguresLabel = new JTextField("Amount in Figures ");
    JButton deposits = new JButton("Deposit");
    JButton cancel = new JButton("Cancel");

    Deposits() {
        createScreenWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }

    public void createScreenWindow() {
        frame = new JFrame();
        frame.setTitle("Deposits");
        frame.setBounds(100, 100, 600, 600);
        frame.getContentPane().setBackground(new java.awt.Color(105,105,105));
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void setLocationAndSize() {
        BalanceLabel.setBounds(280, 50, 500, 35);
     //   BalanceLabel.setForeground(new java.awt.Color(255, 110, 199));
        BalanceLabel.setFont(new Font("Serif", Font.BOLD, 40));
        amountInWordLabel.setBounds(20, 100, 600, 35);
       // amountInWordLabel.setForeground(new java.awt.Color(255, 110, 199));
        amountInWordLabel.setFont(new Font("Serif", Font.BOLD, 16));
        amountInFiguresLabel.setBounds(20, 200, 600, 35);
        //amountInFiguresLabel.setForeground(new java.awt.Color(255, 110, 199));
        amountInFiguresLabel.setFont(new Font("Serif", Font.BOLD, 14));
        deposits.setBounds(50, 325, 100, 35);
        //deposits.setForeground(new java.awt.Color(255, 110, 199));
        deposits.setFont(new Font("Serif", Font.BOLD, 14));
        cancel.setBounds(350, 325, 100, 35);
        //cancel.setForeground(new java.awt.Color(255, 110, 199));
        cancel.setFont(new Font("Serif", Font.BOLD, 14));
    }

    public void addComponentsToFrame() {
        frame.add(BalanceLabel);
        frame.add(amountInWordLabel);
        frame.add(amountInFiguresLabel);
        frame.add(deposits);
        frame.add(cancel);
    }

    public void actionEvent() {
        deposits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JOptionPane.showMessageDialog(deposits, "Transaction successful your new account balance is : ", "Alert", JOptionPane.PLAIN_MESSAGE);


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

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposits implements ActionListener {
    JFrame frame;
    JLabel wordLabel = new JLabel();
    JLabel BalanceLabel = new JLabel();
    JLabel choiceLabel = new JLabel();
    JTextField amountInFiguresLabel = new JTextField();
    ButtonGroup buttonGroup = new ButtonGroup();
    JButton depositButton = new JButton("Deposit");
    JButton WithdrawButton = new JButton("Withdraw");
    JButton TransferButton = new JButton("Transfer");
    JButton submitBtn = new JButton("Submit");
    private double balance = 0.00;

    JButton cancel = new JButton("Cancel Transaction");

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
        frame.getContentPane().setBackground(new java.awt.Color(105, 105, 105));
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    public void setLocationAndSize() {
        wordLabel.setBounds(130, 20, 500, 35);
        wordLabel.setFont(new Font("Serif", Font.BOLD, 16));
        wordLabel.setText("Welcome to Ovansa Bank your! Your current account balance is:  ");
        BalanceLabel.setText("0.00");
        BalanceLabel.setBounds(200, 50, 500, 35);
        //   BalanceLabel.setForeground(new java.awt.Color(255, 110, 199));
        BalanceLabel.setFont(new Font("Serif", Font.BOLD, 40));
        choiceLabel.setBounds(130, 100, 600, 35);
        choiceLabel.setText("Please select your next transaction");
        // amountInWordLabel.setForeground(new java.awt.Color(255, 110, 199));
        choiceLabel.setFont(new Font("Serif", Font.BOLD, 16));
        amountInFiguresLabel.setBounds(20, 200, 600, 35);
        amountInFiguresLabel.setText("enter an amount in figures");
        amountInFiguresLabel.setFont(new Font("Serif", Font.BOLD, 16));
        depositButton.setBounds(170, 250, 110, 35);
        depositButton.setFont(new Font("Serif", Font.BOLD, 14));
        WithdrawButton.setBounds(170, 300, 110, 35);
        WithdrawButton.setFont(new Font("Serif", Font.BOLD, 14));
        TransferButton.setBounds(170, 350, 110, 35);
        TransferButton.setFont(new Font("Serif", Font.BOLD, 14));
        submitBtn.setBounds(50, 425, 100, 35);
        submitBtn.setFont(new Font("Serif", Font.BOLD, 14));
        cancel.setBounds(100, 450, 260, 35);
        cancel.setFont(new Font("Serif", Font.BOLD, 14));
    }

    public void addComponentsToFrame() {
        frame.add(wordLabel);
        frame.add(BalanceLabel);
        frame.add(choiceLabel);
        frame.add(amountInFiguresLabel);
        buttonGroup.add(depositButton);
        buttonGroup.add(WithdrawButton);
        buttonGroup.add(TransferButton);
        frame.add(depositButton);
        frame.add(WithdrawButton);
        frame.add(TransferButton);
        //frame.add(submitBtn);
        frame.add(cancel);
    }

    public void actionEvent() {

        depositButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountInFiguresLabel.getText());

                //  double balance = 0.00;
                if (amount == 0) {
                    JOptionPane.showMessageDialog(null, "Enter an amount");
                } else if (e.getSource() == depositButton) {
                    JOptionPane.showMessageDialog(null, "you have deposited: " + amount);

                    balance += amount;
                    BalanceLabel.setText(String.valueOf(balance));
                }
            }
        });
        WithdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountInFiguresLabel.getText());


                if (e.getSource() == WithdrawButton) {
                    if (balance < amount) {
                        JOptionPane.showMessageDialog(null, "you cannot withdraw more than your balance");
                    } else {
                        JOptionPane.showMessageDialog(null, "you have withdrawn: " + amount);
                        balance -= amount;
                        BalanceLabel.setText(String.valueOf(balance));
                    }
                }
            }
        });
        TransferButton.addActionListener(this);


        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == cancel) {
                    //Clearing Fields
                    amountInFiguresLabel.setText("enter an amount in figures");
                }
                JOptionPane.showMessageDialog(cancel, "Transaction cancelled ", "Alert", JOptionPane.ERROR_MESSAGE);


            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

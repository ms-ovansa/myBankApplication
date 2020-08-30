import javax.swing.*;
import java.awt.*;

public class SplashScreen {
    JFrame frame=new JFrame();
    JLabel image = new JLabel(new ImageIcon("C:/Users/HP/Downloads/banks.jpg"));
    JLabel text = new JLabel("O V A N S A   B A N K");
    JProgressBar progressBar= new JProgressBar();
    JLabel message = new JLabel();
    SplashScreen(){
        createGui();
        addImage();
        addText();
        addProgressBar();
        addMessage();
        runningBar();
    }

   public void createGui() {
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);
       frame.setBounds(100, 100, 600, 700);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new java.awt.Color(105,105,105));
        frame.setVisible(true);


    }
    public void addImage(){
        image.setSize(600,650);
        frame.add(image);
    }
    public void addText(){
        text.setFont(new Font("arial", Font.BOLD,26));
        text.setBounds(150,45,600,40);
        text.setForeground(Color.BLACK);
        image.add(text);
    }
    public void addMessage(){
        message.setBounds(250,675,200,40);
        message.setForeground(Color.BLACK);
        message.setFont(new Font("arial", Font.BOLD,15));
        frame.add(message);
    }
    public void addProgressBar(){
        progressBar.setBounds(75,655,500,30);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.BLACK);
        progressBar.setValue(0);
        frame.add(progressBar);
    }
    public void runningBar(){
        int i=0;
        while(i<=100){
            try {
                Thread.sleep(100);
                progressBar.setValue(i);
                message.setText("LOADING" + Integer.toString(i) + "%");
                i++;
                if(i==100)

                    frame.dispose();

            }catch (Exception e){
                e.printStackTrace();
            }

        }
        new SelectionClass();
    }
}

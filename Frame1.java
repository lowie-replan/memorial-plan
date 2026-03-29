import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Frame1 extends JFrame implements ActionListener {

    JButton enter;
    JTextField text1, text2, text3;
    public Frame1(){

        JLabel memo = new JLabel("Memorial");
        memo.setBounds(55,120,300,70);
        memo.setFont(new Font("Serif",Font.ITALIC,70));
        memo.setForeground(Color.WHITE);

        JLabel plan = new JLabel("Plan");
        plan.setBounds(120,190,250,70);
        plan.setFont(new Font("Serif",Font.ITALIC,70));
        plan.setForeground(new Color(255,233,80));

        JLabel quote = new JLabel("\"Your Partner In Life\"");
        quote.setBounds(75,250,300,70);
        quote.setFont(new Font("Serif",Font.ITALIC,25));
        quote.setForeground(Color.WHITE);

        JLabel border = new JLabel();
        border.setBounds(390,55,200,350);
        border.setBorder(BorderFactory.createLineBorder(Color.white));
        border.setBackground(new Color(61,120,87));
        border.setOpaque(true);

        JLabel firstName = new JLabel("First Name");
        firstName.setBounds(440,70,300,70);
        firstName.setFont(new Font("Serif",Font.ITALIC,25));
        firstName.setForeground(Color.WHITE);

        JLabel lastName = new JLabel("Last Name");
        lastName.setBounds(440,140,300,70);
        lastName.setFont(new Font("Serif",Font.ITALIC,25));
        lastName.setForeground(Color.WHITE);

        JLabel middleName = new JLabel("Middle Name");
        middleName.setBounds(420,210,300,70);
        middleName.setFont(new Font("Serif",Font.ITALIC,25));
        middleName.setForeground(Color.WHITE);

        text1 = new JTextField();
        text1.setBounds(405,123,170,20);

        text2 = new JTextField();
        text2.setBounds(405,193,170,20);

        text3 = new JTextField();
        text3.setBounds(405,263,170,20);

        enter = new JButton("ENTER");
        enter.setBounds(430,325,120,40);
        enter.setBackground(new Color(61,120,87));
        enter.setBorder(BorderFactory.createLineBorder(Color.white));
        enter.setForeground(Color.WHITE);
        enter.addActionListener(this);

        ImageIcon image = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/1st.jpg")));
        JLabel im_age = new JLabel(image);
        im_age.setSize(650,500);

        setSize(650,500);
        int w = this.getWidth();
        int h = this.getHeight();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screen.width/2)-(w/2),((screen.height/2)-(h/2)),w,h);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        add(firstName);
        add(lastName);
        add(middleName);
        add(text1);
        add(text2);
        add(text3);
        add(enter);
        add(memo);
        add(quote);
        add(plan);
        add(border);
        add(im_age);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==enter) {
            this.dispose();
            String firstName = text1.getText();
            String lastName = text2.getText();
            String middle = text3.getText();
            char element = middle.charAt(0);
            new Frame2(firstName, lastName, element);
        }
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Frame3 extends JFrame implements ActionListener {

    JButton threeYears, twoYears, oneYear, thirtyDay, sixtyDays, spotCash, finish;
    int equate;
    String category;
    JLabel myBorder3, myBorder4, myBorder5, myBorder6;
    public Frame3(int lot_price, String category){

        this.category = category;
        equate = lot_price;

        ImageIcon image = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/1st.jpg")));
        JLabel im_age = new JLabel(image);
        im_age.setSize(800,500);

        JLabel memo = new JLabel("Memorial");
        memo.setBounds(15,3,100,25);
        memo.setFont(new Font("Serif",Font.ITALIC,18));
        memo.setForeground(Color.WHITE);

        JLabel plan = new JLabel("Plan");
        plan.setBounds(33,20,100,25);
        plan.setFont(new Font("Serif",Font.ITALIC,18));
        plan.setForeground(new Color(255,233,80));

        JLabel border10 = new JLabel("Choose Payment For : " + this.category);
        border10.setBounds(0,45,800,26);
        border10.setBorder(BorderFactory.createLineBorder(Color.white));
        border10.setFont(new Font("Serif",Font.BOLD,18));
        border10.setForeground(Color.WHITE);
        border10.setHorizontalAlignment(JLabel.CENTER);
        border10.setBackground(new Color(61,120,87));
        border10.setOpaque(true);

        JLabel border = new JLabel();
        border.setBounds(0,70,500,325);
        border.setBorder(BorderFactory.createLineBorder(Color.white));

        JLabel border2 = new JLabel();
        border2.setBounds(499,70,299,325);
        border2.setBorder(BorderFactory.createLineBorder(Color.white));


        myBorder3 = new JLabel("");
        myBorder3.setBounds(0,180,500,60);
        myBorder3.setBackground(new Color(61,120,87));
        myBorder3.setForeground(Color.WHITE);
        myBorder3.setFont(new Font("Consolas",Font.PLAIN,20));
        myBorder3.setOpaque(true);
        myBorder3.setHorizontalAlignment(JLabel.CENTER);

        myBorder4 = new JLabel("");
        myBorder4.setBounds(0,257,500,60);
        myBorder4.setBackground(new Color(61,120,87));
        myBorder4.setForeground(Color.WHITE);
        myBorder4.setFont(new Font("Consolas",Font.PLAIN,20));
        myBorder4.setOpaque(true);
        myBorder4.setHorizontalAlignment(JLabel.CENTER);

        myBorder5 = new JLabel("");
        myBorder5.setBounds(0,335,500,60);
        myBorder5.setBackground(new Color(61,120,87));
        myBorder5.setForeground(Color.WHITE);
        myBorder5.setFont(new Font("Consolas",Font.PLAIN,20));
        myBorder5.setOpaque(true);
        myBorder5.setHorizontalAlignment(JLabel.CENTER);

        myBorder6 = new JLabel("");
        myBorder6.setBounds(510,250,260,135);
        myBorder6.setFont(new Font("Serif",Font.BOLD,20));
        myBorder6.setForeground(Color.WHITE);
        myBorder6.setBorder(BorderFactory.createLineBorder(Color.white));
        myBorder6.setBackground(new Color(61,120,87));
        myBorder6.setHorizontalAlignment(JLabel.CENTER);
        myBorder6.setOpaque(true);

        threeYears = new JButton("3 YEARS");
        threeYears.setBounds(11,85,150,80);
        threeYears.setFont(new Font("Serif",Font.BOLD,20));
        threeYears.setForeground(new Color(255,233,80));
        threeYears.setBorder(BorderFactory.createLineBorder(Color.white));
        threeYears.setBackground(new Color(61,120,87));
        threeYears.setFocusable(false);
        threeYears.addActionListener(this);

        twoYears = new JButton("2 YEARS");
        twoYears.setBounds(175,85,150,80);
        twoYears.setFont(new Font("Serif",Font.BOLD,20));
        twoYears.setForeground(new Color(255,233,80));
        twoYears.setBorder(BorderFactory.createLineBorder(Color.white));
        twoYears.setBackground(new Color(61,120,87));
        twoYears.setFocusable(false);
        twoYears.addActionListener(this);

        oneYear = new JButton("1 YEAR");
        oneYear.setBounds(340,85,150,80);
        oneYear.setFont(new Font("Serif",Font.BOLD,20));
        oneYear.setForeground(new Color(255,233,80));
        oneYear.setBorder(BorderFactory.createLineBorder(Color.white));
        oneYear.setBackground(new Color(61,120,87));
        oneYear.setFocusable(false);
        oneYear.addActionListener(this);

        spotCash = new JButton("SPOT CASH");
        spotCash.setBounds(510,85,260,40);
        spotCash.setFont(new Font("Serif",Font.BOLD,20));
        spotCash.setForeground(new Color(255,233,80));
        spotCash.setBackground(new Color(61,120,87));
        spotCash.setFocusable(false);
        spotCash.addActionListener(this);

        thirtyDay = new JButton("30 DAYS");
        thirtyDay.setBounds(510,140,260,40);
        thirtyDay.setFont(new Font("Serif",Font.BOLD,20));
        thirtyDay.setForeground(new Color(255,233,80));
        thirtyDay.setBackground(new Color(61,120,87));
        thirtyDay.setFocusable(false);
        thirtyDay.addActionListener(this);

        sixtyDays = new JButton("60 DAYS");
        sixtyDays.setBounds(510,195,260,40);
        sixtyDays.setFont(new Font("Serif",Font.BOLD,20));
        sixtyDays.setForeground(new Color(255,233,80));
        sixtyDays.setBackground(new Color(61,120,87));
        sixtyDays.setFocusable(false);
        sixtyDays.addActionListener(this);

        finish = new JButton("CONFIRM");
        finish.setBounds(610,410,150,30);
        finish.setFont(new Font("Serif",Font.BOLD,20));
        finish.setForeground(new Color(255,233,80));
        finish.setBorder(BorderFactory.createLineBorder(Color.white));
        finish.setBackground(new Color(61,120,87));
        finish.setFocusable(false);
        finish.addActionListener(this);

        setSize(800,500);
        int w = this.getWidth();
        int h = this.getHeight();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screen.width/2)-(w/2),((screen.height/2)-(h/2)),w,h);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        add(memo);
        add(plan);
        add(myBorder3);
        add(myBorder4);
        add(myBorder5);
        add(myBorder6);
        add(border10);
        add(threeYears);
        add(finish);
        add(twoYears);
        add(oneYear);
        add(spotCash);
        add(thirtyDay);
        add(sixtyDays);
        add(border2);
        add(border);
        add(im_age);

    }
    public void actionPerformed(ActionEvent e) {

        MP pay;

        if (e.getSource() == threeYears) {
            pay = new MP(equate, 50, 36);
        } else if (e.getSource() == twoYears) {
            pay = new MP(equate, 25, 24);
        } else if (e.getSource() == oneYear) {
            pay = new MP(equate, 15, 12);
        } else if (e.getSource() == sixtyDays) {
            pay = new MP(equate, 5, 60);
        } else if (e.getSource() == thirtyDay) {
            pay = new MP(equate, 10, 30);
        } else {
            pay = new MP(equate, 15, 1);
        }

        int interest = pay.getInterest();
        int month = pay.getMonths();
        MP payment = new MP(equate, interest, month);
        if (e.getSource() == threeYears || e.getSource() == twoYears || e.getSource() == oneYear) {
            myBorder6.setText("");
            myBorder3.setText("INTEREST : Php" + payment.getYearInterest());
            myBorder4.setText("CONTRACT PRICE : Php" + payment.getContractPrice());
            myBorder5.setText("MONTHLY PAYMENT : Php" + payment.getMonthlyPayment());
        }else{
            myBorder3.setText("");
            myBorder4.setText("");
            myBorder5.setText("");
            myBorder6.setText("LESS " + interest + "% : Php" + payment.getLess());
        }
        if (e.getSource() == finish){
            this.dispose();
            new Close();
        }
    }
}

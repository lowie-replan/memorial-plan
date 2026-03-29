import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Frame2 extends JFrame implements ActionListener {

    JButton regular;
    JButton innerWalk;
    JButton walk;
    JButton innerDrive;
    JButton drive;
    JButton proceed, proceed2, proceed3, proceed4, proceed5;
    JLabel  vatPercent;
    JLabel lot;
    JLabel pcf2;
    JLabel sellingPrice2;
    JLabel down;
    JLabel bal;

    public Frame2(String firstName, String lastName, char element){

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

        JLabel border = new JLabel();
        border.setBounds(0,70,230,500);
        border.setBorder(BorderFactory.createLineBorder(Color.white));

        JLabel border2 = new JLabel();
        border2.setBounds(229,119,142,140);
        border2.setBorder(BorderFactory.createLineBorder(Color.white));

        JLabel border3 = new JLabel();
        border3.setBounds(370,119,142,140);
        border3.setBorder(BorderFactory.createLineBorder(Color.white));

        JLabel border4 = new JLabel();
        border4.setBounds(511,119,110,140);
        border4.setBorder(BorderFactory.createLineBorder(Color.white));

        JLabel border5 = new JLabel();
        border5.setBounds(620,119,164,140);
        border5.setBorder(BorderFactory.createLineBorder(Color.white));

        JLabel border6 = new JLabel();
        border6.setBounds(229,119,569,60);
        border6.setBorder(BorderFactory.createLineBorder(Color.white));

        JLabel border7 = new JLabel();
        border7.setBounds(229,285,555,45);
        border7.setBorder(BorderFactory.createLineBorder(Color.white));

        JLabel border8 = new JLabel();
        border8.setBounds(229,285,555,90);
        border8.setBorder(BorderFactory.createLineBorder(Color.white));
        border8.setBackground(new Color(61,120,87));
        border8.setOpaque(true);

        JLabel border9 = new JLabel();
        border9.setBounds(229,178,569,81);
        border9.setBorder(BorderFactory.createLineBorder(Color.white));
        border9.setBackground(new Color(61,120,87));
        border9.setOpaque(true);

        JLabel border10 = new JLabel(lastName + ",  " + firstName + "  " + element + ".");
        border10.setBounds(0,45,800,26);
        border10.setBorder(BorderFactory.createLineBorder(Color.white));
        border10.setFont(new Font("Serif",Font.BOLD,13));
        border10.setForeground(Color.WHITE);
        border10.setHorizontalAlignment(JLabel.CENTER);
        border10.setBackground(new Color(61,120,87));
        border10.setOpaque(true);

        JLabel vat = new JLabel("VAT ( 12% )");
        vat.setBounds(250,119,142,60);
        vat.setFont(new Font("Serif",Font.ITALIC,20));
        vat.setForeground(Color.WHITE);

        vatPercent = new JLabel("");
        vatPercent.setBounds(265,195,130,60);
        vatPercent.setForeground(new Color(255,233,80));
        vatPercent.setFont(new Font("Consolas",Font.PLAIN,20));

        JLabel lotPrice = new JLabel("LOT PRICE");
        lotPrice.setBounds(390,119,142,60);
        lotPrice.setFont(new Font("Serif",Font.ITALIC,20));
        lotPrice.setForeground(Color.WHITE);

        lot = new JLabel("");
        lot.setBounds(395,195,130,60);
        lot.setForeground(new Color(255,233,80));
        lot.setFont(new Font("Consolas",Font.PLAIN,20));

        JLabel pcf = new JLabel("PCF");
        pcf.setBounds(548,119,142,60);
        pcf.setFont(new Font("Serif",Font.ITALIC,20));
        pcf.setForeground(Color.WHITE);

        pcf2 = new JLabel("");
        pcf2.setBounds(527,195,130,60);
        pcf2.setForeground(new Color(255,233,80));
        pcf2.setFont(new Font("Consolas",Font.PLAIN,20));

        JLabel sellingPrice = new JLabel("SELLING PRICE");
        sellingPrice.setBounds(633,119,142,60);
        sellingPrice.setFont(new Font("Serif",Font.ITALIC,20));
        sellingPrice.setForeground(Color.WHITE);

        sellingPrice2 = new JLabel("");
        sellingPrice2.setBounds(657,195,130,60);
        sellingPrice2.setForeground(new Color(255,233,80));
        sellingPrice2.setFont(new Font("Consolas",Font.PLAIN,20));

        JLabel downPayment = new JLabel("DOWN PAYMENT : " );
        downPayment.setBounds(240,278,350,60);
        downPayment.setFont(new Font("Serif",Font.ITALIC,20));
        downPayment.setForeground(Color.WHITE);

        down = new JLabel("");
        down.setBounds(424,282,130,60);
        down.setForeground(new Color(255,233,80));
        down.setFont(new Font("Consolas",Font.PLAIN,20));

        JLabel balancePrice = new JLabel("BALANCE PRICE : ");
        balancePrice.setBounds(240,320,200,60);
        balancePrice.setFont(new Font("Serif",Font.ITALIC,20));
        balancePrice.setForeground(Color.WHITE);

        bal = new JLabel("");
        bal.setBounds(424,325,130,60);
        bal.setForeground(new Color(255,233,80));
        bal.setFont(new Font("Consolas",Font.PLAIN,20));

        JLabel category = new JLabel("CATEGORIES");
        category.setBounds(0,70,230,50);
        category.setFont(new Font("Serif",Font.BOLD,20));
        category.setForeground(Color.LIGHT_GRAY);
        category.setBorder(BorderFactory.createLineBorder(Color.white));
        category.setBackground(new Color(61,120,87));
        category.setOpaque(true);
        category.setHorizontalAlignment(JLabel.CENTER);

        JLabel descriptions = new JLabel("DESCRIPTIONS");
        descriptions.setBounds(229,70,555,50);
        descriptions.setFont(new Font("Serif",Font.BOLD,20));
        descriptions.setForeground(Color.LIGHT_GRAY);
        descriptions.setBorder(BorderFactory.createLineBorder(Color.white));
        descriptions.setBackground(new Color(61,120,87));
        descriptions.setOpaque(true);
        descriptions.setHorizontalAlignment(JLabel.CENTER);

        regular = new JButton("REGULAR");
        regular.setBounds(50,140,130,40);
        regular.setFont(new Font("Serif",Font.BOLD,15));
        regular.setBorder(BorderFactory.createLineBorder(Color.white));
        regular.setBackground(new Color(61,120,87));
        regular.setForeground(new Color(255,233,80));
        regular.setFocusable(false);
        regular.addActionListener(this);

        innerWalk = new JButton("INNER WALK");
        innerWalk.setBounds(50,200,130,40);
        innerWalk.setFont(new Font("Serif",Font.BOLD,15));
        innerWalk.setBorder(BorderFactory.createLineBorder(Color.white));
        innerWalk.setBackground(new Color(61,120,87));
        innerWalk.setForeground(new Color(255,233,80));
        innerWalk.setFocusable(false);
        innerWalk.addActionListener(this);

        walk = new JButton("WALK");
        walk.setBounds(50,260,130,40);
        walk.setFont(new Font("Serif",Font.BOLD,15));
        walk.setBorder(BorderFactory.createLineBorder(Color.white));
        walk.setBackground(new Color(61,120,87));
        walk.setForeground(new Color(255,233,80));
        walk.setFocusable(false);
        walk.addActionListener(this);

        innerDrive = new JButton("INNER DRIVE");
        innerDrive.setBounds(50,320,130,40);
        innerDrive.setFont(new Font("Serif",Font.BOLD,15));
        innerDrive.setBorder(BorderFactory.createLineBorder(Color.white));
        innerDrive.setBackground(new Color(61,120,87));
        innerDrive.setForeground(new Color(255,233,80));
        innerDrive.setFocusable(false);
        innerDrive.addActionListener(this);

        drive = new JButton("DRIVE");
        drive.setBounds(50,380,130,40);
        drive.setFont(new Font("Serif",Font.BOLD,15));
        drive.setBorder(BorderFactory.createLineBorder(Color.white));
        drive.setBackground(new Color(61,120,87));
        drive.setForeground(new Color(255,233,80));
        drive.setFocusable(false);
        drive.addActionListener(this);

        proceed = new JButton("PROCEED DRIVE");
        proceed.setBounds(410,397,210,30);
        proceed.setFont(new Font("Serif",Font.BOLD,15));
        proceed.setBorder(BorderFactory.createLineBorder(Color.white));
        proceed.setBackground(new Color(61,120,87));
        proceed.setForeground(new Color(255,233,80));
        proceed.setFocusable(false);
        proceed.addActionListener(this);
        proceed.setVisible(false);

        proceed2 = new JButton("PROCEED INNER DRIVE");
        proceed2.setBounds(410,397,210,30);
        proceed2.setFont(new Font("Serif",Font.BOLD,15));
        proceed2.setBorder(BorderFactory.createLineBorder(Color.white));
        proceed2.setBackground(new Color(61,120,87));
        proceed2.setForeground(new Color(255,233,80));
        proceed2.setFocusable(false);
        proceed2.addActionListener(this);
        proceed2.setVisible(false);

        proceed3 = new JButton("PROCEED WALK");
        proceed3.setBounds(410,397,210,30);
        proceed3.setFont(new Font("Serif",Font.BOLD,15));
        proceed3.setBorder(BorderFactory.createLineBorder(Color.white));
        proceed3.setBackground(new Color(61,120,87));
        proceed3.setForeground(new Color(255,233,80));
        proceed3.setFocusable(false);
        proceed3.addActionListener(this);
        proceed3.setVisible(false);

        proceed4 = new JButton("PROCEED INNER WALK");
        proceed4.setBounds(410,397,210,30);
        proceed4.setFont(new Font("Serif",Font.BOLD,15));
        proceed4.setBorder(BorderFactory.createLineBorder(Color.white));
        proceed4.setBackground(new Color(61,120,87));
        proceed4.setForeground(new Color(255,233,80));
        proceed4.setFocusable(false);
        proceed4.addActionListener(this);
        proceed4.setVisible(false);

        proceed5 = new JButton("PROCEED REGULAR");
        proceed5.setBounds(410,397,210,30);
        proceed5.setFont(new Font("Serif",Font.BOLD,15));
        proceed5.setBorder(BorderFactory.createLineBorder(Color.white));
        proceed5.setBackground(new Color(61,120,87));
        proceed5.setForeground(new Color(255,233,80));
        proceed5.setFocusable(false);
        proceed5.addActionListener(this);
        proceed5.setVisible(false);


        setSize(800,500);
        int w = this.getWidth();
        int h = this.getHeight();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screen.width/2)-(w/2),((screen.height/2)-(h/2)),w,h);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        add(border);
        add(vat);
        add(vatPercent);
        add(border2);
        add(lotPrice);
        add(lot);
        add(pcf);
        add(pcf2);
        add(sellingPrice);
        add(sellingPrice2);
        add(downPayment);
        add(down);
        add(balancePrice);
        add(bal);
        add(memo);
        add(plan);
        add(category);
        add(descriptions);
        add(regular);
        add(innerWalk);
        add(walk);
        add(innerDrive);
        add(drive);
        add(proceed);
        add(proceed2);
        add(proceed3);
        add(proceed4);
        add(proceed5);
        add(border10);
        add(border3);
        add(border4);
        add(border5);
        add(border6);
        add(border7);
        add(border8);
        add(border9);
        add(im_age);
    }
    public void actionPerformed(ActionEvent e) {

        int lot_price;
        String category;
        MP categories;
        if (e.getSource() == drive || e.getSource() == proceed) {
            categories = new MP(21250);
            lot_price = categories.getLotPrice();
            category = "DRIVE";
            proceed2.setVisible(false);
            proceed3.setVisible(false);
            proceed4.setVisible(false);
            proceed5.setVisible(false);
            proceed.setVisible(true);
        } else if (e.getSource() == innerDrive || e.getSource() == proceed2) {
            categories = new MP(19600);
            lot_price = categories.getLotPrice();
            category = "INNER DRIVE";
            proceed.setVisible(false);
            proceed3.setVisible(false);
            proceed4.setVisible(false);
            proceed5.setVisible(false);
            proceed2.setVisible(true);
        } else if (e.getSource() == walk || e.getSource() == proceed3) {
            categories = new MP(17950);
            lot_price = categories.getLotPrice();
            category = "WALK";
            proceed.setVisible(false);
            proceed2.setVisible(false);
            proceed4.setVisible(false);
            proceed5.setVisible(false);
            proceed3.setVisible(true);
        } else if (e.getSource() == innerWalk || e.getSource() == proceed4) {
            categories = new MP(16300);
            lot_price = categories.getLotPrice();
            category = "INNER WALK";
            proceed.setVisible(false);
            proceed2.setVisible(false);
            proceed3.setVisible(false);
            proceed5.setVisible(false);
            proceed4.setVisible(true);
        } else {
            categories = new MP(13000);
            lot_price = categories.getLotPrice();
            category = "REGULAR";
            proceed.setVisible(false);
            proceed2.setVisible(false);
            proceed3.setVisible(false);
            proceed4.setVisible(false);
            proceed5.setVisible(true);
        }

        if (e.getSource() == proceed) {
            this.dispose();
            new Frame3(lot_price,category);
        }
        if (e.getSource() == proceed2) {
                this.dispose();
                new Frame3(lot_price,category);
            }
        if (e.getSource() == proceed3) {
                this.dispose();
                new Frame3(lot_price,category);
            }
        if (e.getSource() == proceed4) {
                this.dispose();
                new Frame3(lot_price,category);
            }
        if (e.getSource() == proceed5) {
                    this.dispose();
                    new Frame3(lot_price,category);
                }


                MP values = new MP(lot_price);
                vatPercent.setText("Php" + values.getVat());
                lot.setText("Php" + values.getLotPrice());
                pcf2.setText("Php" + values.getPCF());
                sellingPrice2.setText("Php" + values.getSellingPrice());
                down.setText("Php" + values.getDownPayment());
                int result = values.getSellingPrice() - values.getDownPayment();
                bal.setText("Php" + result);


            }
}


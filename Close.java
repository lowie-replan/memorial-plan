import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Close extends JFrame {

    Close(){

        ImageIcon image = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/1st.jpg")));
        JLabel im_age = new JLabel(image);
        im_age.setSize(500,350);

        JLabel myBorder6 = new JLabel("== TRANSACTION COMPLETED ==");
        myBorder6.setBounds(0,120,599,80);
        myBorder6.setFont(new Font("Serif",Font.BOLD,30));
        myBorder6.setForeground(Color.WHITE);
        myBorder6.setBorder(BorderFactory.createLineBorder(Color.white));
        myBorder6.setBackground(new Color(61,120,87));
        myBorder6.setHorizontalAlignment(JLabel.CENTER);
        myBorder6.setOpaque(true);

        setSize(600,400);
        int w = this.getWidth();
        int h = this.getHeight();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screen.width/2)-(w/2),((screen.height/2)-(h/2)),w,h);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        add(myBorder6);
        add(im_age);

    }
}

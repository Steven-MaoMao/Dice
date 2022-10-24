import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dice {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("什么是赛博骰子啊？？？\\(^_^)/");
        jframe.setSize(1000, 1000);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel jlabel = new JLabel("???");
        jlabel.setFont(new Font(null, Font.PLAIN, 400));

        Box hbox1 = Box.createHorizontalBox();
        hbox1.add(jlabel);

        JButton d3 = new JButton("1d3");
        JButton d6 = new JButton("1d6");
        JButton d10 = new JButton("1d10");
        JButton d100 = new JButton("1d100");
        JButton init = new JButton("复原");

        d3.setFont(new Font(null, Font.PLAIN, 40));
        d6.setFont(new Font(null, Font.PLAIN, 40));
        d10.setFont(new Font(null, Font.PLAIN, 40));
        d100.setFont(new Font(null, Font.PLAIN, 40));
        init.setFont(new Font(null, Font.PLAIN, 40));

        d3.setPreferredSize(new Dimension(160,100));
        d3.setMaximumSize(new Dimension(160,100));
        d6.setPreferredSize(new Dimension(160,100));
        d6.setMaximumSize(new Dimension(160,100));
        d10.setPreferredSize(new Dimension(160,100));
        d10.setMaximumSize(new Dimension(160,100));
        d100.setPreferredSize(new Dimension(160,100));
        d100.setMaximumSize(new Dimension(160,100));
        init.setPreferredSize(new Dimension(160,100));
        init.setMaximumSize(new Dimension(160,100));

        d3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jlabel.setText(String.valueOf((int) (Math.random() * 3 + 1)));
            }
        });
        d6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jlabel.setText(String.valueOf((int) (Math.random() * 6 + 1)));
            }
        });
        d10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jlabel.setText(String.valueOf((int) (Math.random() * 10 + 1)));
            }
        });
        d100.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jlabel.setText(String.valueOf((int) (Math.random() * 100 + 1)));
            }
        });
        init.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jlabel.setText("???");
            }
        });

        Box hbox2 = Box.createHorizontalBox();
        hbox2.add(Box.createHorizontalGlue());
        hbox2.add(d3);
        hbox2.add(Box.createHorizontalGlue());
        hbox2.add(d6);
        hbox2.add(Box.createHorizontalGlue());
        hbox2.add(d10);
        hbox2.add(Box.createHorizontalGlue());
        hbox2.add(d100);
        hbox2.add(Box.createHorizontalGlue());
        hbox2.add(init);
        hbox2.add(Box.createHorizontalGlue());

        Box vbox = Box.createVerticalBox();
        vbox.add(Box.createVerticalGlue());
        vbox.add(hbox1);
        vbox.add(Box.createVerticalGlue());
        vbox.add(hbox2);
        vbox.add(Box.createVerticalGlue());

        jframe.setContentPane(vbox);
        jframe.setVisible(true);
    }
}
package MilanMadrid;


import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MilanMadrid extends JFrame {
    private int s1=0,s2=0;
    Font font = new Font("Verdana", Font.PLAIN, 18);
    private JLabel score;
    private JLabel last;
    JButton buttonA = new JButton("AC Milan");
    JButton buttonR = new JButton("Real Madrid");
    JButton buttonSS = new JButton("end");
    public MilanMadrid() {
        super("Score");
        setLayout(new FlowLayout());
        setSize(260,140);
        add(buttonA);
        score = new JLabel();
        score.setFont(font);
        score.setText("0:0");
        add(score);
        add(buttonR);
        last = new JLabel();
        last.setFont(font);
        last.setText("last scorer - ?????????");
        add(last);
        buttonA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s1++;
                score.setText(s1+":"+s2);
                last.setText("last scorer - AC Milan");
            }
        });
        buttonR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s2++;
                score.setText(s1+":"+s2);
                last.setText("last scorer - Real Madrid");
            }
        });
        add(buttonSS);
        buttonSS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (s1>s2){
                    JOptionPane.showMessageDialog(null, "winner - AC Milan");
                }
                else if (s1<s2) {
                    JOptionPane.showMessageDialog(null, "Real Madrid");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Draw!");
                }
            }
        });
    }
    public static void main(String[]args)
    {
        new MilanMadrid().setVisible(true);
    }
}

package pertemuan_4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ainan
 */
public class HelloBorderLayout extends JFrame {
    public HelloBorderLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel labelPertanyaan = new JLabel("Apakah ibukota Indonesia?");
        JLabel labelHasil = new JLabel("Jawab pertanyaan di atas");
                
                JButton buttonA = new JButton("Jakarta");
                JButton buttonB = new JButton("Bandung");
                JButton buttonC = new JButton("Surabaya");
                
                buttonA.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        labelHasil.setText("Jawaban anda benar");
                    }
                });
                
                buttonB.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        labelHasil.setText("Jawaban anda salah");
                    }
                });
                
                buttonC.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        labelHasil.setText("Jawaban anda salah");
                    }
                });
                
                this.add(labelPertanyaan, BorderLayout.NORTH);
                this.add(labelHasil, BorderLayout.SOUTH);
                this.add(buttonA, BorderLayout.WEST);
                this.add(buttonB, BorderLayout.CENTER);
                this.add(buttonC, BorderLayout.EAST);
                
                this.setSize(400, 200);
    }
                public static void main(String[] args) {
                    javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        HelloBorderLayout f = new HelloBorderLayout();
                        f.setVisible(true);
                }
});
}
}

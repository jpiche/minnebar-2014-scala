
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonApp extends JPanel {

    protected JButton a, b;

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("ButtonApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonApp app = new ButtonApp();
        app.setOpaque(true);
        frame.setContentPane(app);

        frame.pack();
        frame.setVisible(true);
    }

    public ButtonApp() {
        a = new JButton("A");
        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a.setEnabled(false);
                b.setEnabled(true);
            }
        });

        b = new JButton("B");
        b.setEnabled(false);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b.setEnabled(false);
                a.setEnabled(true);
            }
        });

        add(a);
        add(b);
    }
}

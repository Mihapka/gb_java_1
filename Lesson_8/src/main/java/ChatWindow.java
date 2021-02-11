import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow extends JFrame {

    public ChatWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        JTextField field = new JTextField();
        JButton button = new JButton("");
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        add(button);
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText(field.getText());
                field.setText("");
            }
        });
        setLayout(new BorderLayout());
        add(button, BorderLayout.CENTER);
        add(field, BorderLayout.SOUTH);
        setVisible(true);
    }
}

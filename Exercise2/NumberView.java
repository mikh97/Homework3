import javax.swing.*;
import java.awt.*;

public class NumberView extends JFrame {
    Numbers model;

    public NumberView(int n1, int n2, int n3, Numbers model) {

        // NumberView -> Model -> GraphView
        this.model = model;

        add(new JLabel("Red"));
        JTextField redNumber = new JTextField(40);
        redNumber.setText(n1 + "");
        add(redNumber);

        add(new JLabel("Cyan"));
        JTextField cyanNumber = new JTextField(40);
        cyanNumber.setText(n2 + "");
        add(cyanNumber);

        add(new JLabel("Orange"));
        JTextField orangeNumber = new JTextField(40);
        orangeNumber.setText(n3 + "");
        add(orangeNumber);

        JButton update = new JButton("Update");
        add(update);
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        update.addActionListener(event -> {
            int number1 = Integer.parseInt(redNumber.getText());
            int number2 = Integer.parseInt(cyanNumber.getText());
            int number3 = Integer.parseInt(orangeNumber.getText());
            model.updateValues(number1, number2, number3);
        });


    }
}

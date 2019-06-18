import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyMathListener implements ActionListener {

    TextField num1, num2, sum;
    public MyMathListener(TextField num1, TextField
            num2,  TextField sum) {
        this.num1 = num1;
        this.num2 = num2;
        this.sum = sum;
    }

    public void actionPerformed(ActionEvent e) {
        int i1 = Integer.parseInt(num1.getText());
        int i2 = Integer.parseInt(num2.getText());
        sum.setText("" + i1 + i2);
    }
}

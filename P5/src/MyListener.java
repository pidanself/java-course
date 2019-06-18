import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class MyListener implements ActionListener {

    private TFMathTest2 tfmt;

    public MyListener(TFMathTest2 tfmt) {
        this.tfmt = tfmt;
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tfmt.num1.getText();
        String s2 = tfmt.num2.getText();
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        tfmt.sum.setText(String.valueOf(i1 + i2));
    }
}

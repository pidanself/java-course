import java.awt.*;

public class TFMathTest2 extends Frame{
    TextField num1; TextField num2; TextField sum;
    public static void main(String[] args) {
        new TFMathTest2().launchFrame();
    }
    public void launchFrame() {
        num1 = new TextField(); num1.setColumns(10);
        num2 = new TextField(); num2.setColumns(10);
        sum = new TextField(); sum.setColumns(15);
        setLayout(new FlowLayout());
        Label lblPlus = new Label("+");
        Button btnEqual = new Button("=");
        btnEqual.addActionListener(new MyListener(this));
        add(num1); add(lblPlus);add(num2); add(btnEqual);
        add(sum); pack();
        setVisible(true);
    }
}
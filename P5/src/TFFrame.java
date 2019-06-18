import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.javafx.css.SizeUnits.PX;

class TFFrame extends Frame {
    TextField num1, num2, num3;
    public void launchFrame() {

        num2 = new TextField(10);
        num2.setBounds(5,5,500,500);
        num3 = new TextField(15);
        num3.setBounds(5,5,5,5);
        Label lblPlus = new Label("input ID");
        Button btnEqual = new Button("=");
        btnEqual.addActionListener(new MyMonitor());
        Frame f = new Frame("BorderLayout");
        f.setLayout(new BorderLayout());
        f.add("North",lblPlus);
        f.add(num2,);
        f.add("East",btnEqual);
        f.add("West",num3);
        f.setSize(2000,2000);
        f.setVisible(true);
    }
    private class MyMonitor implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            num3.setText("读取数据库");
        }
    }
}
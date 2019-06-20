import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class BaseWindowParts {
      private JPanel panel;
      public BaseWindowParts(JPanel panel){
    	  this.panel = panel;
      }

      public JTextField DrawTextFild(int x,int y,int width,int height,Color color,Font font){
    	  JTextField NeedFild = new JTextField();
    	  NeedFild.setBounds(x, y, width, height);
    	  NeedFild.setForeground(color);
    	  NeedFild.setFont(font);
    	  NeedFild.setBorder(null);
    	  panel.add(NeedFild);
    	  return NeedFild;
      }
      
      /**/
      public JPasswordField DrawPasswordFild(int x,int y,int width,int height,Color color,Font font){
    	  JPasswordField NeedPasswordFild = new JPasswordField();
    	  NeedPasswordFild.setBounds(x, y, width, height);
    	  NeedPasswordFild.setForeground(color);
    	  NeedPasswordFild.setFont(font);
    	  NeedPasswordFild.setBorder(null);
    	  panel.add(NeedPasswordFild);
    	  return NeedPasswordFild;
      }
      
      

      public JTextArea DrawTextArea(int x,int y,int width,int height,Color color,Font font){
    	  JTextArea NeedArea = new JTextArea();
    	  NeedArea.setBounds(x, y, width, height);
    	  NeedArea.setForeground(color);
    	  NeedArea.setFont(font);
    	  NeedArea.setBorder(null);
    	  panel.add(NeedArea);
    	  return NeedArea;
      }
      

      public JButton DrawButton(int x,int y,int width,int height,Color color,Font font,String name){
    	  JButton NeedButton = new JButton(name);
    	  NeedButton.setBounds(x, y, width, height);
    	  NeedButton.setForeground(color);
    	  NeedButton.setFont(font);
    	  NeedButton.setBorder(null);
    	  panel.add(NeedButton);
    	  return NeedButton;
      }
}

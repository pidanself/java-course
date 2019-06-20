import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientWindow{
	  public ClientWindow() {
		// TODO Auto-generated constructor stub
		  
		 ImageIcon bg = new ImageIcon("C:\\Users\\Administrator\\Pictures\\Saved Pictures\\HZMB_ZH-CN5238831909_1920x1080.jpg");
   	     JLabel label = new JLabel(bg);
         label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
         JFrame frame = new JFrame("客户端");
         frame.setBounds(0,0,425,325);
         frame.setLocationRelativeTo(null);

         frame.getLayeredPane().add(label,new Integer (Integer.MIN_VALUE));
         JPanel jpanel = (JPanel)frame.getContentPane();
  	     jpanel.setOpaque(false);                                     
  	     JPanel panel = new JPanel();
  	     panel.setLayout(null);
  	    Font font = new Font("微软雅黑",1,15);
  	    
	    
  	    JLabel userlabel = new JLabel("姓名");
  	    userlabel.setBounds(25,26,50,25);
  	    userlabel.setFont(font);
  	    panel.add(userlabel);
  	    
  	    JLabel ilabel = new JLabel("学号");
	    ilabel.setBounds(25,66,50,25);
	    ilabel.setFont(font);
	    panel.add(ilabel);
  	   
	    JLabel slabel = new JLabel("性别");
	    slabel.setBounds(25,106,50,25);
	    slabel.setFont(font);
	    panel.add(slabel);
	    
	    JLabel glabel = new JLabel("年级");
	    glabel.setBounds(25,146,50,25);
	    glabel.setFont(font);
	    panel.add(glabel);
	    
	    JLabel majorlabel = new JLabel("专业");
	    majorlabel.setBounds(25,186,50,25);
	    majorlabel.setFont(font);
	    panel.add(majorlabel);
	    
	    JLabel iplabel = new JLabel("住址ַ");
	    iplabel.setBounds(25,226,50,25);
	    iplabel.setFont(font);
	    panel.add(iplabel);
	    
  	    BaseWindowParts bwp = new BaseWindowParts(panel);
  	   
  	    Color color = new Color(192,192,0);
  	    
  	    JTextField username = bwp.DrawTextFild(95, 26, 230, 25, new Color(192,192,192), font);
  	    
  	    JTextField id = bwp.DrawTextFild(95, 66, 230, 25, new Color(192,192,192), font);
  	    
  	    JTextField sex= bwp.DrawTextFild(95, 106, 230, 25, new Color(192,192,192), font);
  	    
  	    JTextField gl = bwp.DrawTextFild(95, 146, 230, 25, new Color(192,192,192), font);
  	    
  	    JTextField major = bwp.DrawTextFild(95, 186, 230, 25, new Color(192,192,192), font);
  	 
  	    JTextField address = bwp.DrawTextFild(95, 226, 230, 25, color, font);
  	    
  	    Color buttoncolor = new Color(9,192,254);
  	    JButton buttonlogin = bwp.DrawButton(95, 290, 230, 30, buttoncolor, font, "发送");
  	    
  	    panel.setOpaque(false);
	    
	    frame.setBackground(new Color(0,192,192));
	    frame.setSize(425, 425);
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.add(panel);
  	 //JButton buttonregiste = bwp.DrawButton(95, 325, 230, 30, buttoncolor, font, "ע��");
  	    buttonlogin.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				String name = username.getText();
				String ids = id.getText();
				String sexs = sex.getText();
				String gls = gl.getText();
				String majors = major.getText();
				String addresss = address.getText(); 
				System.out.println(name);
				clientO client = new clientO();
				try {
					client.coo(name, ids, sexs, gls, majors, addresss);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
	
		});
  	      
  	    
	 }
	  
	  public static void main(String[] args){
		  ClientWindow ll =new ClientWindow();
		  
	  }
    	  
}


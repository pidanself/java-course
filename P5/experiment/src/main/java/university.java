import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * ActionListener：按钮监听事件
 * @author Administrator
 */
public class university{

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        JFrame frame = new JFrame("university");//创建一个带标题的窗口对象frame
        frame.setVisible(true);//显示窗口
        frame.setSize(3600, 1900);//设置窗口大小
        frame.setLocationRelativeTo(null);//设置窗口居中
        frame.setDefaultCloseOperation(3);//点击X关闭程序  3为结束程序

        frame.setLayout(null);//清空布局

        JLabel label = new JLabel("学号");
        label.setBounds(20,20,100,50);
        label.setFont(new Font("宋体",Font.BOLD,40));
        frame.add(label);

        TextField textField1 = new TextField();
        textField1.setBounds(160, 20, 300, 50);
        textField1.setFont(new Font("宋体",Font.BOLD,40));
        textField1.setBackground(Color.white);
        frame.add(textField1);
        JButton  button = new JButton("查找");
        button.setBounds(500,20,100,50);
        button.setFont(new Font("宋体",Font.BOLD,30));
        button.setBackground(Color.orange);
        frame.add(button);
        TextField textField2 = new TextField();
        textField2.setBounds(20, 100, 1600, 100);
        textField2.setFont(new Font("宋体",Font.BOLD,40));
        textField2.setBackground(Color.white);
        frame.add(textField2);

        MyActionListener myActionListener = new MyActionListener(textField1,textField2);//创建一个按钮监听事件对象
        //添加myActionListener监听事件
        button.addActionListener(myActionListener);



        //以下为注册学生的代码
        JLabel label1 = new JLabel("id");
        label1.setBounds(20,500,100,50);
        label1.setFont(new Font("宋体",Font.BOLD,40));
        frame.add(label1);
        TextField textField3 = new TextField();
        textField3.setBounds(160, 500, 300, 50);
        textField3.setFont(new Font("宋体",Font.BOLD,40));
        textField3.setBackground(Color.white);


        JLabel label2 = new JLabel("姓名");
        label2.setBounds(20,600,100,50);
        label2.setFont(new Font("宋体",Font.BOLD,40));
        frame.add(label2);
        TextField textField4 = new TextField();
        textField4.setBounds(160, 600, 300, 50);
        textField4.setFont(new Font("宋体",Font.BOLD,40));
        textField4.setBackground(Color.white);

        JLabel label3 = new JLabel("性别");
        label3.setBounds(20,700,100,50);
        label3.setFont(new Font("宋体",Font.BOLD,40));
        frame.add(label3);
        TextField textField5 = new TextField();
        textField5.setBounds(160, 700, 300, 50);
        textField5.setFont(new Font("宋体",Font.BOLD,40));
        textField5.setBackground(Color.white);

        JLabel label4 = new JLabel("年龄");
        label4.setBounds(20,800,100,50);
        label4.setFont(new Font("宋体",Font.BOLD,40));
        frame.add(label4);
        TextField textField6 = new TextField();
        textField6.setBounds(160, 800, 300, 50);
        textField6.setFont(new Font("宋体",Font.BOLD,40));
        textField6.setBackground(Color.white);

        JLabel label5 = new JLabel("班级");
        label5.setBounds(20,900,100,50);
        label5.setFont(new Font("宋体",Font.BOLD,40));
        frame.add(label5);
        TextField textField7 = new TextField();
        textField7.setBounds(160, 900, 300, 50);
        textField7.setFont(new Font("宋体",Font.BOLD,40));
        textField7.setBackground(Color.white);

        JLabel label6 = new JLabel("省份");
        label6.setBounds(20,1000,100,50);
        label6.setFont(new Font("宋体",Font.BOLD,40));
        frame.add(label6);
        TextField textField8 = new TextField();
        textField8.setBounds(160, 1000, 300, 50);
        textField8.setFont(new Font("宋体",Font.BOLD,40));
        textField8.setBackground(Color.white);

        JButton  button1 = new JButton("注册");
        button1.setBounds(100,1100,100,50);
        button1.setFont(new Font("宋体",Font.BOLD,30));
        button1.setBackground(Color.orange);
        frame.add(button1);
        MyActionListener1 myActionListener1 = new MyActionListener1(textField3,textField4, textField5,textField6,textField7,textField8);//创建一个按钮监听事件对象
        //添加myActionListener监听事件
        button1.addActionListener(myActionListener1);

        frame.add(textField3);
        frame.add(textField4);
        frame.add(textField5);
        frame.add(textField6);
        frame.add(textField7);
        frame.add(textField8);

    }

}
class MyActionListener implements ActionListener {
    private TextField textField1,textField2;

    public MyActionListener(TextField textField1,TextField textField2) {
        super();
        this.textField1 = textField1;
        this.textField2 = textField2;
    }

    ////每按一次按钮，此方法都会自动调用一次
    @Override
    public void actionPerformed(ActionEvent e) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            // 加载驱动类
            Class.forName("com.mysql.jdbc.Driver");
            long start = System.currentTimeMillis();
            //建立连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/unniversity", "root", "root");
            long end = System.currentTimeMillis();
            System.out.println(conn);
            // 创建Statement对象
            stmt = conn.prepareStatement("SELECT * FROM student WHERE id = ?");
            int id =Integer.parseInt(textField1.getText());
            stmt.setInt(1,id);
            //执行语句并得到结果
            rs=stmt.executeQuery();
            //遍历结果
            String ans="";
            while(rs.next()){
                ans="学号："+rs.getString(1)
                        +" 姓名："+rs.getString("name")+
                        " 性别："+rs.getString("sex")+
                        " 年龄："+rs.getString("age")+
                        " 班级："+rs.getString("clas")+
                        " 省份："+rs.getString("province");
            }

            textField2.setText(ans);

        } catch (SQLException ex) {
            textField2.setText("输入错误或查无此人");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            textField2.setText("输入错误或查无此人");
            ex.printStackTrace();
        }
        finally {
            //关闭连接
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException es) {
                es.printStackTrace();
            }

            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException es) {
                es.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException es) {
                es.printStackTrace();
            }
        }
    }
}

class MyActionListener1 implements ActionListener {
    private TextField textField3,textField4,textField5,textField6,textField7,textField8;

    public MyActionListener1(TextField textField3,TextField textField4
    ,TextField textField5,TextField textField6,TextField textField7,TextField textField8
    ) {
        super();
        this.textField3 = textField3;
        this.textField4 = textField4;
        this.textField5 = textField5;
        this.textField6 = textField6;
        this.textField7 = textField7;
        this.textField8 = textField8;

    }

    ////每按一次按钮，此方法都会自动调用一次
    @Override
    public void actionPerformed(ActionEvent e) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // 加载驱动类
            Class.forName("com.mysql.jdbc.Driver");
            long start = System.currentTimeMillis();
            //建立连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/unniversity", "root", "root");
            long end = System.currentTimeMillis();
            System.out.println(conn);
            // 创建Statement对象
            stmt = conn.prepareStatement("INSERT INTO student(id,name,sex,age,clas,province) VALUE(?,?,?,?,?,?)");
            int id =Integer.parseInt(textField3.getText());
            String  name=textField4.getText();
            String sex =textField5.getText();
            String  age=textField6.getText();
            String  clas=textField7.getText();
            String  province=textField8.getText();

            stmt.setInt(1,id);
            stmt.setString(2,name);
            stmt.setString(3,sex);
            stmt.setString(4,age);
            stmt.setString(5,clas);
            stmt.setString(6,province);

            //执行语句并得到结果
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "成功", "成功", JOptionPane.WARNING_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "已存在此学号", "错误", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "已存在此学号", "错误", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException es) {
                es.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException es) {
                es.printStackTrace();
            }
        }
    }
}
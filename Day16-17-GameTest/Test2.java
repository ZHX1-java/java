package GameTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Test2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        //设置界面大小
        jFrame.setSize(603, 680);

        //设置界面标题
        jFrame.setTitle("事件演示");

        //设置界面置顶
        jFrame.setAlwaysOnTop(true);

        //设置界面居中
        jFrame.setLocationRelativeTo(null);

        //设置点击右上角关闭按钮自动结束进程
        jFrame.setDefaultCloseOperation(3);

        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        jFrame.setLayout(null);

        //ImageIcon icon = new ImageIcon("E:\\IDEA\\代码\\Day16\\PuzzleGame\\image\\girl\\girl3\\all.jpg");

        //JLabel jLabel = new JLabel(icon);

        //jLabel.setBounds(0,0,350,350);

        //把管理容器添加到界面中
        //获取隐藏容器，把jLabel添加到隐藏容器当中
        //把图片添加到界面当中
        //jFrame.getContentPane().add(jLabel);

        //创建一个按钮对象
        JButton jtb = new JButton();
        //按钮的名字
        jtb.setText("点我");
        //设置位置和宽高
        jtb.setBounds(0, 0, 100, 50);
        //给按钮添加动作监听
        //jtb：组件对象，表示你要给哪个组件添加事件
        //addActionListener：表示我要给这个组件添加哪个事件监听（动作监听包含鼠标左键点击，空格）
        //阐述：表示时间被触发之后要执行的代码
        //jtb.addActionListener(new MyActionListener());
        //用匿名内部类重写接口中的方法
        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮点了一次");
            }
        });
        //把按钮添加到界面当中
        jFrame.getContentPane().add(jtb);

        //设置界面可视
        jFrame.setVisible(true);
    }
}

package GameTest;

import javax.swing.*;

public class MyJFrame1 extends JFrame {
    public MyJFrame1(){
        JFrame jFrame = new JFrame();
        //设置界面大小
        this.setSize(603,680);

        //设置界面标题
        this.setTitle("事件演示");

        //设置界面置顶
        this.setAlwaysOnTop(true);

        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置点击右上角关闭按钮自动结束进程
        this.setDefaultCloseOperation(3);

        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);

        JButton jtb1 = new JButton("点我啊");
        jtb1.setBounds(0,0,100,50);

        JButton jtb2 = new JButton("再点我");
        jtb2.setBounds(100,0,100,50);
        this.setVisible(true);
    }
}

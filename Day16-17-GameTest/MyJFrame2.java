package GameTest;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame2 extends JFrame implements KeyListener {
    public MyJFrame2(){
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

        this.addKeyListener(this);

        this.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }



    //细节1；
    //如果按下一个按键没有松开，那么会去重复调用KeyPressed的方法
    //细节2；
    //每一个按键都有一个编号与之对应
    //键盘a-z刚好与ASCII码表的A-Z的ASCII码值对应，但没多大关系
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
        char keyChar = e.getKeyChar();
        int code = e.getKeyCode();
        if (code == 65){
            System.out.println("当前按的是A");
        } else if (code == 66) {
            System.out.println("当前按的是B");
        }
    }
}

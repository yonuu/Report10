import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseColor extends JFrame {
    JPanel jp = new JPanel();
    
    public MouseColor() {
        setTitle("드래깅동안 YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(jp);
        
        jp.addMouseMotionListener(new motionListener());
        jp.setBackground(Color.green);   // 프레임 배경 설정
        setSize(400,200);
        setVisible(true);
    }
    public class motionListener extends MouseAdapter {
        public void mouseDragged(MouseEvent e) {   // 마우스가 드래그되는 동안
            jp = (JPanel)e.getSource();
            jp.setBackground(Color.yellow);
        }
        public void mouseMoved(MouseEvent e) {    // 마우스가 움직이는 동안
            jp = (JPanel)e.getSource();
            jp.setBackground(Color.GREEN);
        }      
    }
    public static void main(String[] args) {
        new MouseColor();
    }
}


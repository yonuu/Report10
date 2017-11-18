import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseColor extends JFrame {
    JPanel jp = new JPanel();
    
    public MouseColor() {
        setTitle("�巡�뵿�� YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(jp);
        
        jp.addMouseMotionListener(new motionListener());
        jp.setBackground(Color.green);   // ������ ��� ����
        setSize(400,200);
        setVisible(true);
    }
    public class motionListener extends MouseAdapter {
        public void mouseDragged(MouseEvent e) {   // ���콺�� �巡�׵Ǵ� ����
            jp = (JPanel)e.getSource();
            jp.setBackground(Color.yellow);
        }
        public void mouseMoved(MouseEvent e) {    // ���콺�� �����̴� ����
            jp = (JPanel)e.getSource();
            jp.setBackground(Color.GREEN);
        }      
    }
    public static void main(String[] args) {
        new MouseColor();
    }
}


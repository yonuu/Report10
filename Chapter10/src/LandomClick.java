import java.awt.event.*;
import javax.swing.*;

public class LandomClick extends JFrame {    
    JPanel jp = new JPanel();
    JLabel jl = new JLabel("c");
   
    public LandomClick() {
        
        this.setTitle("Ŭ�� ���� �� �������α׷�");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setContentPane(jp);
        jp.setLayout(null);
        jl.addMouseListener(new clickListener());
        jl.setLocation(100, 100);
        jl.setSize(10, 10);
        jp.add(jl);
        
        setSize(400, 400);   // ������ ũ�� ����
        setVisible(true);
        jp.requestFocus();
    }
    
    public class clickListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {   // ���콺�� ������Ʈ�� Ŭ���Ͽ��� ��
            jl.setLocation((int)(Math.random()*300), (int)(Math.random()*300));  // ������ ��ġ ����
        }
    }
    
    public static void main(String[] args) {
        new LandomClick();
    }
}


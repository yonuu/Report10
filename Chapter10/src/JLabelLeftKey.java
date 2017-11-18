import java.awt.event.*;
import javax.swing.*;

public class JLabelLeftKey extends JFrame {
    JPanel jp = new JPanel();
    JLabel jl = new JLabel("Love Java");
    
    JLabelLeftKey() {
        this.setTitle("LeftŰ�� ���ڿ� �̵�");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setContentPane(jp);
        jp.addKeyListener(new LeftListener());
        jp.add(jl);
        setSize(400, 200);
        setVisible(true);
        jp.requestFocus();
    }
 
    public class LeftListener extends KeyAdapter {
        String str = jl.getText();
        int c = 0;
        public void keyPressed(KeyEvent e) {   // Ű���� ��ư�� �������� ��
            int keyCode = e.getKeyCode();
            if(keyCode == KeyEvent.VK_LEFT)c++;   // ���� ȭ��ǥ Ű�� �ԷµǸ�
            jl.setText(str.substring(c) + str.substring(0, c));   // �������� �̵� 
            if(c == str.length()) c = 0;
        }
    }

    public static void main(String[] args) {
    	new JLabelLeftKey();
    }
}


import java.awt.event.*;
import javax.swing.*;

public class JLabelLeftKey extends JFrame {
    JPanel jp = new JPanel();
    JLabel jl = new JLabel("Love Java");
    
    JLabelLeftKey() {
        this.setTitle("Left키로 문자열 이동");
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
        public void keyPressed(KeyEvent e) {   // 키보드 버튼이 눌러졌을 때
            int keyCode = e.getKeyCode();
            if(keyCode == KeyEvent.VK_LEFT)c++;   // 왼쪽 화살표 키가 입력되면
            jl.setText(str.substring(c) + str.substring(0, c));   // 왼쪽으로 이동 
            if(c == str.length()) c = 0;
        }
    }

    public static void main(String[] args) {
    	new JLabelLeftKey();
    }
}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FontSize extends JFrame {
        JPanel jp;
        JLabel jl;
        String SB = "Love Java";

       public FontSize() {
                this.setTitle("+, -키로 폰트 크기 조절");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jp = new JPanel();
                jl = new JLabel(SB);
                jl.setFont(new Font("Arial", Font.PLAIN, 10));  // Arial 폰트로 10픽셀 크기
                Key K = new Key();
                jl.addKeyListener(K);
                jp.add(jl);
                this.add(jp);
                this.setVisible(true);
                this.setSize(400, 200);
                jl.requestFocus();
        }

        class Key extends KeyAdapter {
                public void keyPressed(KeyEvent e) {  // 키보드 버튼이 눌러졌을 때

                	if(e.getKeyChar() == '+') {
                		jl.setFont(new Font("Arial", Font.PLAIN, jl.getFont().getSize()+5));   // 5픽셀 씩 증가
                	}
                	else if(e.getKeyChar() == '-' && jl.getFont().getSize() > 5) {
                		jl.setFont(new Font("Arial", Font.PLAIN, jl.getFont().getSize()-5));   // 5픽셀 씩 감소
                	}
                }
        }
        public static void main(String[] args) {
                new FontSize();
        }
}




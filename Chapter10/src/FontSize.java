import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FontSize extends JFrame {
        JPanel jp;
        JLabel jl;
        String SB = "Love Java";

       public FontSize() {
                this.setTitle("+, -Ű�� ��Ʈ ũ�� ����");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jp = new JPanel();
                jl = new JLabel(SB);
                jl.setFont(new Font("Arial", Font.PLAIN, 10));  // Arial ��Ʈ�� 10�ȼ� ũ��
                Key K = new Key();
                jl.addKeyListener(K);
                jp.add(jl);
                this.add(jp);
                this.setVisible(true);
                this.setSize(400, 200);
                jl.requestFocus();
        }

        class Key extends KeyAdapter {
                public void keyPressed(KeyEvent e) {  // Ű���� ��ư�� �������� ��

                	if(e.getKeyChar() == '+') {
                		jl.setFont(new Font("Arial", Font.PLAIN, jl.getFont().getSize()+5));   // 5�ȼ� �� ����
                	}
                	else if(e.getKeyChar() == '-' && jl.getFont().getSize() > 5) {
                		jl.setFont(new Font("Arial", Font.PLAIN, jl.getFont().getSize()-5));   // 5�ȼ� �� ����
                	}
                }
        }
        public static void main(String[] args) {
                new FontSize();
        }
}




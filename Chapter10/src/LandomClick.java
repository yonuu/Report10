import java.awt.event.*;
import javax.swing.*;

public class LandomClick extends JFrame {    
    JPanel jp = new JPanel();
    JLabel jl = new JLabel("c");
   
    public LandomClick() {
        
        this.setTitle("클릭 연습 용 응용프로그램");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setContentPane(jp);
        jp.setLayout(null);
        jl.addMouseListener(new clickListener());
        jl.setLocation(100, 100);
        jl.setSize(10, 10);
        jp.add(jl);
        
        setSize(400, 400);   // 프레임 크기 설정
        setVisible(true);
        jp.requestFocus();
    }
    
    public class clickListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {   // 마우스로 컴포넌트를 클릭하였을 때
            jl.setLocation((int)(Math.random()*300), (int)(Math.random()*300));  // 랜덤한 위치 설정
        }
    }
    
    public static void main(String[] args) {
        new LandomClick();
    }
}


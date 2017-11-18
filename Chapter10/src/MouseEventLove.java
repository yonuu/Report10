import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventLove extends JFrame {
	public MouseEventLove() {
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("사랑해");
		label.addMouseListener(new MyMouseListener());  // Action 이벤트 리스너 달기
		c.add(label);
		
		setSize(400,200);   // 프레임 사이즈 설정
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEventLove();
	}
}
class MyMouseListener extends MouseAdapter {
	
	@Override
	public void mouseEntered(MouseEvent e) {   // 마우스가 컴포넌트 위에 올라올 때
		JLabel label = (JLabel)e.getSource();  
		label.setText("Love Java");
	}
	@Override
	public void mouseExited(MouseEvent e) {   // 컴포넌트 위에 올라온 마우스가 컴포넌트를 벗어날 때 
		JLabel label = (JLabel)e.getSource();
		label.setText("사랑해");	
	}
}





import javax.swing.*;
import java.awt.*;

public class ComponentEx extends JFrame{
	public ComponentEx() {
		super("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		for(int i=0; i<20; i++) {
			JLabel label = new JLabel();
			label.setBackground(Color.BLUE);
			label.setOpaque(true);            // 20개의 컴포넌트를 출력한다
			
			int x = (int)(Math.random() * 200) + 50;
			int y = (int)(Math.random() * 200) + 50;
			label.setLocation(x, y);
			label.setSize(10, 10);
			add(label);                                 // JLabel 컴포넌트의 위치를 랜덤하게 설정
		}
		setSize(300, 300);   // 프레임의 크기를 설정
		setVisible(true);    // 프레임을 화면에 출력
	}
	public static void main(String[] args) {
		new ComponentEx();
	}
}


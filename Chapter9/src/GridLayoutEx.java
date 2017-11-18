import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		super("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));  // 버튼의 크기는 동일하다
		
		JButton [] jb = new JButton [10];
		for(int i=0; i<jb.length; i++) {
			jb[i] = new JButton(Integer.toString(i));
			c.add(jb[i]);     // 10개의 버튼을 출력
		}
		setSize(600, 300);   // 프레임의 크기 설정
		setVisible(true);    // 프레임을 화면에 출력
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}

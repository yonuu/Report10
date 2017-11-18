import java.awt.*;
import javax.swing.*;

public class ColorButton extends JFrame {
	public ColorButton() {
		super("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));  // 버튼의 크기는 동일하다
		
		JLabel [] label = new JLabel[10];
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE,
				         Color.MAGENTA, Color.DARK_GRAY, Color.PINK, Color.LIGHT_GRAY};   // Color 배열을 만들어 색깔을 입력한다
		
		JButton [] jb = new JButton [10];
		for(int i=0; i<jb.length; i++) {
			jb[i] = new JButton(Integer.toString(i));
			c.add(jb[i]);     // 10개의 버튼을 출력
			jb[i].setBackground(color[i]);
			add(jb[i], color[i]);   // add를 이용하여 버튼에 색깔을 추가한다
		}
		setSize(600, 300);   // 프레임의 크기 설정
		setVisible(true);    // 프레임을 화면에 출력
	}
	public static void main(String[] args) {
		new ColorButton();
	}
}



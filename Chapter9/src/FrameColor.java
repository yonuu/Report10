import java.awt.*;
import javax.swing.*;

public class FrameColor extends JFrame {
	public FrameColor() {
		super("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));   // 4X4 바둑판을 구성한다
		
		JLabel [] label = new JLabel [16];
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
				Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA};    // Color 배열을 만들어 색을 입력한다

		for(int i=0; i<label.length; i++) {
			label[i] = new JLabel(Integer.toString(i));
			label[i].setOpaque(true);
			label[i].setBackground(color[i]);
			c.add(label[i]);   // add를 이용하여 색을 추가한다
		}
		setSize(600,300);   // 프레임의 크기를 설정한다
		setVisible(true);   // 프레임을 화면에 출력한다
	}
	public static void main(String[] args) {
		new FrameColor();
	}
}

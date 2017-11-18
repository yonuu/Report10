import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventLove extends JFrame {
	public MouseEventLove() {
		setTitle("���콺 �ø��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("�����");
		label.addMouseListener(new MyMouseListener());  // Action �̺�Ʈ ������ �ޱ�
		c.add(label);
		
		setSize(400,200);   // ������ ������ ����
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEventLove();
	}
}
class MyMouseListener extends MouseAdapter {
	
	@Override
	public void mouseEntered(MouseEvent e) {   // ���콺�� ������Ʈ ���� �ö�� ��
		JLabel label = (JLabel)e.getSource();  
		label.setText("Love Java");
	}
	@Override
	public void mouseExited(MouseEvent e) {   // ������Ʈ ���� �ö�� ���콺�� ������Ʈ�� ��� �� 
		JLabel label = (JLabel)e.getSource();
		label.setText("�����");	
	}
}





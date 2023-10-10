package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame{
	//model là giá trí của GUI đếm số
	private CounterModel model;
	
	//button_up là nút nhấn tăng giá trị
	private JButton button_up;
	
	//button_down là nút nhấn giảm giá trị
	private JButton button_down;
	
	private JButton button_reset;
	//icon là ảnh của GUI
	private ImageIcon icon;
	
	private JLabel label_value;
	//hàm tạo
	public CounterView() {
		// TODO Auto-generated constructor stub
		this.model = new CounterModel();
		this.icon = new ImageIcon("C:\\Users\\bluez\\OneDrive\\Pictures\\123-count-with-me-logo-75D4BC6C12-seeklogo.com.png");
		this.setIconImage(icon.getImage());
		this.init();
		this.setVisible(true);
	}
	
	//hàm in tiêu đề,kích thước
	public void init()
	{
		//Tạo xử lý sự kiện
		ActionListener al = new CounterListener(this);
		
		JPanel panel = new JPanel();
		
		this.setTitle("Count number");
		this.setSize(400,500);
		this.setLocationRelativeTo(null);
		button_up = new JButton("UP");
		button_up.addActionListener(al);
		button_down = new JButton("DOWN");
		button_down.addActionListener(al);
		button_reset = new JButton("RESET");
		button_reset.addActionListener(al);
		label_value = new JLabel(this.model.getValue()+"",JLabel.CENTER);
		
		//bỏ layout vào palnel
		panel.setLayout(new BorderLayout());
	   
		//bỏ nút up vào phía Tây
		panel.add(button_up,BorderLayout.WEST);
		//bỏ nút down vào phía Đông
		panel.add(button_down,BorderLayout.EAST);
		//bỏ giá trị vào ở Giữa
		panel.add(label_value,BorderLayout.CENTER);
		panel.add(button_reset,BorderLayout.SOUTH);
		this.setLayout(new BorderLayout());
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void increase()
	{
		this.model.increase_value();
		this.label_value.setText(this.model.getValue()+"");
	}
	public void decrease()
	{
		this.model.decrese_value();
		this.label_value.setText(this.model.getValue()+"");
	}
	public void reset()
	{
		this.model.reset_value();
		this.label_value.setText(this.model.getValue()+"");
	}
}

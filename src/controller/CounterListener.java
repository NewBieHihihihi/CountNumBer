package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

public class CounterListener implements ActionListener{
    private CounterView view;
    public CounterListener(CounterView view) {
    	this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		System.out.println("Bạn đã nhấn nút!" + src);
		if(src.equals("UP"))
		{
			view.increase();
		}else if(src.equals("DOWN"))
		{
			view.decrease();
		}
		else if(src.equals("RESET"))
		{
			view.reset();
			System.out.println("Bạn đã nhấn reset giá trị trở lại ban đầu!");
		}
	}

}

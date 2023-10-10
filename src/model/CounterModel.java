package model;

public class CounterModel {
	private int value;
	//hàm tạo
	public CounterModel() {
		this.value = 0;
	}
	//trả về giá trị
	public int getValue() {
		return value;
	}
	//set giá trị mới
	public void setValue(int value) {
		this.value = value;
	}
	//tăng giá trị lên 1
	public void increase_value()
	{
		this.value++;
	}
	//giảm giá trị lên 1
	public void decrese_value()
	{
		this.value--;
	}
	//trả lại giá trí ban đầu
	public void reset_value()
	{
		this.value = 0;
	}

}

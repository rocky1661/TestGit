
public class MyInteger {

	private int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public MyInteger() {
		this.value = 1082;
	}
	
	public MyInteger(int value) {
		setValue(value);
	}
	
	@Override
	public String toString() {
		return "MyInteger [value=" + value + ", getValue()=" + getValue() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public boolean isEven() {
		if(value % 2 == 0)
			return true;
		else return false;
	}
	
	public boolean isOdd() {
		if(value % 2 != 0)
			return true;
		else return false;
	}
	
	public int add(int value) {
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger test1 = new MyInteger(5);
		
		System.out.println(test1);	
		
		System.out.println(test1.isEven());	
		
		System.out.println(test1.isOdd());
		
		System.out.println(test1.add(2));
		
		

	}
}

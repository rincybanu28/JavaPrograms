package junit;

public class Apple {
	String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean checkColor(){
		if(color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green"))
			return true;
		else
			return false;
	}
	

}

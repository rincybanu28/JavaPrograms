package designpatterns;

interface Shape {
	void draw();
}

class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Drawing circle");

	}
}

class Rectangle implements Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");

	}
}

class Square implements Shape{
	@Override
	public void draw() {
		System.out.println("Drawing Square");

	}
}

class ShapeFactory{
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shapeType.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if(shapeType.equalsIgnoreCase("Square"))
			return new Square();
		else
			return null;
	}
}

//Created by Rincy banu
public class FactoryPatternEx {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape;
		
		shape = shapeFactory.getShape("Circle");
		shape.draw();
		
		shape = shapeFactory.getShape("Rectangle");
		shape.draw();
		
		shape = shapeFactory.getShape("Square");
		shape.draw();
		

	}

}

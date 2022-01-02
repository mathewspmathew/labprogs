
public class Abstract1 {

	public static void main(String[] args) {
		 Shape sh;
		 
         sh = new Rectangle();
         sh.numberofsides();
         
         sh = new Triangle();
         sh.numberofsides();
         
         sh=new Hexagon();
         sh.numberofsides();
	}
}

abstract class Shape{
	
    abstract void numberofsides();
}

class Rectangle extends Shape{

	@Override
	void numberofsides() {
		System.out.println("Number of sides of Rectangle is : 4");
	}	
}

class Triangle extends Shape{

	@Override
	void numberofsides() {
		System.out.println("Number of sides of Triangle is : 3");
	}	
}

class Hexagon extends Shape{

	@Override
	void numberofsides() {
		System.out.println("Number of sides of Hexagon is : 6");
	}	
}

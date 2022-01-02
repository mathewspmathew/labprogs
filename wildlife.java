
public class Wildlife {

	public static void main(String[] args) {
		Cat c = new Cat("Fluffy");
		Pet p = new Cat();
		
		Fish d = new Fish();
		Animal a = new Fish();
		//Pet f = new Fish();
		Animal e = new Spider();
		
		d.setName("Nemo");
		d.eat();
		System.out.println("Name : "+ d.getName());
		d.eat();
		d.walk();
		
		System.out.println();
		c.setName("Browny");
		c.eat();
		System.out.println("Name : "+ d.getName());
		c.eat();
		c.walk();
		
		System.out.println();
		e.eat();
		System.out.println("Name : "+ d.getName());
		e.eat();
		e.walk();
	}
}

abstract class Animal {
	
	protected int legs;
	private String name;
	
	Animal(int legs, String name){
		this.legs = legs;
		this.name = name;
	}
    abstract void eat();
    
    public void walk() {
    	System.out.println(name + " have " + legs + " legs");
	}
}

class Spider extends Animal {

	Spider() {
		super(8, "Spider");
	}

	@Override
	void eat() {
		System.out.println("Spider eat bugs");
	}
}

interface Pet {
	public String getName();
	public void setName(String name);
}

class Cat extends Animal implements Pet {
	private String catName;
	
	Cat() {
		this("");
	}
	
	Cat(String name) {
		super(4, "Cat");
		catName = name;
	}
	
	@Override
	public void eat() {
		System.out.println("Cat eat fishes");
	}

	@Override
	public String getName() {
		return catName;
	}

	@Override
	public void setName(String name) {
		catName = name;	
	}
}

class Fish extends Animal implements Pet {
	public Fish() {
		super(0, "");
	}
	private String fishName;
	
	@Override
	public void eat() {
		System.out.println("Fish eat seafood");
	}
	public String getName() {
		return fishName;
	}
	public void setName(String name) {
		fishName = name;
	}
	public void play() {
		System.out.println("Swiming race!");
	}
	
	//@Override
	public void walk()
	{
		System.out.println("Fish Swims!");
	}
}

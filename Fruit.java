
public class Fruit {
	private String name;
	public Fruit(String name) {
		this.name = name;
		System.out.println("Fruit constructor is invoked");
	  }
	public String getName() {
		return this.name;
	}
}

class Apple extends Fruit{
	String colour;
	public Apple(String name, String colour) {
		super (name);
		this.colour = colour;
	    System.out.println("Apple constructor is invoked");
	  }
}

class RedApple extends Apple{
	String taste;
	double price;
	public RedApple(String name, String colour, String taste, double price) {
		super (name, colour);
		this.taste = taste;
		this.price = price;
	}
}

class GreenApple extends Apple{
	String taste;
	double price;
	public GreenApple(String name, String colour, String taste, double price) {
		super (name, colour);
		this.taste = taste;
		this.price = price;
	}
}

class Mangosteen extends Fruit{
	String colour, shape, taste;
	double price;
	public Mangosteen(String name, String colour, String shape, String taste, double price) {
		super (name);
		this.colour = colour;
		this.shape = shape;
		this.taste = taste;
		this.price = price;
	    System.out.println("Mangosteen constructor is invoked");
	  }
}

class Watermelon extends Fruit{
	String colour, shape, taste;
	double price;
	public Watermelon(String name, String colour, String shape, String taste, double price) {
		super (name);
		this.colour = colour;
		this.shape = shape;
		this.taste = taste;
		this.price = price;
		System.out.println("Watermelon constructor is invoked");
	}
}

class Main {
	public static void main(String[] args) {
		
		Apple c = new Apple("Apple", "Red");
		System.out.println("\nName: \t\t" + c.getName());
	    System.out.println("Colour: \t" + c.colour);
	    System.out.println();
	    System.out.println("---------------------------------");
	    System.out.println();
	    
		RedApple d = new RedApple("Red Apple", "Red", "Sweet", 2.00);
		
		System.out.println("\nName: \t\t" + d.getName());
	    System.out.println("Colour: \t" + d.colour);
	    System.out.println("Taste: \t\t" + d.taste);
	    System.out.printf("Price: \t\tRM %.2f%n\n", d.price);
	    System.out.println("---------------------------------");
	    System.out.println();
	    
		GreenApple e = new GreenApple("Green Apple", "Green", "Sour", 1.80);
		
		System.out.println("\nName: \t\t" + e.getName());
	    System.out.println("Colour: \t" + e.colour);
	    System.out.println("Taste: \t\t" + e.taste);
	    System.out.printf("Price: \t\tRM %.2f%n\n", e.price);
	    System.out.println("---------------------------------");
	    System.out.println();
	    
	    Mangosteen f = new Mangosteen("Mangosteen","Purple", "Round", "Sweet", 8.00);
	    
	    System.out.println("\nName: \t\t" + f.getName());
	    System.out.println("Colour: \t" + f.colour);
	    System.out.println("Shape: \t" + f.shape);
	    System.out.println("Taste: \t\t" + f.taste);
	    System.out.printf("Price: \t\tRM %.2f%n\n", f.price);
	    System.out.println("---------------------------------");
	    System.out.println();
	    
	    Watermelon g = new Watermelon("Watermelon", "Green", "Oval", "Sweet", 18.00);
	    
	    System.out.println("\nName: \t\t" + g.getName());
	    System.out.println("Colour: \t" + g.colour);
	    System.out.println("Shape: \t" + g.shape);
	    System.out.println("Taste: \t\t" + g.taste);
	    System.out.printf("Price: \t\tRM %.2f%n\n", g.price);
	    System.out.println("---------------------------------");
	    System.out.println();
	}
}
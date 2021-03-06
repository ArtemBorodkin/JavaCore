package less19;

import java.util.Iterator;

import less03.Circle;
import less03.Figure;
import less03.Rectangle;

public class Main {

	public static void main(String[] args) {
		
		Container<String> container = new Container<>("Hello");
		System.out.println(container.getElement().charAt(0));
		Rectangle rectangle = new Rectangle(4,5);
		Container<Figure>container2 = new Container<>(rectangle);
		print(rectangle);
		print(container2);
		changeFigure(container2, new Circle(5));
		changeFigure(new Container<Object>(rectangle), new Circle(10));
		print(container2);
	}
	
	static void changeFigure(Container<? super Figure> container, Figure figure){
		container.setElement(figure);
	}
	
	static void print(Container<? extends Figure> container){
		container.getElement().print();
	}
	
	static void print(Figure figure){
		figure.print();
	}
	
	static void print(Iterable<?>iterable){
		for (Object object : iterable) {
			System.out.println(object);
		}
	}

}


public class App {

	public static void main(String[] args) {

		Expression left = new Subtraction(new Sum(new Number(5), new Number(7)), new Number(5));
		Expression right = new Sum(new Number(2), new Number(10));
		Expression sum = new Sum(left, right);
		
		System.out.println(sum.evaluate());
		
		Printer printer = new Printer();
		sum.accept(printer);
	}

}


public class Printer {

	public void acceptSum(Sum sum) {
		System.out.print("(");
		sum.getLeft().accept(this);
		System.out.print(" + ");
		sum.getRight().accept(this);
		System.out.print(")");
	}

	public void acceptSubtraction(Subtraction subtraction) {
		System.out.print("(");
		subtraction.getLeft().accept(this);
		System.out.print(" + ");
		subtraction.getRight().accept(this);
		System.out.print(")");
	}

	public void acceptNumber(Number number) {
		System.out.print(number.getNumber());
	}

}

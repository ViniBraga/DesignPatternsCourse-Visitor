
public class Subtraction implements Expression {

	private Expression right;
	private Expression left;
	
	public Subtraction(Expression right, Expression left) {
		this.right = right;
		this.left = left;
	}
	
	public Expression getRight() {
		return right;
	}
	
	public Expression getLeft() {
		return left;
	}

	public int evaluate() {
		return right.evaluate() - left.evaluate();
	}

	public void accept(Printer printer) {
		printer.acceptSubtraction(this);
		
	}

}

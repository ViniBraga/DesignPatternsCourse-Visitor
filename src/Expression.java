
public interface Expression {

	int evaluate();
	void accept(Printer printer);
}

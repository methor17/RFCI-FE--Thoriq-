public class Reverse implements Modification {

	@Override
	public String modify(String input) {
		return new StringBuilder(input).reverse().toString();
	}
	
	@Override
	public String toString() {
		return Reverse.class.getSimpleName();
	}
}
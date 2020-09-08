public class ToUpperCase implements Modification {

	@Override
	public String modify(String input) {
		return input.toUpperCase();
	}
	
	@Override
	public String toString() {
		return ToUpperCase.class.getSimpleName();
	}
}
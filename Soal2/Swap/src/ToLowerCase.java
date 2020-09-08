public class ToLowerCase implements Modification {

	@Override
	public String modify(String input) {
		return input.toLowerCase();
	}

	@Override
	public String toString() {
		return ToLowerCase.class.getSimpleName();
	}
}
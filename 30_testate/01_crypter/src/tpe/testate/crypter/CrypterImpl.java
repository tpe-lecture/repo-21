package tpe.testate.crypter;

public class CrypterImpl implements Crypter {

	@Override
	public String encrypt(String input) {
		String smallInput = input.toLowerCase();
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			char aktualChar = smallInput.charAt(i);
			if (!(aktualChar >= 'a' && aktualChar <= 'z' || aktualChar >= '0' && aktualChar <= '9'
					|| aktualChar == ' ')) {
				throw new IllegalArgumentException();
			} else if (aktualChar == ' ') {
				result += ' ';
			} else if (aktualChar == 'e') {
				result += '3';
			} else if (aktualChar == '3') {
				result += 'e';
			} else if (aktualChar == 'l') {
				result += '1';
			} else if (aktualChar == '1') {
				result += 'l';
			} else if (aktualChar == 'o') {
				result += '0';
			} else if (aktualChar == '0') {
				result += 'o';
			} else if (aktualChar == 'a') {
				result += '4';
			} else if (aktualChar == '4') {
				result += 'a';
			} else if (aktualChar == 't') {
				result += '7';
			} else if (aktualChar == '7') {
				result += 't';
			} else {
				result += aktualChar;
			}

		}
		return result;

	}

	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		if (input.equals(input.toLowerCase())) {
			return encrypt(input);
		} else {
			throw new IllegalArgumentException();
		}
	}

}

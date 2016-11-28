package tpe.testate.crypter;

public class CrypterImpl implements Crypter {

	@Override
	public String encrypt(String input) {
		String smallInput = input.toLowerCase();
		String result = "";
		/**
		 * Schleife die durch den zu verschlüsselnden String läuft, wenn Char
		 * übersetzbar wird er übersetzt, wenn nicht wird er übersprungen.
		 */
		for (int i = 0; i < input.length(); i++) {
			char aktuellChar = smallInput.charAt(i);
			/**
			 * Überprüft ob der aktuelle Charakter nicht innerhalb des
			 * vorgegebenene Bereichs ist, wenn ja wird er übersprungen.
			 */
			if (!(aktuellChar >= 'a' && aktuellChar <= 'z' || aktuellChar >= '0' && aktuellChar <= '9'
					|| aktuellChar == ' ')) {

			} else if (aktuellChar == ' ') {
				result += ' ';
			} else if (aktuellChar == 'e') {
				result += '3';
			} else if (aktuellChar == '3') {
				result += 'e';
			} else if (aktuellChar == 'l') {
				result += '1';
			} else if (aktuellChar == '1') {
				result += 'l';
			} else if (aktuellChar == 'o') {
				result += '0';
			} else if (aktuellChar == '0') {
				result += 'o';
			} else if (aktuellChar == 'a') {
				result += '4';
			} else if (aktuellChar == '4') {
				result += 'a';
			} else if (aktuellChar == 't') {
				result += '7';
			} else if (aktuellChar == '7') {
				result += 't';
			} else {
				result += aktuellChar;
			}

		}
		return result;

	}

	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		/**
		 * Überprüft jeden Char ob er zugelassen ist, falls dies nicht der Fall
		 * ist wird eine Exception geworfen.
		 */
		for (int i = 0; i < input.length(); i++) {
			char aktuellChar = input.charAt(i);
			if ((aktuellChar >= 'a' && aktuellChar <= 'z' || aktuellChar >= '0' && aktuellChar <= '9'
					|| aktuellChar == ' ')) {

			} else {
				throw new IllegalArgumentException();
			}
		}
		return encrypt(input);
	}

}

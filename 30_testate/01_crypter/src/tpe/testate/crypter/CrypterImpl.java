package tpe.testate.crypter;

/**
 * Diese Klasse dient dazu, Texte mit der speziellen TPE-Verschlüsselung zu
 * verschlüsseln. Die Verschlüsselung funktioniert so, dass bestimmte Zeichen
 * durch andere ersetzt werden.
 *
 * @author Luca
 *
 *         Bei der Verschlüsselung sind nur die Zeichen a-z, die Zahlen 0-9 und
 *         das Leerzeichen erlaubt.
 */
public class CrypterImpl implements Crypter {

	/**
	 * Verschlüsselt den gegebenen Text. Enthält die Eingabe Großbuchstaben, so
	 * werden diese in Kleinbuchstaben umgewandelt. Ungültige Zeichen werden
	 * ignoriert und nicht in den verschlüsselten Text übernommen.
	 *
	 * @param input
	 *            Text, der verschlüsselt werden soll.
	 * @return Verschlüsselter Text.
	 */
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
			if ((aktuellChar >= 'a' && aktuellChar <= 'z' || aktuellChar >= '0' && aktuellChar <= '9'
					|| aktuellChar == ' ')) {

				if (aktuellChar == ' ') {
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
		}
		return result;

	}

	/**
	 * Entschlüsselt den gegebenen Text. Enthält die Eingabe Großbuchstaben,
	 * oder andere ungültige Zeichen, so wirft die Methode eine Ausnahme.
	 *
	 * @param input
	 *            Text, der entschlüsselt werden soll.
	 * @return Entschlüsselter Text.
	 * @throws IllegalArgumentException
	 *             Wird geworfen, wenn die Eingabe ungültige Zeichen
	 *             (Großbuchstaben) enthält.
	 */
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

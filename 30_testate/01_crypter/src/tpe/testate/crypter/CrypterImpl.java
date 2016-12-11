package tpe.testate.crypter;

/**
 * Diese Klasse dient dazu, Texte mit der speziellen TPE-Verschl�sselung zu
 * verschl�sseln. Die Verschl�sselung funktioniert so, dass bestimmte Zeichen
 * durch andere ersetzt werden.
 *
 * @author Luca
 *
 *         Bei der Verschl�sselung sind nur die Zeichen a-z, die Zahlen 0-9 und
 *         das Leerzeichen erlaubt.
 */
public class CrypterImpl implements Crypter {

	/**
	 * Verschl�sselt den gegebenen Text. Enth�lt die Eingabe Gro�buchstaben, so
	 * werden diese in Kleinbuchstaben umgewandelt. Ung�ltige Zeichen werden
	 * ignoriert und nicht in den verschl�sselten Text �bernommen.
	 *
	 * @param input
	 *            Text, der verschl�sselt werden soll.
	 * @return Verschl�sselter Text.
	 */
	public String encrypt(String input) {
		String smallInput = input.toLowerCase();
		String result = "";
		/**
		 * Schleife die durch den zu verschl�sselnden String l�uft, wenn Char
		 * �bersetzbar wird er �bersetzt, wenn nicht wird er �bersprungen.
		 */
		for (int i = 0; i < input.length(); i++) {
			char aktuellChar = smallInput.charAt(i);
			/**
			 * �berpr�ft ob der aktuelle Charakter nicht innerhalb des
			 * vorgegebenene Bereichs ist, wenn ja wird er �bersprungen.
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
	 * Entschl�sselt den gegebenen Text. Enth�lt die Eingabe Gro�buchstaben,
	 * oder andere ung�ltige Zeichen, so wirft die Methode eine Ausnahme.
	 *
	 * @param input
	 *            Text, der entschl�sselt werden soll.
	 * @return Entschl�sselter Text.
	 * @throws IllegalArgumentException
	 *             Wird geworfen, wenn die Eingabe ung�ltige Zeichen
	 *             (Gro�buchstaben) enth�lt.
	 */
	public String decrypt(String input) throws IllegalArgumentException {
		/**
		 * �berpr�ft jeden Char ob er zugelassen ist, falls dies nicht der Fall
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

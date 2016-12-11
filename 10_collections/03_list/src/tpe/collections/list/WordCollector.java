package tpe.collections.list;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Klassen, um die in einem Text vorkommenen Wörter zu sammeln.
 */
public class WordCollector {
    /**
     * Statische Liste für die Statische Methode readFileAndSplitIntoWords.
     */
    private static List<String> wordsList;

    /**
     * Listet alle Worte in der Datei alphabetisch auf. Duplikate werden
     * entfernt. Die Wörter werden in Kleinbuchstaben umgewandelt.
     *
     * @param filename Dateiname
     * @return die Liste der vorhandenen Wort
     * @throws IOException Fehler beim Dateizugriff.
     */
    public static List<String> listWords(String filename) throws IOException {
        // String[] allWords = readFileAndSplitIntoWords(filename);
        // String[] result = removeDuplicates(allWords);
        List<String> allWordsList = readFileAndSplitIntoWords(filename);
        List<String> resultList = removeDuplicates(allWordsList);

        return resultList;
    }

    /**
     * Listet alle Worte in der Datei auf.
     *
     * @param filename Dateiname
     * @return die Liste der vorhandenen Wort
     * @throws IOException Fehler beim Dateizugriff.
     */
    private static List<String> readFileAndSplitIntoWords(String filename)
            throws IOException {

        // Datei zum Lesen öffnen
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line; // aktuelle Zeile
        // Über die Zeilen der Datei iterieren
        while ((line = reader.readLine()) != null) {
            // Sonderzeichen entfernen und die Zeilen in Worte splitten
            line = line.toLowerCase();
            line = line.replaceAll("[\",.:'\\-\\!?]", "");
            String[] words = line.toLowerCase().split("[,. ]");
            for (int i = 0; i < words.length; i++) {
                wordsList.add(words[i]);
            }

        }

        reader.close();
        return wordsList;
    }

    /**
     * Sortiert das übergebene Array alphabetisch und entfernt Duplikate.
     *
     * @param input Eingabe Array
     * @return sortiertes und bereinigtes Array
     */
    private static List<String> removeDuplicates(List<String> input) {

        // Eingabe Array clonen, da es verändert wird (Seiteneffekt)
        // Array sortieren
        // Über die Einträge laufen
        for (int i = 0; i < input.size(); i++) {
            String word = input.get(i);
            // Über die Einträge laufen
            for (int k = i + 1; k < input.size(); k++) {
                String otherWord = input.get(k);
                if (otherWord.compareTo(word) > 0) {
                    // Sind schon hinter der möglichen Position
                    break;
                }
                else if (otherWord.equals(word)) {
                    // Duplikat, ausnullen
                    input.remove(k);
                }
            }
        }
        return input;
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {

        try {
            List<String> wordsList2 = listWords("assets/kafka.txt");
            System.out.println(wordsList2);
        } catch (IOException e) {
            System.err.println("Probleme beim Dateizugriff: " + e);
        }
    }
}

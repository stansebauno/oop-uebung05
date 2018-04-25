package ueb05;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class CorpusAnalyzer {
	private List<String> theses;

	CorpusAnalyzer(Iterator<String> thesesIterator) {
		// TODO Alle Titel in die this.theses Liste übernehmen
	}

	/**
	 * Gibt die Anzahl der angefertigten Theses zurück
	 */
	int countTheses() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Gibt die durchschnittliche Länge von Titeln in Worten zurück
	 */
	int averageThesisTitleLength() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Gibt eine alphabetisch absteigend sortierte und duplikatfreie
	 * Liste der ersten Wörter der Titel zurück.
	 */
	List<String> uniqueFirstWords() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Gibt einen Iterator auf Titel zurück; dabei werden alle Woerter, welche
	 * in `blackList` vorkommen durch Sternchen ersetzt (so viele * wie Buchstaben).
	 */
	Iterator<String> censoredIterator(Set<String> blackList) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Gibt eine Liste von allen Titeln zurueck, wobei Woerter so ersetzt werden,
	 * wie sie in der Map abgebildet werden, und die Liste nach Stringlaenge absteigend sortiert ist.
	 */
	List<String> normalizedTheses(Map<String, String> replace) {
		throw new UnsupportedOperationException();
	}
}

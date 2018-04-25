package ueb05;

import java.util.*;

class CorpusAnalyzer {
	private List<String> theses = new LinkedList<>();

	CorpusAnalyzer(Iterator<String> thesesIterator) {
		while (thesesIterator.hasNext())
			theses.add(thesesIterator.next());
	}

	/**
	 * Gibt die Anzahl der angefertigten Theses zurück
	 */
	int countTheses() {
		return theses.size();
	}

	/**
	 * Gibt die durchschnittliche Länge von Titeln in Worten zurück
	 */
	int averageThesisTitleLength() {
		int n = 0;
		for (String s : theses) {
			n += s.split(" ").length;
		}

		return n / theses.size();
	}

	/**
	 * Gibt eine alphabetisch absteigend sortierte und duplikatfreie
	 * Liste der ersten Wörter der Titel zurück.
	 */
	List<String> uniqueFirstWords() {
		Set<String> uniq = new HashSet<>();
		for (String s : theses) {
			uniq.add(s.split(" ")[0]);
		}

		List<String> list = new LinkedList<>();
		list.addAll(uniq);
		list.sort(Collections.reverseOrder());

		return list;
	}

	/**
	 * Gibt einen Iterator auf Titel zurück; dabei werden alle Woerter, welche
	 * in `blackList` vorkommen durch Sternchen ersetzt (so viele * wie Buchstaben).
	 */
	Iterator<String> censoredIterator(Set<String> blackList) {
		return new Iterator<String>() {
			Iterator<String> it = theses.iterator();

			@Override
			public boolean hasNext() {
				return it.hasNext();
			}

			@Override
			public String next() {
				String s = it.next();
				for (String c : blackList)
					s = s.replaceAll(c, repeat("*", c.length()));
				return s;
			}
		};
	}

	// Hilfsfunktion
	private static String repeat(String s, int n) {
		StringBuilder sb = new StringBuilder();
		while (n-- > 0)
			sb.append(s);
		return sb.toString();
	}

	/**
	 * Gibt eine Liste von allen Titeln zurueck, wobei Woerter so ersetzt werden,
	 * wie sie in der Map abgebildet werden, und die Liste nach Stringlaenge absteigend sortiert ist.
	 */
	List<String> normalizedTheses(Map<String, String> replace) {
		List<String> normalized = new LinkedList<>();
		for (String t : theses) {
			for (Map.Entry<String, String> e : replace.entrySet())
				t = t.replaceAll(e.getKey(), e.getValue());
			normalized.add(t);
		}

		normalized.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o2.length(), o1.length());
			}
		});

		return normalized;
	}
}

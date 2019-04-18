_Übungsaufgabe zur Veranstaltung [objektrorientiertes Programmieren](https://hsro-wif-oop.github.io) im [Bachelorstudiengang Wirtschaftsinformatik](https://www.th-rosenheim.de/technik/informatik-mathematik/wirtschaftsinformatik-bachelor/) an der [Hochschule Rosenheim](http://www.th-rosenheim.de)._


# Datenstrukturen

In dieser Übung verwenden wir die von der Java API bereit gestellten Datenstrukturen `List`, `Set` und `Map`.

Weiterhin ist die Klasse `ueb05.CorpusReader` bereits implementiert, welche eine statische Methode `thesisTitleIterator` bereit stellt.
Der dort zurückgegebene Iterator liefert ca. 380 alphabetisch sortierte Titel von Abschlussarbeiten in der Fakultät für Informatik (über ca. 10 Jahre).

Im Verlauf der Übung werden wir nun viele Statistiken über diese Titel berechnen.
Essenziell ist dabei das Zerlegen eines Strings in die einzelnen Wörter, verwenden Sie dazu die Methode `split`:

```java
String title = "Konzeption und Design einer Anwendung";

// nach Leerzeichen splitten, und darüber iterieren
for (String w : title.split(" "))
	System.out.println(w);
```

Wie Sie aus der Vorlesung wissen, sind `List` und `Set` `Collection`s, und `Map` kann über `entrySet`, `keySet` und `values` ebenso `Collections` liefern.
Solche kann man mit `Collections.sort` sowie einem `Comparator` sortieren.


## Aufgabe

- Vervollständigen Sie die Implementierung der Klasse `CorpusAnalyzer` gemäß den vorgegebenen JavaDoc Kommentaren.
- Verifizieren Sie Ihre Implementierung anhand der gelieferten Testcases.

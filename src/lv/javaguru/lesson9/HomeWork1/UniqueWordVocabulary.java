package lv.javaguru.lesson9.HomeWork1;

public class UniqueWordVocabulary {
    public static void main(String[] args) {
        UniqueWordCollection first = new UniqueWordCollection();

        first.addWord();
        first.printToConsole();
        first.getUniqueWords();

    }

}



/* Uzdevums:

Nepieciešas izveidot klasi UniqueWordVocabulary

Kā kolekciju izmantojiet Set.

Šajā klasē jāizpilda šādi uzdevumi:

1. Pievienojiet kolekcijai jebkuru teksta rindu (addWord).
Piezīme: nevajadzētu būt tukšām teksta rindām kolekcijā.

2. Saņemt (atgriezt) unikālo vārdu skaitu (getUniqueWords)

3. Izvadīt konsolē kolekcijas saturu (printToConsole)

Pārbaudiet katras metodes darbu klasē UniqueWordVocabulary. (Nepārbaudiet konsoles izvadi) */

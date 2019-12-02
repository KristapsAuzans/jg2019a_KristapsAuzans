package lv.javaguru.lesson9.HomeWork2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//šeit uzdevuma prasība nav izpildīta - nestrādā
public class UniqueWordCounter {
    Map<Integer, String> fruits = new HashMap<Integer, String>();


    //šai metodei ir jābūt parametram String
    //citādi man nav iespējas salikt tur citādāku sarakstu,
    // piemēram, "gurķis", bumbieris" utt.
    public void addLine() {
        fruits.put(1, "Apple");
        fruits.put(2, "Mango");
        fruits.put(3, "Apple");
        fruits.put(4, "Apple");
        fruits.put(5, "Orange");
        fruits.put(6, "Mango");
    }

    //metodei ir jāatgriež aprēķinatā vērtība
    //tātad jābūt atgriežamajam tipam "String" nevis "void"
    /*public void returnMostCommon() {
        int i; //šim ir jābūt iekš "for" tur kur to parasti definē
        for (Map.Entry<Integer, String> mostCommon : fruits.entrySet()) {
            for (i = 0; i <= fruits.size(); i++){
                if (fruits.containsValue(mostCommon.getValue())) {
                    i++;
                    System.out.println(i);
                }
            }

            System.out.println("Value: " + mostCommon.getValue() + i);
        }
    }*/

    //viens variants ir šādi, izmantojot paņēmienus kurus esam nodarbībās izmantojuši
    //ja kas nodarbībā paskaidrošu, tik atgādini lūdzu
    public String returnMostCommon() {
        Map<String, Integer> mostCommonFruits = new HashMap<>();
        for(String fruit : fruits.values()) {
            Integer commonFruitCount = mostCommonFruits.get(fruit);
            mostCommonFruits.put(fruit, commonFruitCount == null ? 0 : ++commonFruitCount);
        }

        Map.Entry<String, Integer> mostCommonEntry = mostCommonFruits.entrySet().iterator().next();
        for (Map.Entry<String, Integer> entry : mostCommonFruits.entrySet()) {
            if (entry.getValue() > mostCommonEntry.getValue()) {
                mostCommonEntry = entry;
            }
        }
        return mostCommonEntry.getKey();
    }
}
//mostCommon.getValue())
/*
Uzdevums:

Nepieciešams izveidot klasi UniqueWordCounter.
Kā kolekciju izmantojiet Map.
Šaj klasei jāizpilda šādi uzdevumi:
1. Pievienot kolekcijai jebkuru teksta rindu (izņemot tukšu). Piezīme: dublikātu gadījumā palielināt skaitītāju (noteiktai tekstrindai)

2. Atgrieziet visbiežāk tiekamo tekstrindu
3. Izvadīt konsolē kolekcijas saturu
Iespējamais testa scenārijs:
1. Pievienot tekstrindu "apple" divas reizes
2. Pievienot tekstrindu “mango” vienu reizi
3. Izsaukt metodi, lai iegūtu bieži sastopamo vērtību.
Gaidāmais rezultāts: "apple"
Pārbaudīt katras metodes darbu, klase UniqueWordCounter. (Nepārbaudiet konsoles izvadi)
 */
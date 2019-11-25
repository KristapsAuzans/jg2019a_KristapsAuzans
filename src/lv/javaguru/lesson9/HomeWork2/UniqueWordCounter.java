package lv.javaguru.lesson9.HomeWork2;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    Map<Integer, String> fruits = new HashMap<Integer, String>();


    public void addLine() {
        fruits.put(1, "Apple");
        fruits.put(2, "Mango");
        fruits.put(3, "Apple");
        fruits.put(4, "Apple");
        fruits.put(5, "Orange");
        fruits.put(6, "Mango");
    }

    public void returnMostCommon() {
        int i;
        for (Map.Entry<Integer, String> mostCommon : fruits.entrySet()) {
            for (i = 0; i <= fruits.size(); i++){
                if (fruits.containsValue(mostCommon.getValue())) {
                    i++;
                    System.out.println(i);
                }
            }

            System.out.println("Value: " + mostCommon.getValue() + i);
        }
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
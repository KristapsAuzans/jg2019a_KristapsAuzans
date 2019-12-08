package lv.javaguru.lesson10.HomeWork1;

public class UserValidationService {
    public static void main(String[] args) {

        createUser();
    }

    public static void createUser() throws StringIndexOutOfBoundsException {
        System.out.println("Creating a User");
        User first = new User("K", "Auzans", -29);
        boolean result = true;
        try {
            if (first.name.length() <= 3 || first.name.length() >= 15)
                throw new Exception("String Length out of order");
        } catch (Exception name) {
            System.out.println("Length of the name is out out boundaries 3-15");
            result = false;
        }

        try {
            if (first.lastName.length() <= 3 || first.lastName.length() >= 15)
                throw new Exception("String Length out of order");
        } catch (Exception lastName) {
            System.out.println("Length of the Last Name is out out boundaries 3-15");
            result = false;
        }

        try {
            if (first.age <= 0 || first.age >= 120)
                throw new Exception("Int length out of order");
        } catch (Exception e) {
            System.out.println("Age is out of accepted boarders - 0-120 years");
            result = false;
        }

        System.out.println(result ? "User creation SUCCESSFUL" : "User creation FAILED");


    }




    /*
    Lietotāja datu pārbaudes serviss reģistrācijas laikā.

Prasības:

Nepieciešams izveidot lietotāja validācijas servisu (UserValidationService).

Lietotājs User. Nepieciešamie parametri:
vārds (name) - datu tips String
uzvārds (lastName) - datu tips String
vecums (age) - datu tips Integer
Validācijas noteikumi:

1. Minimālais garums lietotāja vārdam un uzvārdam ir 3 simboli.

2. Maksimālais lietotāja vārda un uzvārda garums ir 15 simboli.

3. Vecums nedrīkst būt mazāks par 0

4. Vecums nedrīkst būt lielāks par 120 gadiem

Ja dati nepanāk pārbaudi (nevienu no pārbaudēm), tad ir jāparāda ValidationException ar kļūdas ziņojumu.

* Piezīme: ValidationException ir jāizveido pašam. ValidationException ir jāpārmanto no unchecked izņēmumiem.

ValidationException nevar parādīt bez ziņojuma (obligāti pārrakstīt konstruktoru).
     */
}

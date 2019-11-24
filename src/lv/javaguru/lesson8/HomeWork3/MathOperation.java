package lv.javaguru.lesson8.HomeWork3;

public interface MathOperation {

    double execute(double firstNumber, double secondNumber);
}

/*
Matemātiskās operācijas

Jums jāizveido interfeiss MathOperation, ar metodi execute.

Metodei execute ir jāatgriež daļskaitlis (double) un jāpieņiem divi skaitļi kā argumentus ar datu tipu double.

Katrai matemātiskai darbībai ir jāizveido viena klase, kura implementē interfeisu MathOperation.

Atkarībā no klases, metode execute ir jāveic konkrēta matemātiska darbība. Piemēram, klasē AdditionOperation metodei executejāatgriež divu ciparu summa.

Pēc tam izveidojiet MathOperations klasi ar executeAll metodi, kurai argumentos jāpieņem operāciju sarakstu un 2 daļskaitļus.

Metodē executeAll katrā darbībā ir jāizpilda execute metode, kurai jāpadot argumentos 2 daļskaitļus. Katras operācijas rezultāts ir jāizdved konsolē.

Notestēt funkcionalitāti.

 */

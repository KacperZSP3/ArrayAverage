class ArrayAverage {
    public static void main(String[] args) {
        // Tworzymy tablicę liczb
        int[] numbers = {10, 20, 30, 40, 50};

        // Wyświetlenie elementów tablicy
        System.out.println("Elementy tablicy:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + ": " + numbers[i]);
        }

        // Obliczanie sumy elementów tablicy
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Obliczanie średniej
        double average = (double) sum / numbers.length;

        // Wyświetlenie wartości średniej
        System.out.println("\nŚrednia wartość: " + average);
    }
}

//	1.	Tablica numbers:
//      •	Zawiera liczby całkowite, które są używane do obliczeń.
//     	•	W przykładzie są to: 10, 20, 30, 40, 50.
//  2.	Wyświetlanie elementów tablicy:
//      •	Pętla for iteruje po każdym elemencie tablicy i wypisuje go w konsoli.
//  3.	Obliczanie sumy:
//      •	Zmienna sum jest inicjalizowana jako 0 i w każdym obiegu pętli dodawany jest do niej kolejny element tablicy.
//  4.	Obliczanie średniej:
//      •	Całkowitą sumę dzielimy przez liczbę elementów w tablicy (numbers.length).
//      •	Wynik jest rzutowany na typ double, aby zapewnić dokładność obliczeń (np. 25.5 zamiast 25).
//  5.	Wyświetlenie średniej:
//      •	Średnia wartość elementów tablicy jest wyświetlana w konsoli.
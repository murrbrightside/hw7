public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        System.out.println("Задача 21");
        int amount = 0;
        int count = 0;
        while (amount <= 245900){
            amount = amount + 15000;
            count +=1;
        }
        System.out.println("Нужно месяцев " + count);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int count = 1;
        while(count <= 10){
            System.out.print(count);
            System.out.print(' ');
            count++;

        }
        System.out.println();
        for (int i = 10; i > 0; i--){
            System.out.print(i);
            System.out.print(" ");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int deathNumber = 0;
        int childBirth = 0;
        for (int i = 1; i <11; i++){
            deathNumber = (population / 1000) * 8;
            childBirth = (population / 1000) * 17;
            population = population - deathNumber + childBirth;
            System.out.println("Год " + i + " население " + population);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int amount = 15_000;
        int count = 0;
        while (amount <= 12_000_000){
            amount = amount + 7*amount/100;
            count++;
            System.out.println("Текущиц месяц " + count + " сумма накоплений " + amount);
        }

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int amount = 15_000;
        int count = 0;
        while (amount <= 12_000_000){
            amount = amount + 7*amount/100;
            count++;
            if(count%6 == 0){
            System.out.println("Текущиц месяц " + count + " сумма накоплений " + amount);
        }}

    }
    public static void task6 () {
        System.out.println("Задача 6");
        int amount = 15_000;
        int count = 0;
        while (count < 12*9 + 1){
            amount = amount + 7*amount/100;
            count++;
            if(count %6 == 0){
            System.out.println("Текущиц месяц " + count + " сумма накоплений " + amount);}
        }

    }
    public static void task7 () {
        System.out.println("Задача 7");
        int friday = 6;
        while (friday <= 31){
            System.out.println("Сегодня пятница " + friday + " число, нужно написать отчет");
            friday +=7;
        }

    }
    public static void task8 () {
        System.out.println("Задача 8");
        int year = 0;
        do{year+=79;
        } while (year < 1822);
        while (year <= 2122){
            System.out.println("Год появления кометы " + year);
            year += 79;
        }
    }

        }


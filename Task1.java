package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;
import ru.avalon.java.j20.labs.models.Numbers;

/**
 * Задание №1.
 *
 * <p>Тема: "Создание обобщённых методов".
 *
 * <p>В рамках задания требуется описать и выполнить
 * несколько методов, обобщённых с указанной точностью.
 */
public class Task1 implements Task {

    /**
     * Фабрика, создающая массивы случайных чисел.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        Integer [] array = arrayFactory.getInstance(20);
        //Numbers.max(100, null);
        
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        
        int min = Numbers.min(array);
        int max = Numbers.max(array);
        double avg = Numbers.avg(array);
        
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее значение: " + avg);
        System.out.println();
        
        Double [] doubleArray = {1.1, 2.5, 3.92, 4.5, 2.56};
        System.out.println("Массив double: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        double maxd = Numbers.max(doubleArray);
        System.out.println("Максимальное число: " + maxd);
        System.out.println();
        
        /*
         * TODO(Студент): Выполните задание №1
         *
         * 1. Обобщить метод поиск среднего арифметического
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск среднего арифметического
         *    в массивах любых чисел: целых и вещественных.
         *
         *    Возвращать необходимо значение типа double.
         *
         * 2. Обобщить метод поиск максимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск максимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 3. Обобщить метод поиск минимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск минимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}

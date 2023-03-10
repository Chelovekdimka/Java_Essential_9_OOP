//Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyClass, що містить статичний фабричний метод - T factoryMethod(),
//        який породжуватиме екземпляри типу, зазначеного як параметр типу (покажчика місця заповнення типом – Т).

package Ex_5;

import java.util.Scanner;

public class MyClass<T> {
    public static <T> T factoryMethod(Class<T> type) throws IllegalAccessException, InstantiationException {
        return type.newInstance();
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        MyClass<String> myString = new MyClass<>();
        String str = myString.factoryMethod(String.class);

        MyClass<Integer> myInteger = new MyClass<>();
        Integer i = myInteger.factoryMethod(Integer.class);

        MyClass<Scanner> myScanner = new MyClass<>();
        Scanner scanner = myScanner.factoryMethod(Scanner.class);
    }
}

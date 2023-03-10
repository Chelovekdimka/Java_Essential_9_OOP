//Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyDictionary. Реалізуйте у найпростішому наближенні
//        можливість використання його екземпляра. Мінімально необхідний інтерфейс взаємодії з екземпляром повинен
//        включати метод додавання пар елементів,
//        індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання для отримання
//        загальної кількості пар

package Ex_3;

public class MyDictionary {
    private String[] keys;
    private Object[] values;
    private int count;
    public MyDictionary(int capacity) {
        keys = new String[capacity];
        values = new Object[capacity];
        count = 0;
    }
    public void add(String key, Object value) {
        keys[count] = key;
        values[count] = value;
        count++;
    }
    public Object get(String key) {
        for (int i = 0; i < count; i++) {
            if (keys[i].equals(key)) {
                return values[i];
            }
        }
        return null;
    }
    public int getCount() {
        return count;
    }
}

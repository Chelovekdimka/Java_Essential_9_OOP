//Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyList. Реалізуйте у найпростішому наближенні
//        можливість використання його екземпляра аналогічно екземпляру класу List. Мінімально необхідний
//        інтерфейс взаємодії з екземпляром повинен включати метод додавання елемента,
//        індексатор для отримання значення елемента за вказаним індексом і властивість тільки для читання
//        для отримання загальної кількості елементів.

package Ex_2;
public class MyList<T> {
    private Object[] elements;
    private int size;

    public MyList() {
        this.elements = new Object[10];
        this.size = 0;
    }
    public void add(T element) {
        if (size >= elements.length) {
            resize();
        }
        elements[size++] = element;
    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }
    public int getSize() {
        return size;
    }
    private void resize() {
        Object[] newElements = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }
}

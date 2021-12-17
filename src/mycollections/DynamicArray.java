package mycollections;

import java.util.Arrays;

public class DynamicArray<E> implements MyList<E> {

    static final int DEFAULT_SIZE = 10;
    private E[] array;
    private int arraySize;

    public DynamicArray(int size) {
        if (size > 0) {
            array = (E[]) new Object[size];
        } else {
            array = (E[]) new Object[DEFAULT_SIZE];
        }

    }

    public DynamicArray() {
        array = (E[]) new Object[DEFAULT_SIZE];
    }


    @Override
    public int size() {
//Возвращает количество элементов в этом списке
        return arraySize;
    }

    @Override
    public boolean isEmpty() {
//Возвращает true , если этот список не содержит элементов
        return arraySize == 0;
    }

    @Override
    public boolean contains(E element) {
//Возвращает <tt> true </tt>, если этот список содержит указанный элемент.
//
//     * Более формально, возвращает <true> тогда и только тогда, когда этот список содержит
//     * хотя бы один элемент <tt> e </tt> такой, что
//     * o == null? get (i) == null: o.equals (get (i)).
        return indexOf(element)>=0;
    }

    @Override
    public int indexOf(E element) {
//Возвращает индекс первого вхождения указанного элемента.
//     * в этом списке или -1, если этот список не содержит элемент.

//     * Более формально, возвращает самый низкий индекс <tt> i </tt>, такой что
//     * o == null? get (i) == null: o.equals (get (i))
//     * или -1, если такого индекса нет.
        if (element != null) {
            for (int i = 0; i < arraySize; i++) {
                if (element.equals(array[i])) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < arraySize; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E element) {
//Возвращает индекс последнего вхождения указанного элемента.
//     * в этом списке или -1, если этот список не содержит элемент.
//     * Более формально, возвращает наивысший индекс <tt> i </tt>, такой что
//     * o == null? get (i) == null: o.equals (get (i))
//     * или -1, если такого индекса нет.
        if (element != null) {
            for (int i = arraySize - 1; i >= 0; i--) {
                if (element.equals(array[i])) {
                    return i;
                }
            }
        } else {
            for (int i = arraySize - 1; i >= 0; i--) {
                if (array[i] == null) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public E get(int index) {
////Операции позиционного доступа
//
////возвращает элемент в указанной позиции в этом списке
//
        checkIndex(index);

        return array[index];
    }


    @Override
    public E set(int index, E element) {
//Заменяет элемент в указанной позиции в этом списке на
//     * указанный элемент.
        checkIndex(index);
        E oldElement = array[index];
        array[index] = element;

        return oldElement;
    }

    @Override
    public boolean add(E e) {
//Добавляет указанный элемент в конец этого списка
        if (arraySize == array.length) {
            array = ensureCapacity();
        }
        array[arraySize] = e;
        arraySize++;
        return true;
    }


    @Override
    public void add(int index, E element) {
//вставляет указанный элемент в указанную позицию в этом
//     * список. Сдвигает элемент, находящийся в данный момент в этой позиции (если есть) и
//     * любые последующие элементы справа (добавляет единицу к их индексам)
// throws arrayIndexOfBound...
        checkIndex(index);
        if (arraySize == array.length) {
            array = ensureCapacity();
        }
        System.arraycopy(array, index, array, index + 1,
                arraySize - index);
        array[index] = element;
        arraySize++;


    }

    @Override
    public E remove(int index) {
//Удаляет элемент в указанной позиции в этом списке.
//     * Сдвигает любые последующие элементы влево (вычитает один из их
//     * индексы).
        checkIndex(index);
        E oldElement = array[index];
        int newSize = arraySize - 1;
        if (newSize > index) {
            System.arraycopy(array, index + 1, array, index, newSize - index);
            arraySize = newSize;
        }
        return oldElement;
    }

    @Override
    public boolean remove(E element) {
//Удаляет первое вхождение указанного элемента из этого списка,
//     * если есть. Если список не содержит элемента, он
//     * без изменений. Более формально удаляет элемент с наименьшим индексом
//     * <tt> i </tt> такое, что
//     * <tt> (o == null? get (i) == null: o.equals (get (i))) </tt>
//     * (если такой элемент существует). Возвращает <tt> true </tt>, если этот список
//     * содержал указанный элемент (или эквивалентно, если этот список
//     * изменено в результате звонка)
        if (element != null) {

            for (int i = 0; i < arraySize; i++) {
                if (element.equals(array[i])) {
                    remove(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < arraySize; i++) {
                if (array[i] == null) {
                    remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    // internal helper and necessary methods
    private void checkIndex(int index) {
        if (index >= arraySize || index < 0) {
            throw new ArrayIndexOutOfBoundsException("The specified index is invalid");
        }
    }

    private E[] ensureCapacity() {
        E[] arrayTemp = (E[]) new Object[array.length + DEFAULT_SIZE];
        System.arraycopy(array, 0, arrayTemp, 0, array.length);
        array = arrayTemp;
        return array;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + Arrays.toString(array) +
                ", arraySize=" + arraySize +
                '}';
    }
}

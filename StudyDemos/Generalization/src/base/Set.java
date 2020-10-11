package base;

import java.util.Arrays;

public class Set<T> {

    T[] myArray = (T []) new Object[10]; // T[] arr = (T []) new Object[10]

    public int getSize() {
        size = 0;
        for(int i = 0; i < this.getLength(); i++) {
            if(this.get(i) != null){
                size++;
            }
        }
        return size;

    }
    public int getLength() {
        return myArray.length;
    }
    int size = 0;

    public void add(T value)
    {
        if(!this.contains(value))
        {
            if(this.getSize()==0 || this.get(0).getClass().getName() == value.getClass().getName())
            {   if(value != null) {
                size++;
                myArray[size - 1] = value;
            }
            }
        }
    }

    public void add(int index, T value) {
        if(!this.contains(value)) {
            if(value!= null) {
                size++;
                myArray[index] = value;
            }
        }
    }

    public T[] removeByIndex(T[] arr, int index) // по индексу
    {

        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        T[] anotherArray = (T []) new Object[arr.length];

        for (int i = 0, k = 0; i < arr.length; i++) {

            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    public T[] remove(T[] arr, T value) // по элементу
    {

        if (arr == null || arr.length == 0) {
            return arr;
        }
        T[] anotherArray = (T []) new Object[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                anotherArray = removeByIndex(arr, i);
            }
        }
        return anotherArray;
    }

    public void remove(T value){
        if(value != null){myArray = remove(myArray, value);}
    }

    public T get() {
        return this.myArray[0];
    }

    public T get(int index) {
        return this.myArray[index];
    }

    public void clear(){
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] == null){break;}
            remove(myArray[i]);
        }
    }

    public void removeAll(Set someSet){
        for(int i = 0; i < someSet.getSize(); i++){
            if(someSet.get(i) == null){
                break;
            }
            for (int k = 0; k < this.getLength(); k++) {
                if(this.get(k) == someSet.get(i)) {
                    myArray = remove(myArray, (T) someSet.get(i));
                }
            }
        }
    }

    public boolean contains(T value){
        for(int i = 0; i < this.getSize(); i++){
            if(myArray[i] == value){
                return true;
            }
        }
        return false;
    }

    public void clone(Set someSet) {
        this.clear();
        for(int i = 0; i < someSet.getSize(); i++) {
            this.add((T) someSet.get(i));
        }
    }

    public void concat(Set someSet) {
        for(int i = 0; i < someSet.getSize(); i++) {
            this.add(this.getSize(),(T) someSet.get(i));
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }

}

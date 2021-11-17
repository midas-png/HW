package src;

import java.util.Arrays;
import java.util.Comparator;

class HubList<E> implements HubListImpl<E> {
    private E[] arr;

    public HubList(E[] arr){
        this.arr = arr;
    }

    public void add(E element) {
        E[] newArr = (E[])new Object[this.arr.length + 1];

        for(int i=0; i<this.arr.length; i++)
            newArr[i] = this.arr[i];
        newArr[newArr.length - 1] = element;

        this.arr = newArr;

        System.out.println(Arrays.toString(this.arr));
    }

    @Override
    public void removeAt(int index) {
        E[] newArr = (E[])new Object[this.arr.length - 1];

        if(index >= this.arr.length)
            System.out.println("Wrong index");

        else {
            for(int i=0, k=0;i<arr.length;i++){
                if(i!=index){
                    newArr[k]=arr[i];
                    k++;
                }
            }
            this.arr = newArr;
        }
        System.out.println(Arrays.toString(this.arr));
    }

    @Override
    public void sort() {
        Arrays.sort(this.arr);
        System.out.println(Arrays.toString(this.arr));
    }

    @Override
    public int find(E element) {
        for(int i=0; i<this.arr.length-1; i++){
            if(this.arr[i] == element)
                return i;
        }
        return -1;
    }
}

interface HubListImpl<E> {
    void add(E element);
    void removeAt(int index);
    void sort();
    int find(E element);
}
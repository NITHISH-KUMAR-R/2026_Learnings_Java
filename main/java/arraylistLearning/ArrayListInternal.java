package arraylistLearning;

public class ArrayListInternal {

    public static void main(String[] args) {

        int[] arr = new int[0]; // initial capacity = 0

        int size = 0;

        for (int i = 0; i < 50; i++) {
            // Resize condition
            if (size == arr.length) {
                int newCapacity;
                if (arr.length == 0) {
                    newCapacity = 10; // first resize
                } else {
                    newCapacity = arr.length + (arr.length >> 1); // 1.5x growth
                }
                int[] newArr = new int[newCapacity];
                // copy elements
                for (int j = 0; j < size; j++) {
                    newArr[j] = arr[j];
                }
                arr = newArr;
            }
            // add element
            arr[size] = i;
            size++;
        }

        System.out.println("Final Size: " + size);
        System.out.println("Array Capacity: " + arr.length);

        for(int i =0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
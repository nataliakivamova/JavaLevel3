import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"blue", "green", "black", "white", "grey"};
        swapElements(arr, 1, 4);
        System.out.println(Arrays.toString(arr));
        convertToArrayList(arr);

//        Task3
        Box<Apple> appleBox = new Box<>();
        Apple ap1 = new Apple();
        Apple ap2 = new Apple();
        Apple ap3 = new Apple();
        Apple ap4 = new Apple();

        appleBox.add(ap1);
        appleBox.add(ap2);
        appleBox.add(ap3);
        appleBox.add(ap4);

        Box<Orange> orangeBox = new Box<>();
        Orange or1 = new Orange();
        Orange or2 = new Orange();
        Orange or3 = new Orange();
        Orange or4 = new Orange();

        orangeBox.add(or1);
        orangeBox.add(or2);
        orangeBox.add(or3);
        orangeBox.add(or4);

        System.out.println("Вес коробки с яблоками: " + appleBox.getTotalWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getTotalWeight());

        System.out.println("Сравнение веса коробки с яблоками и с апельсинами: " + appleBox.compare(orangeBox));

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox.removeFruit(orangeBox2);
        Orange or5 = new Orange();
        orangeBox2.add(or5);

        System.out.println("Вес коробки №2 с апельсинами: " + orangeBox2.getTotalWeight());
        System.out.println("Сравнение веса двух коробок с апельсинами: " + orangeBox.compare(orangeBox2));
        System.out.println("Сравнение веса коробки с яблоками и коробки№2 с апельсинами: " + appleBox.compare(orangeBox2));
    }

    //    Task 1
    private static <T> void swapElements(T[] array, int index1, int index2) {
        T arr1 = array[index1];
        array[index1] = array[index2];
        array[index2] = arr1;
    }

    //    Task 2
    private static <T> void convertToArrayList(T[] array){
        List<T> list;
        list = Arrays.asList(array);
        for (T elem : list)
            System.out.println(" " + elem);
    }
}

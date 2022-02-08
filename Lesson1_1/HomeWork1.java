package Lesson1.Lesson1_1;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork1 {
   public static String [] arr = {"Apple", "Orange", "Pineapple", "Coconut", "Watermelon"};
    public static Scanner leha = new Scanner(System.in);
    public static void main(String[] args) {
        //Задание 1
        change();
        //Задание 2
        create(arr);
        //Задание 3

        Box<Orange> orange = new Box<>();
        Box<Orange> orange1 = new Box<>();
        Box<Apple> apple = new Box<>();
        Box<Apple> apple1 = new Box<>();


        orange.addFruit(new Orange(), 3);
        orange1.addFruit(new Orange(), 2);
        apple.addFruit(new Apple(), 2);
        apple1.addFruit(new Apple(), 3);


        System.out.println("Box 1: " + orange.getWeight());
        System.out.println("Box 2: " + orange1.getWeight());
        System.out.println("Box 3: " + apple.getWeight());
        System.out.println("Box 4: " + apple1.getWeight());



        System.out.println("Коробка 1 равняется коробке 3?: " + orange.compare(apple));
        System.out.println("Коробка 2 равняется коробке 4?: " + orange1.compare(apple1));


        System.out.println("Добавим фрукты");


        apple.addFruit(new Apple(),2);
        apple1.addFruit(new Apple(),1);
        orange.addFruit(new Orange(),8);
        orange1.addFruit(new Orange(),4);


        System.out.println("Box 1: " + orange.getWeight());
        System.out.println("Box 2: " + orange1.getWeight());
        System.out.println("Box 3: " + apple.getWeight());
        System.out.println("Box 4: " + apple1.getWeight());


    }



//Задание 1
    public static void change() {
        System.out.println("Введите номер первого фрукта");
        int a = leha.nextInt()-1;
        System.out.println("Введите номер второго фрукта");
        int b = leha.nextInt()-1;
        String c;
        c=arr[a];
        arr[a]=arr[b];
        arr[b]=c;

        for (String s : arr) {
            System.out.println(s);

        }

    }

    //Задание 2
    public static ArrayList<String> create(String[] arr) {
        ArrayList<String> arr1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr1.add(i,arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println((String)arr1.get(i));
        }
        return arr1;
    }

        }

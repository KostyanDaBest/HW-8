package Zadanie2;

public class Run2 {
    public static void main(String[] args) {
    Apple apple = new Apple("Зеленый");

        System.out.println("Цвет яблока: " + apple.getColor());
try{
    java.lang.reflect.Field field = Apple.class.getDeclaredField("color");
    field.setAccessible(true);
    field.set(apple,"Фиолетовый");
    System.out.println("Новый цвет яблока: " + apple.getColor());
} catch (Exception e) {
    e.printStackTrace();
}
}




    }
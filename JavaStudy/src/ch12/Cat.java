package ch12;

public class Cat extends Animal {
    @Override
//    상속 받았으면 너만의 기능을 구현해!
    public void sound() {
        System.out.println("야옹");
    }

    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void sound() {
                System.out.println("null");
            }
        };
    }
}

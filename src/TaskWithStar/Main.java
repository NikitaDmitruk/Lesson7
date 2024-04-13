package TaskWithStar;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple();
        apple.info();
        Field field = apple.getClass().getDeclaredField("color");
        field.setAccessible(true);
        field.set(apple, "black");
        apple.info();
    }
}

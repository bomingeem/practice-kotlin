package lec03.inheritanceKt;

public interface JavaFlyable {

    default void act() {
        System.out.println("파닥 파닥");
    }

}

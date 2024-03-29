package lec03.classKt;

public class JavaPerson {

    private final String name;
    private int age;

    public JavaPerson(String name, int age) {
        if (this.age <= 0) {
            throw new IllegalArgumentException(String.format("나이(%s)는 1이상이어야 합니다", age));
        }
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return this.age >= 20;

    }

    public JavaPerson(String name) {
        this(name, 1);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

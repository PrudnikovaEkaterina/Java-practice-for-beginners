package stream;

public class Animal {
    private String name;
    private int age;
    private KindOfAnimal kindOfAnimal;

    public Animal(String name, int age, KindOfAnimal kindOfAnimal) {
        this.name = name;
        this.age = age;
        this.kindOfAnimal = kindOfAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public KindOfAnimal getKindOfAnimal() {
        return kindOfAnimal;
    }

    public void setKindOfAnimal(KindOfAnimal kindOfAnimal) {
        this.kindOfAnimal = kindOfAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kindOfAnimal=" + kindOfAnimal +
                '}';
    }
}

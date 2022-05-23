/*Создать класс Cat.

У кота должны быть такие свойства как имя, возраст, вес, порода.

Создать конструктор по умолчанию, конструктор с 4 параметрами, конструктор с 2 параметрами(имя и возраст)

Переопределить метод toString

Реализовать для класса Cat свою версию метода equals, который будет сравнивать котов только по весу и возрасту.



Создать 2 кота и вывести на экран результат их сравнения*/

public class Cats {

    private String name;
    private int age;
    private int weight;
    private String breed;

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public Cats(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        System.out.println(name + " is born! He is " + age + " years old. His weight is " + weight + " kg. His breed is " + breed +".");

    }

    public Cats(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + " is born! He is " + age + " years old.");
    }

    public Cats(){
        System.out.println("The cat is born!");
    }

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}';
    }

    public static boolean equals(Cats firstCat, Cats secondCat){
        return firstCat.getAge() == secondCat.getAge() && firstCat.getWeight() == secondCat.getWeight();
    }
}

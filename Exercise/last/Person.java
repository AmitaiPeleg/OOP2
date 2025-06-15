package Exercise.last;

public class Person {
    String name;
    char sex;
    int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String toString() {
        return "name: " + name + " sex: " + sex + " age: " + age;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Person)) {
            return false;
        }
        Person p = (Person) o;
        return name == p.name && age == p.age;
    }

    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}

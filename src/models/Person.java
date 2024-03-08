package models;

import java.util.Random;

public class Person {

    private String name;
    private int age;
    private float weight;

    private float height;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    private Gender gender;
//    public Person() {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//        this.height = height;
//    }



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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", gender=" + gender +
                '}';
    }

    public static String fake() {
        Random random = new Random();
        String[] fakeNames = {"Baraa", "khaled", "Mohamed"};
        String fakeName = fakeNames[(Math.abs(random.nextInt()) % fakeNames.length)];
        int fakeAge = Math.abs(random.nextInt()) % 80;
        int fakeWeight = 40 + Math.abs(random.nextInt()) % 100;
        int fakeHeight = 100 + Math.abs(random.nextInt()) % 100;
        Gender fakeGender =  Math.abs(random.nextInt()) % 2 == 0? Gender.Male: Gender.Female;

        Person person = new Person();
        person.setName(fakeName);
        person.setAge(fakeAge);
        person.setWeight(fakeWeight);
        person.setHeight(fakeHeight);
        person.setGender(fakeGender);

        return person.toString();
    }
}
enum Gender {
    Male, Female;
}
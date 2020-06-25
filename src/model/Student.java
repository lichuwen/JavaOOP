package model;

public class Student {
    public String name;
    public int age;
    public String gender;
    public int id;
    // constructor method
    public Student(String name, int age, String gender, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    // member method
    public String getName() {
        return name;
    }
    public void setAge(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                '}';
    }
}

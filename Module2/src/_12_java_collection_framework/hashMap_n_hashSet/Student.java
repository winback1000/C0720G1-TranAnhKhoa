package _12_java_collection_framework.hashMap_n_hashSet;

public class Student implements Comparable<Student>{
    String name;
    Integer age;
    String address;
    Integer id;

    public Student() {
    }

    public Student(Integer id, String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{Student name=" + name + ",age=" + age + ",address=" + address +",id = " + id +"} \n";
    }


    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}

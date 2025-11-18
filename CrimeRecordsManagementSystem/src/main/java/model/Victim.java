package model;

import javax.persistence.*;

@Entity
@Table(name = "victims")
public class Victim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int victimId;

    @Column(nullable = false)
    private String name;

    private int age;
    private String gender;
    private String address;

    public Victim() {}

    public Victim(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public int getVictimId() {
        return victimId;
    }

    public void setVictimId(int victimId) {
        this.victimId = victimId;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Victim [victimId=" + victimId + ", name=" + name + "]";
    }
}

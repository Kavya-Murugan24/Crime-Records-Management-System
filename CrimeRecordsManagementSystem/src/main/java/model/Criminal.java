package model;

import javax.persistence.*;

@Entity
@Table(name = "criminals")
public class Criminal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "criminal_id")
    private int criminalId;


    @Column(name = "name", length = 20, nullable = false)
    private String name;
    
    @Column(name = "age", nullable = false)
    private int age;
    
    @Column(name = "gender", length = 10, nullable = false)
    private String gender;
    

    @Column(name = "address", length = 50, nullable = true)
    private String address;

    @Column(length = 100)
    private String crimeHistory;

    public Criminal() {}

    public Criminal(String name, int age, String gender, String address, String crimeHistory) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.crimeHistory = crimeHistory;
    }

    public int getCriminalId() {
        return criminalId;
    }

    public void setCriminalId(int criminalId) {
        this.criminalId = criminalId;
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

    public String getCrimeHistory() {
        return crimeHistory;
    }

    public void setCrimeHistory(String crimeHistory) {
        this.crimeHistory = crimeHistory;
    }

    @Override
    public String toString() {
        return "Criminal [criminalId=" + criminalId + ", name=" + name + "]";
    }
}

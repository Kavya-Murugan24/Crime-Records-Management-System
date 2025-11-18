package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "crimes")
public class Crime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "crime_id")
    private int crimeId;


    @Column(name = "crime_type", length = 50, nullable = false)
    private String crimeType;


    @Column(name = "description", length = 100, nullable = true)
    private String description;

    @Temporal(TemporalType.DATE)
    private Date dateOfCrime;
    @Column(name = "location", length = 100, nullable = false)
    private String location;

    public Crime() {}

    public Crime(String crimeType, String description, Date dateOfCrime, String location) {
        this.crimeType = crimeType;
        this.description = description;
        this.dateOfCrime = dateOfCrime;
        this.location = location;
    }

    public int getCrimeId() {
        return crimeId;
    }

    public void setCrimeId(int crimeId) {
        this.crimeId = crimeId;
    }

    public String getCrimeType() {
        return crimeType;
    }

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateOfCrime() {
        return dateOfCrime;
    }

    public void setDateOfCrime(Date dateOfCrime) {
        this.dateOfCrime = dateOfCrime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Crime [crimeId=" + crimeId + ", crimeType=" + crimeType + ", location=" + location + "]";
    }
}

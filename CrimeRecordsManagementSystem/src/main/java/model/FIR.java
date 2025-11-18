package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "firs")
public class FIR {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int firId;

    @Temporal(TemporalType.DATE)
    private Date filedDate;

    @Column(nullable = false)
    private String details;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "crime_id")
    private Crime crime;

    @ManyToOne
    @JoinColumn(name = "victim_id")
    private Victim victim;

    @ManyToOne
    @JoinColumn(name = "criminal_id")
    private Criminal criminal;

    public FIR() {}

    public FIR(Date filedDate, String details, Crime crime, Victim victim, Criminal criminal) {
        this.filedDate = filedDate;
        this.details = details;
        this.crime = crime;
        this.victim = victim;
        this.criminal = criminal;
    }

    public int getFirId() {
        return firId;
    }

    public void setFirId(int firId) {
        this.firId = firId;
    }

    public Date getFiledDate() {
        return filedDate;
    }

    public void setFiledDate(Date filedDate) {
        this.filedDate = filedDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Crime getCrime() {
        return crime;
    }

    public void setCrime(Crime crime) {
        this.crime = crime;
    }

    public Victim getVictim() {
        return victim;
    }

    public void setVictim(Victim victim) {
        this.victim = victim;
    }

    public Criminal getCriminal() {
        return criminal;
    }

    public void setCriminal(Criminal criminal) {
        this.criminal = criminal;
    }

    @Override
    public String toString() {
        return "FIR [firId=" + firId + ", details=" + details + "]";
    }
}

package service;

import dao.CrimeDAO;
import model.Crime;
import java.util.Date;
import java.util.List;

public class CrimeService {

    private CrimeDAO crimeDAO = new CrimeDAO();

    public void addCrime(String crimeType, String description, Date date, String location) {
        Crime crime = new Crime(crimeType, description, date, location);
        crimeDAO.save(crime);
        System.out.println(" Crime record added successfully.");
    }

    public List<Crime> getAllCrimes() {
        return crimeDAO.findAll();
    }

    public Crime getCrimeById(int id) {
        return crimeDAO.findById(id);
    }

    public void updateCrime(Crime crime) {
        crimeDAO.update(crime);
        System.out.println(" Crime record updated successfully.");
    }

    public void deleteCrime(Crime crime) {
        crimeDAO.delete(crime);
        System.out.println(" Crime record deleted successfully.");
    }
}

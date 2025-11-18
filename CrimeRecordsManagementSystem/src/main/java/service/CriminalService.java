package service;

import dao.CriminalDAO;
import model.Criminal;
import java.util.List;

public class CriminalService {

    private CriminalDAO criminalDAO = new CriminalDAO();

    public void addCriminal(String name, int age, String gender, String address, String history) {
        Criminal c = new Criminal(name, age, gender, address, history);
        criminalDAO.save(c);
        System.out.println(" Criminal added successfully.");
    }

    public List<Criminal> getAllCriminals() {
        return criminalDAO.findAll();
    }

    public Criminal getCriminalById(int id) {
        return criminalDAO.findById(id);
    }

    public void updateCriminal(Criminal criminal) {
        criminalDAO.update(criminal);
        System.out.println(" Criminal record updated successfully.");
    }

    public void deleteCriminal(Criminal criminal) {
        criminalDAO.delete(criminal);
        System.out.println(" Criminal record deleted successfully.");
    }
}

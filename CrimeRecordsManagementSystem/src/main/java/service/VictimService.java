package service;

import dao.VictimDAO;
import model.Victim;
import java.util.List;

public class VictimService {

    private VictimDAO victimDAO = new VictimDAO();

    public void addVictim(String name, int age, String gender, String address) {
        Victim v = new Victim(name, age, gender, address);
        victimDAO.save(v);
        System.out.println(" Victim added successfully.");
    }

    public List<Victim> getAllVictims() {
        return victimDAO.findAll();
    }

    public Victim getVictimById(int id) {
        return victimDAO.findById(id);
    }

    public void updateVictim(Victim victim) {
        victimDAO.update(victim);
        System.out.println(" Victim record updated successfully.");
    }

    public void deleteVictim(Victim victim) {
        victimDAO.delete(victim);
        System.out.println(" Victim record deleted successfully.");
    }
}

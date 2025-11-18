package service;

import dao.FIRDAO;
import model.FIR;
import model.Crime;
import model.Criminal;
import model.Victim;
import java.util.Date;
import java.util.List;

public class FIRService {

    private FIRDAO firDAO = new FIRDAO();

    public void fileFIR(Date date, String details, Crime crime, Victim victim, Criminal criminal) {
        FIR fir = new FIR(date, details, crime, victim, criminal);
        firDAO.save(fir);
        System.out.println(" FIR filed successfully.");
    }

    public List<FIR> getAllFIRs() {
        return firDAO.findAll();
    }

    public FIR getFIRById(int id) {
        return firDAO.findById(id);
    }

    public void updateFIR(FIR fir) {
        firDAO.update(fir);
        System.out.println(" FIR updated successfully.");
    }

    public void deleteFIR(FIR fir) {
        firDAO.delete(fir);
        System.out.println(" FIR deleted successfully.");
    }
}

package dao;

import model.Crime;

public class CrimeDAO extends GenericDAO<Crime> {
    public CrimeDAO() {
        super(Crime.class);
    }
}

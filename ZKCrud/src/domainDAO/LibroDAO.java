package domainDAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Query;
import org.zkoss.zul.Messagebox;

import HibernateUtilities.HibernateUtil;
import mydomain.Libro;

public class LibroDAO {

    @SuppressWarnings("unchecked")
    public List<Libro> getAllPersons() {
        List<Libro> allrecords = null;
        try {
            Session session = HibernateUtil.beginTransaction();
            Query q1 = session.createQuery("from Person");
            allrecords = q1.list();
            HibernateUtil.CommitTransaction();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return allrecords;
    }

    public void saveOrUpdate(Libro l1) {

        try {
            Session session = HibernateUtil.beginTransaction();
            session.saveOrUpdate(l1);
            HibernateUtil.CommitTransaction();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
}

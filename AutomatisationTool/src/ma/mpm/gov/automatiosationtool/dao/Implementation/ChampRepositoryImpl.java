package ma.mpm.gov.automatiosationtool.dao.Implementation;

import java.util.List;

import ma.mpm.gov.automatiosationtool.dao.Interface.ChampRepository;
import ma.mpm.gov.automatiosationtool.model.Champ;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository("champRepository")
@Transactional
public class ChampRepositoryImpl implements ChampRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Champ> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Champ u ").list();
		
	}

}

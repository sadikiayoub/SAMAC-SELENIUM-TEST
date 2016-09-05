package ma.mpm.gov.automatiosationtool.dao.Interface;

import java.util.List;

import ma.mpm.gov.automatiosationtool.model.Champ;



public interface ChampRepository {


	public List<Champ> findAll();
}

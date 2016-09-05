package ma.mpm.gov.automatiosationtool.service.Implementation;

import java.util.List;

import ma.mpm.gov.automatiosationtool.dao.Interface.ChampRepository;
import ma.mpm.gov.automatiosationtool.model.Champ;
import ma.mpm.gov.automatiosationtool.service.Interface.ChampService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("authentificationService")
public class ChampServiceImpl implements ChampService {

	@Autowired
	ChampRepository champRepository;
	
	

	public List<Champ> listerChamp() {
		return champRepository.findAll();
	}
	
}

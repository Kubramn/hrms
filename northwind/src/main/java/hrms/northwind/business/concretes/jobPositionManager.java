package hrms.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.northwind.business.abstracts.jobPositionService;
import hrms.northwind.dataAccess.abstracts.jobPositionDao;
import hrms.northwind.entities.concretes.jobPosition;
@Service
public class jobPositionManager implements jobPositionService {

	private jobPositionDao job_positionDao;
	@Autowired
	public jobPositionManager(jobPositionDao job_positionDao) {
		super();
		this.job_positionDao = job_positionDao;
	}
	
	@Override
	public List<jobPosition> getAll() {
		// TODO Auto-generated method stub
		return this.job_positionDao.findAll();
	}

}

package hrms.northwind.business.abstracts;

import java.util.List;

import hrms.northwind.entities.concretes.jobPosition;

public interface jobPositionService {

	List<jobPosition>getAll();
}

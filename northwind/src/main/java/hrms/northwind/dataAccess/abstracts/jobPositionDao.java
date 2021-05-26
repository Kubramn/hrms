package hrms.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.northwind.entities.concretes.jobPosition;

public interface jobPositionDao extends JpaRepository<jobPosition,Integer> {

	
	
}

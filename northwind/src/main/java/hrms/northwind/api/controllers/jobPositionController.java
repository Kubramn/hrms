package hrms.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.northwind.business.abstracts.jobPositionService;
import hrms.northwind.entities.concretes.jobPosition;

@RestController
@RequestMapping("/api/jobPosition")

public class jobPositionController {

	
	private jobPositionService job_PositionService;
	
	@Autowired
	public jobPositionController(jobPositionService job_PostingService) {
		super();
		this.job_PositionService = job_PostingService;
	}


	@GetMapping("/getall")
	public List<jobPosition> getAll(){
		return this.job_PositionService.getAll();
		
	}
}

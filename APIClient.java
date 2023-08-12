package com.restemp.userservice.services;
//
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//
import com.restemp.userservice.dto.DepartmentDto;
//
//
//	
	@FeignClient(value = "DEPARTMENT-SERVICE", url = "http://localhost:8080")
	public interface APIClient {
		
		
		 @GetMapping(value = "/api/departments/{id}")
		    DepartmentDto getDepartmentById(@PathVariable("id") Long userId);


}

//*************commented to implement the Webclient*******************

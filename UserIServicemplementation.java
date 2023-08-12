package com.restemp.userservice.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.restemp.userservice.dto.DepartmentDto;
import com.restemp.userservice.dto.ResponseDto;
import com.restemp.userservice.dto.UserDto;
import com.restemp.userservice.entities.User;
import com.restemp.userservice.repositories.UserRepository;
import com.restemp.userservice.services.APIClient;
//import com.restemp.userservice.services.APIClient;
import com.restemp.userservice.services.UserService;

@Service

public class UserIServicemplementation  implements UserService{
	
//	for step(2) FeignClient Some lines Commented27,37,56-58,
//	63-70
	
	
	// , RestTemplate restTemplate RestTemplate restTemplatearg in below construcotr
	
	public UserIServicemplementation(UserRepository userRepository,APIClient apiClient) { //,APIClient apiClient) {
		super();
		this.userRepository = userRepository;
//		this.restTemplate = restTemplate;
		this.apiClient = apiClient;
	}
//***********	Comented to implement WebClient***********
	
	
//	**********FEIGN CLIENT **************
	@Autowired
	private APIClient apiClient;
	
//	**********WEB CLIENT **************
//	@Autowired
//	private WebClient webClient;
	
//	**********RESTTEMPL CLIENT **************
//	@Autowired
//	private RestTemplate     restTemplate;
	
	

	@Autowired
	private UserRepository userRepository;
//    private RestTemplate restTemplate;
	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}
	@Override
	public ResponseDto getUser(Long userId) {
		
	ResponseDto responseDto=new ResponseDto();
	User user=userRepository.findById(userId).get();
	
//	 I think this is lastMethod line 39 related
	 UserDto userDto = mapToUser(user);
	 
	 
	 // note
//	*********************** this is  RestTemplate using call ************
	 
//	 ResponseEntity<DepartmentDto> responseEntity = restTemplate
//             .getForEntity("http://localhost:8080/api/departments/" + user.getDepartmentId(),
//             DepartmentDto.class);
//
	 
	 //not close
	 
//     DepartmentDto departmentDto = responseEntity.getBody();
//
//     System.out.println(responseEntity.getStatusCode());
//
//     responseDto.setUser(userDto);
//     responseDto.setDepartment(departmentDto);
//
//     return responseDto;
//
	 
//	 ****************************FeignClient call************ 
	 
DepartmentDto  departmentDto=apiClient.getDepartmentById(userDto.getId());

	responseDto.setUser(userDto); 
	
	responseDto.setDepartment(departmentDto);
	 
//	 
//	 
 return responseDto;
//	 
//	 ***************************CLOSE*****************************
	 
	 
	 
//	 ******************BEGIN WEBCLIENTDATA*********************
	
//	        DepartmentDto departmentDto = webClient.get()
//	                 .uri("http://localhost:8080/api/departments/" + user.getDepartmentId())
//	                         .retrieve()
//	                                 .bodyToMono(DepartmentDto.class)
//	                                         .block();
//	        responseDto.setUser(userDto);
//	        responseDto.setDepartment(departmentDto);
//
//	        return responseDto;
//	    
//	The Below procees is smae for all ret,web,Feign,	
		
	}
	private UserDto mapToUser(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}




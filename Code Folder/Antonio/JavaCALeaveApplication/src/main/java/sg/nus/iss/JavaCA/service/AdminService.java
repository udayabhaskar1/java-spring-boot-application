package sg.nus.iss.JavaCA.service;

import sg.nus.iss.JavaCA.model.Admin;

public interface AdminService {
	
	Admin authenticate(String uname, String pwd); 
	

}
package sg.nus.iss.JavaCA.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.nus.iss.JavaCA.model.Admin;
import sg.nus.iss.JavaCA.repo.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Resource
	private AdminRepository adminrepo;
	
	@Transactional
	public Admin authenticate(String uname, String pwd) {
		Admin a = adminrepo.findUserByNamePwd(uname, pwd);
		return a;
		
	}

}
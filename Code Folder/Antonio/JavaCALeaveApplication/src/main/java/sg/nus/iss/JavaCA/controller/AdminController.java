package sg.nus.iss.JavaCA.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sg.nus.iss.JavaCA.model.Admin;
import sg.nus.iss.JavaCA.repo.AdminRepository;
import sg.nus.iss.JavaCA.service.AdminService;

@Controller
public class AdminController {
	private AdminRepository adminrepo;

	public AdminRepository getAdminrepo() {
		return adminrepo;
	}
	
	@Autowired
	public void setAdminrepo(AdminRepository adminrepo) {
		this.adminrepo = adminrepo;
	}
	
	@Autowired
	private AdminService adminservice;
	
	
//	public String index() {
//		return "index";
//		}

	
	@RequestMapping(path="/welcome", method=RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("admin", new Admin());
		return "adminlogin";
	}
	
	@RequestMapping(path="/authenticate")
	public String authenticate(Admin admin) {
		Admin a = adminservice.authenticate(admin.getUsername(), admin.getPassword());
		System.out.println(a);
		if(a != null) {
			return "index";
		}
		return "adminlogin";
	}
	
}

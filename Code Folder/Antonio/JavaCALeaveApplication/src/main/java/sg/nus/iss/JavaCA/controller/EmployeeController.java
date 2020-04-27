package sg.nus.iss.JavaCA.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sg.nus.iss.JavaCA.model.Employee;
import sg.nus.iss.JavaCA.repo.EmployeeRepository;


@Controller
public class EmployeeController {
	
	private EmployeeRepository eRepo;

	@Autowired
	public void seteRepo(EmployeeRepository eRepo) {
		this.eRepo = eRepo;
	}
	
	
	
//	@RequestMapping(path="/welcome")
//	public String index() {
//		return "index";
//	}
	
	@RequestMapping(path="/employees/add", method = RequestMethod.GET)
	public String createEmployee(Model model) {
		model.addAttribute("employee",new Employee());
		return "EmployeeForm"; // lead to EmployeeForm.html page
	}
	
	@RequestMapping(path="/employees", method = RequestMethod.POST)
	public String saveEmployee(@Valid Employee employee, BindingResult bindingResult) {
//		System.out.println(employee);
		if(bindingResult.hasErrors()) {
			return "EmployeeForm";
		}
		eRepo.save(employee);
		return "redirect:/";// When I try "return "Employees" it does not work". It's working when I try to redirect to home page	
	}
	

	@RequestMapping(path="/employees", method=RequestMethod.GET)
	public String getAllEmployees(Model model) {
		model.addAttribute("employees",eRepo.findAll());
		return "Employees";
	}
	
	@RequestMapping(path="/employees/edit/{id}", method = RequestMethod.GET)
	public String editEmployee(Model model, @PathVariable(value="id") int id) {
		Employee e = eRepo.findById(id).orElse(null);
		System.out.println(e);
		model.addAttribute("employee", e);
		return "EditEmployee";
	}
	
	@RequestMapping(path="/employees/delete/{id}", method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable(name="id") int id) {
		eRepo.delete(eRepo.findById(id).orElse(null));
		return "redirect:/employees";// what's the difference between returning "redirect:/employees" and "Employees"
	}
	
}

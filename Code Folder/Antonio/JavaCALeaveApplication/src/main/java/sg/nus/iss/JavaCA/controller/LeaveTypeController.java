package sg.nus.iss.JavaCA.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sg.nus.iss.JavaCA.model.LeaveType;
import sg.nus.iss.JavaCA.repo.LeaveTypeRepository;

@Controller
public class LeaveTypeController {
	
	private LeaveTypeRepository leavetyperepo;
	
	@Autowired
	public void setLeavetyperepo(LeaveTypeRepository leavetyperepo) {
		this.leavetyperepo = leavetyperepo;
	}
	
	@RequestMapping(path="/createleavetype",  method = RequestMethod.GET)
	public String createLeaveType(Model model) {
		model.addAttribute("leavetype", new LeaveType());
		return "LeaveTypeForm"; // go to LeaveTypeForm.html
	}
	
	@RequestMapping(path="leavetypes", method=RequestMethod.POST)
	public String saveLeaveType(LeaveType leavetype) {
		leavetyperepo.save(leavetype);
		return "redirect:/welcome";//go to homepage
	}
	
	@RequestMapping(path="/leavetypes", method=RequestMethod.GET)
	public String showLeaveType(Model model) {
		model.addAttribute("leavetypes", leavetyperepo.findAll());
		return "LeaveTypes"; // go to LeaveTypes.html	
	}
	
	@RequestMapping(path="/leavetypes/edit/{id}",method=RequestMethod.GET)
	public String editLeaveType(Model model, @PathVariable(value="id") int id) {
		LeaveType lt = leavetyperepo.findById(id).orElse(null);
		model.addAttribute("leavetype", lt);
		return "LeaveTypeForm";//go to LeaveTypeForm.html	
	}
	
	@RequestMapping(path="/leavetypes/delete/{id}", method=RequestMethod.GET)
	public String deleteLeaveType(Model model, @PathVariable(value="id")int id) {
		LeaveType lt = leavetyperepo.findById(id).orElse(null);
		leavetyperepo.delete(lt);
		return "redirect:/leavetypes"; // go to LeaveTypes.html
	}
	
}


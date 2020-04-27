package sg.nus.iss.JavaCA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sg.nus.iss.JavaCA.model.Employee;
import sg.nus.iss.JavaCA.model.LeaveType;
import sg.nus.iss.JavaCA.model.PublicHoliday;
import sg.nus.iss.JavaCA.repo.PublicHolidayRepository;

@Controller
public class PublicHolidayController {
	
	@Autowired
	private PublicHolidayRepository publicholidayrepo;
	
	@RequestMapping(path="/createpublicholiday", method=RequestMethod.GET)
	public String createPublicHoliday(Model model) {
		model.addAttribute("publicholiday", new PublicHoliday());
		return "PublicHolidayForm"; // go to public holiday form;	
	}
	
	@RequestMapping(path="publicholidaylists", method=RequestMethod.POST)
	public String savePublicHoliday(PublicHoliday publicholiday) {
		publicholidayrepo.save(publicholiday);
		return "redirect:/publicholidaylists"; // go to homepage;
	}
	
	@RequestMapping(path="/publicholidaylists", method=RequestMethod.GET)
	public String showPublicHolidays(Model model) {
		model.addAttribute("publicholidays", publicholidayrepo.findAll());
		return "PublicHolidays"; 
	}
	
	@RequestMapping(path="/publicholidays/edit/{id}", method = RequestMethod.GET)
	public String editPublicHolidays(Model model, @PathVariable(value="id") int id) {
		PublicHoliday ph = publicholidayrepo.findById(id).orElse(null);
		System.out.println(ph);
		model.addAttribute("publicholiday", ph);
		return "PublicHolidayForm";
	}
	
	@RequestMapping(path="/publicholidays/delete/{id}", method=RequestMethod.GET)
	public String deletePublicHoliday(Model model, @PathVariable(value="id")int id) {
		PublicHoliday ph = publicholidayrepo.findById(id).orElse(null);
		publicholidayrepo.delete(ph);
		return "redirect:/publicholidaylists"; // go to LeaveTypes.html	
	}
	
	
	
	
	
	
	
	

}

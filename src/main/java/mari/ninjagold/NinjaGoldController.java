package mari.ninjagold;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NinjaGoldController {
	
	public int total;
	
	public static ArrayList<String> act = new ArrayList<String>();
	
	public int count(HttpSession session){
        session.setAttribute("total", 0);
        int total = (Integer) session.getAttribute("total");
		return total;
    }
	
    @RequestMapping("/clearsession")
    public String clear() {
    	total = 0;
    	act.add("You have resetted to 0.");
    	System.out.println("Your total: " + total);
    	return "redirect:/gold";
    }
    
	@RequestMapping("/gold")
	public String count(HttpSession session, Model model) {
		model.addAttribute("total", total);
    	model.addAttribute("act", act);
		return "index.jsp";
	}
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/gold";
	}
    
    @RequestMapping("/farm")
    public String farm(Model model) {
    	Date date = new Date();
    	int min = 10;
    	int max = 20;
    	int number = (int) (Math.random() * (max - min + 1) + min);
    	model.addAttribute("number", number);
    	model.addAttribute("date", date);
    	total += number;
    	act.add("You entered a farm and earned " + number + " gold." + "(" + date + ")");
    	System.out.println("Your total: " + total);
        return "redirect:/gold";
    }
    
    @RequestMapping("/cave")
    public String cave(Model model) {
    	Date date = new Date();
    	int min = 5;
    	int max = 10;
    	int number = (int) (Math.random() * (max - min + 1) + min);
    	model.addAttribute("number", number);
    	model.addAttribute("date", date);
    	total += number;
    	act.add("You entered a cave and earned " + number + " gold." + "(" + date + ")");
    	System.out.println("Your total: " + total);
        return "redirect:/gold";
    }
    
    @RequestMapping("/house")
    public String house(Model model) {
    	Date date = new Date();
    	int min = 2;
    	int max = 5;
    	int number = (int) (Math.random() * (max - min + 1) + min);
    	model.addAttribute("number", number);
    	model.addAttribute("date", date);
    	total += number;
    	act.add("You entered a house and earned " + number + " gold." + "(" + date + ")");
    	System.out.println("Your total: " + total);
        return "redirect:/gold";
    }
    
    @RequestMapping("/casino")
    public String casino(Model model) {
    	Date date = new Date();
    	int min = -50;
    	int max = 50;
    	int number = (int) (Math.random() * (max - min + 1) + min);
    	model.addAttribute("number", number);
    	model.addAttribute("date", date);
    	total += number;
    	if (number > 0) {
    		act.add("You entered a casino and earned " + number + " gold." + "(" + date + ")");
    	} else {
    		act.add("You entered a casino and lost " + number + " gold..Ouch.." + "(" + date + ")");
    	}
    	System.out.println("Your total: " + total);
        return "redirect:/gold";
    }
    
    @RequestMapping("/spa")
    public String spa(Model model) {
    	Date date = new Date();
    	int min = 5;
    	int max = 20;
    	int number = (int) (Math.random() * (max - min + 1) + min);
    	model.addAttribute("number", number);
    	model.addAttribute("date", date);
    	total -= number;
    	act.add("You entered a spa and lost " + number + " gold." + "(" + date + ")");
    	System.out.println("Your total: " + total);
        return "redirect:/gold";
    }
    
}

package dataCodeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import dataCodeController.Model.DataFirst;
import dataCodeController.service.DataFirstService;

@Controller
//@RestController  
public class DataFirstController {

	@Autowired
	private DataFirstService dataFirstSer;
	
	@GetMapping("/hello")
    public ModelAndView getMessage() {

		ModelAndView mav = new ModelAndView();

        //mav.addObject("message", "data");
		System.out.println("-----------------data----->");
        mav.setViewName("hello");

        return mav;
    }
	
	@GetMapping("/helloHello")
    public ModelAndView getMessageHello() {

		ModelAndView mav = new ModelAndView();
		DataFirst nam=new DataFirst();
        //mav.addObject("message", "data");
		System.out.println("-----------------data----->");
        mav.setViewName("hello");

        return mav;
    }
	
}

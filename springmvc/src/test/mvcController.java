package test;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mvc")
public class mvcController {

    @RequestMapping("/hello")
    public ModelAndView hello(){
    	ModelAndView mav = new ModelAndView("hello");
        return mav;
    }
    
    //match automatically
    @RequestMapping("/person")
    public String toPerson(String name,double age){
        System.out.println(name+" "+age);
        return "hello";
    }
    
    //boxing automatically
    @RequestMapping("/person1")
    public String toPerson(Student p){
        System.out.println(p.getName()+" "+p.getAge());
        return "hello";
    }
    
    //the parameter was converted in initBinder
    @RequestMapping("/date")
    public String date(Date date){
        System.out.println(date);
        return "hello";
    }
    
    //At the time of initialization,convert the type "String" to type "date"
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),
                true));
    }
    
    //pass the parameters to front-end using ajax
    @RequestMapping("/getPerson")
    public void getPerson(String name,PrintWriter pw){
        pw.write("hello,"+name);        
    }
    
    //redirect 
    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect:hello";
    }
    
    @RequestMapping(value="/param")
    public String testRequestParam(@RequestParam(value="id") Integer id,
            @RequestParam(value="name")String name){
        System.out.println(id+" "+name);
        return "/hello";
    }    

}
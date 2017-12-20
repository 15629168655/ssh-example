package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest")
public class RestController {
	
	//存储学生信息
	private List<Student> sList = new ArrayList<Student>();
	
	//初始化
	public RestController(){
		Student s1 = new Student(2017001, "张三", 23, "男", "计算机");
        Student s2 = new Student(2017002, "李四", 23, "男", "计算机");
        Student s3 = new Student(2017003, "王五", 23, "男", "计算机");
        sList.add(s1);
        sList.add(s2);
        sList.add(s3);
	}
	
	//查询所有
	@ResponseBody
	@RequestMapping(value="/student",method=RequestMethod.GET)
    public Object getAll(){
        System.out.println("GET:ALL"); 
        return sList;
    }
	
	//查询单个
	@ResponseBody
	@RequestMapping(value="/student/{id}",method=RequestMethod.GET)
	public Object getOne(@PathVariable("id") Integer id){
		System.out.println("GET:"+id);
		List<Student> selectList = new ArrayList<Student>();
		for(Student s : sList){
			if(s.getId()==id){
				selectList.add(s);
			} 
		}
		return selectList;
	}
	
	//添加
	@ResponseBody
	@RequestMapping(value="/student",method=RequestMethod.POST)
    public Object post(@RequestBody Student student){
        System.out.println("POST:"+student.getId());
        sList.add(student);
        return sList;
    }
    
	//修改
	@ResponseBody
    @RequestMapping(value="/student/{id}",method=RequestMethod.PUT)
    public Object put(@PathVariable("id") Integer id,@RequestBody Student student){
		System.out.println("PUT:"+id);
		List<Student> removeList = new ArrayList<Student>();
		for (Student s : sList) {
			if(s.getId()==id){
				student.setId(s.getId());
				removeList.add(s);	
			}
		}
		sList.removeAll(removeList);
		sList.add(student);
        return sList;
    }
    
	//删除所有
	@ResponseBody
	@RequestMapping(value="/student",method=RequestMethod.DELETE)
	public Object delete(){
		System.out.println("DELETE:ALL");
		sList.clear();
		return sList;
	}
	
	//删除单个
	@ResponseBody
    @RequestMapping(value="/student/{id}",method=RequestMethod.DELETE)
    public Object delete(@PathVariable("id") Integer id){
        System.out.println("DELETE:"+id);
        List<Student> removeList = new ArrayList<Student>();
        for (Student s : sList) {
			if(s.getId()==id){
				removeList.add(s);	
			}
		}
        sList.removeAll(removeList);
        return sList;
    }
}

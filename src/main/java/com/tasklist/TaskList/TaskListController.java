package com.tasklist.TaskList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tasklist.TaskList.dao.TaskListRepo;
import com.tasklist.TaskList.dao.UserRepo;

@Controller
public class TaskListController {
	
@Autowired
TaskListRepo tr;

@Autowired
UserRepo ur;

	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("h1", "ID");
		mv.addObject("h2", "Name");
		mv.addObject("h3", "Email");
		mv.addObject("users", ur.findDistinctEmail());
		return mv;
		
	}
	
	@RequestMapping("/userselect")
	public ModelAndView searchPerson(@RequestParam("userselect") String email) {
		ModelAndView mv = new ModelAndView("searchresults");
		mv.addObject("h1", "ID");
		mv.addObject("h2", "Name");
		mv.addObject("h3", "Email");
		mv.addObject("search", ur.findByEmail(email));
		// .jsp page, "Expression tag", "search parameters"
		return mv;
	}
	
	@RequestMapping("/tasks/{id}")
	public ModelAndView searchUserTask(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView("tasklist");
		mv.addObject("h1", "Task ID");
		mv.addObject("h2", "Description");
		mv.addObject("h3", "Due Date");
		mv.addObject("h4", "Completed");
		mv.addObject("h5", "User ID");
		mv.addObject("search2", tr.findUserListBytaskid(id));
		return mv;
	}
	
	@RequestMapping("/edit/task/{taskid}")
	public ModelAndView editTask() {
		ModelAndView mv = new ModelAndView("edittask");
		return mv;
	}
}

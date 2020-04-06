package com.example.MyFirstSpringBootProject;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("Name")
@Controller

public class TodoController {

	@Autowired
	TodoService service;
	
	@InitBinder()
	
	public void initBinder(WebDataBinder binder) 
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
				
	}
	

	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)

	public String ShowTodosPage(ModelMap model) {
		// String Name = (String) model.get("Name");

		model.put("todos", service.retrieveTodos("Aviraj"));
		// model.put("todos" , service.retrieveTodos(Name));

		return "list-todos";
	}

	@RequestMapping(value = "/add-todos", method = RequestMethod.GET)

	public String ShowAddTodosPage(ModelMap model) {
		model.addAttribute("todo", new Todos(0, "Aviraj", "", new Date(), false));

		return "todos";
	}

	@RequestMapping(value = "/add-todos", method = RequestMethod.POST)

	public String AddTodos(ModelMap model , Todos todo)  {
		
		

		service.addTodo(("Aviraj"), todo.getDesc(), todo.getTargetDate(), false);

		return "redirect:/list-todos";
	}

	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)

	public String DeleteTodo(@RequestParam int id) {
		service.deleteTodos(id);

		return "redirect:/list-todos";
	}

	@RequestMapping(value = "/update-todo", method = RequestMethod.GET)

	public String ShowUpdateTodoPage(@RequestParam int id,  ModelMap model) 
	{
		Todos todo = service.retrieveTodos1(id);
        model.put("todo", todo);
		return "todos";
	}

	
	
	@RequestMapping(value = "/update-todo", method = RequestMethod.POST)

	public String UpdateTodo( Todos todos) 
	{
		
		todos.setUser("Aviraj");
		service.UpdateTodo(todos);
		
		return "redirect:/list-todos";
		
		
		
		
	}

}
       
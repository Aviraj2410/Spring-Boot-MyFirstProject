package com.example.MyFirstSpringBootProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TodoService 
{
    private static List<Todos> todos = new ArrayList<Todos>();
    private static int todoCount = 3;

    static
    {
        todos.add(new Todos(1, "Aviraj", "Learn Spring MVC", new Date(), false));         
        todos.add(new Todos(2, "Aviraj", "Learn Struts", new Date(), false));
        todos.add(new Todos(3, "Aviraj", "Learn Hibernate", new Date(), false));
               
    }

    public List<Todos> retrieveTodos(String user)
    {
        List<Todos> filteredTodos = new ArrayList<Todos>();
        for (Todos todos : todos) 
        {
            if (todos.getUser().equals(user)) 
            {
                filteredTodos.add(todos);
            }
        }
        return filteredTodos;
    }
    
    
    
    public Todos retrieveTodos1(int id)
    {
        for (Todos todos : todos) 
        {
            if (todos.getId()==id) 
            {
                return todos;
            }
        }
        return null;
    }
    
    
    public Todos UpdateTodo(Todos todos)
    {
    	todos.remove(todos);
    	todos.add(todos);
		return todos;
    }

    public void addTodo(String name, String desc, Date targetDate,
            boolean isDone) 
    {
    	
        todos.add(new Todos(++todoCount, name, desc, targetDate, isDone));
    }

    public void deleteTodos(int id) 
    {
        Iterator<Todos> iterator = todos.iterator();
        while (iterator.hasNext()) 
        {
            Todos todos = iterator.next();
            if (todos.getId() == id)
            {
                iterator.remove();
            }
        }
    }
}
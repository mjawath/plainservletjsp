/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.test.model.Person;
import com.test.service.PersonService;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AJawath
 */
@WebServlet("/addPerson")
public class TestServlet extends HttpServlet{

private PersonService personService; 

    public TestServlet() {
        personService = new PersonService();//initialisation
    }


protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String country = request.getParameter("country");
	
                Person p = new Person();
                p.setId(String.valueOf(Math.random()));
                p.setName("name"+name);
                p.setCountry("country"+country);
                
                Person person = personService.createPerson(p); // may be used to show flash info
                
                List<Person> persons = personService.getAllPersons();                
                request.setAttribute("persons", persons);
                
                System.out.println("inside the TestServlet......some more update....."+persons.size());
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/persons.jsp");
		rd.forward(request, response);                        
	}    
}

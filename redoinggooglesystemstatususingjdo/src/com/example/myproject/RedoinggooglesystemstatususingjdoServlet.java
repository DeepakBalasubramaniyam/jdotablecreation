package com.example.myproject;
import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class RedoinggooglesystemstatususingjdoServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PersistenceManager pm=PMF.get().getPersistenceManager();
		Example ex=new Example();
		
		ex.setR1c1("Current Status");
		ex.setR1c2("10/17/15");
		ex.setR1c3("10/18/15");
		ex.setR1c4("10/19/15");
		ex.setR1c5("10/20/15");
		ex.setR1c6("10/21/15");
		ex.setR1c7("10/22/15");
		ex.setR1c8("10/23/15");
		
		ex.setR2c1("Gmail");
		ex.setR2c2("<form method=\"get\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR2c3("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR2c4("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR2c5("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR2c6("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR2c7("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR2c8("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		
		ex.setR3c1("Google Calendar");
		ex.setR3c2("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR3c3("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR3c4("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR3c5("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR3c6("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR3c7("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR3c8("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		
		ex.setR4c1("Google Talk");
		ex.setR4c2("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR4c3("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR4c4("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR4c5("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR4c6("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR4c7("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR4c8("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");

		ex.setR5c1("Google Drive");
		ex.setR5c2("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR5c3("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR5c4("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR5c5("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR5c6("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR5c7("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR5c8("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");

		ex.setR6c1("Google Docs");
		ex.setR6c2("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR6c3("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR6c4("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR6c5("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR6c6("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR6c7("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR6c8("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");

		ex.setR7c1("Google Sheets");
		ex.setR7c2("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR7c3("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR7c4("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR7c5("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR7c6("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR7c7("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		ex.setR7c8("<form method=\"post\" action=\"/redoinggooglesystemstatususingjdo\"><button type=\"submit\" class=\"btn22\">+</button></form>");
		

		ex.setR8c1("Google Slides");
		ex.setR8c2("ten");
		ex.setR8c3("eleven");
		ex.setR8c4("twelve");
		ex.setR8c5("thirteen");
		ex.setR8c6("fourteen");
		ex.setR8c7("fifteen");
		ex.setR8c8("sixteen");


		ex.setR9c1("Google Drawings");
		ex.setR9c2("ten");
		ex.setR9c3("eleven");
		ex.setR9c4("twelve");
		ex.setR9c5("thirteen");
		ex.setR9c6("fourteen");
		ex.setR9c7("fifteen");
		ex.setR9c8("sixteen");
		

		ex.setR10c1("Google Sites");
		ex.setR10c2("ten");
		ex.setR10c3("eleven");
		ex.setR10c4("twelve");
		ex.setR10c5("thirteen");
		ex.setR10c6("fourteen");
		ex.setR10c7("fifteen");
		ex.setR10c8("sixteen");
		

		ex.setR11c1("Google Groups");
		ex.setR11c2("ten");
		ex.setR11c3("eleven");
		ex.setR11c4("twelve");
		ex.setR11c5("thirteen");
		ex.setR11c6("fourteen");
		ex.setR11c7("fifteen");
		ex.setR11c8("sixteen");

		ex.setR12c1("Google Console");
		ex.setR12c2("ten");
		ex.setR12c3("eleven");
		ex.setR12c4("twelve");
		ex.setR12c5("thirteen");
		ex.setR12c6("fourteen");
		ex.setR12c7("fifteen");
		ex.setR12c8("sixteen");

		ex.setR13c1("Postini Services");
		ex.setR13c2("ten");
		ex.setR13c3("eleven");
		ex.setR13c4("twelve");
		ex.setR13c5("thirteen");
		ex.setR13c6("fourteen");
		ex.setR13c7("fifteen");
		ex.setR13c8("sixteen");
		

		ex.setR14c1("Google Hangouts");
		ex.setR14c2("ten");
		ex.setR14c3("eleven");
		ex.setR14c4("twelve");
		ex.setR14c5("thirteen");
		ex.setR14c6("fourteen");
		ex.setR14c7("fifteen");
		ex.setR14c8("sixteen");
		
		
		pm.makePersistent(ex);
		
		
		//Extent<Example> test=pm.getExtent(Example.class,false);
		for(Example e:pm.getExtent(Example.class,false)){
			
			request.setAttribute("R1c1",e.getR1c1());
			request.setAttribute("R1c2",e.getR1c2());
			request.setAttribute("R1c3",e.getR1c3());
			request.setAttribute("R1c4",e.getR1c4());
			request.setAttribute("R1c5",e.getR1c5());
			request.setAttribute("R1c6",e.getR1c6());
			request.setAttribute("R1c7",e.getR1c7());
			request.setAttribute("R1c8",e.getR1c8());
			
			request.setAttribute("R2c1",e.getR2c1());
			request.setAttribute("R2c2",e.getR2c2());
			request.setAttribute("R2c3",e.getR2c3());
			request.setAttribute("R2c4",e.getR2c4());
			request.setAttribute("R2c5",e.getR2c5());
			request.setAttribute("R2c6",e.getR2c6());
			request.setAttribute("R2c7",e.getR2c7());
			request.setAttribute("R2c8",e.getR2c8());

			request.setAttribute("R3c1",e.getR3c1());
			request.setAttribute("R3c2",e.getR3c2());
			request.setAttribute("R3c3",e.getR3c3());
			request.setAttribute("R3c4",e.getR3c4());
			request.setAttribute("R3c5",e.getR3c5());
			request.setAttribute("R3c6",e.getR3c6());
			request.setAttribute("R3c7",e.getR3c7());
			request.setAttribute("R3c8",e.getR3c8());

			request.setAttribute("R4c1",e.getR4c1());
			request.setAttribute("R4c2",e.getR4c2());
			request.setAttribute("R4c3",e.getR4c3());
			request.setAttribute("R4c4",e.getR4c4());
			request.setAttribute("R4c5",e.getR4c5());
			request.setAttribute("R4c6",e.getR4c6());
			request.setAttribute("R4c7",e.getR4c7());
			request.setAttribute("R4c8",e.getR4c8());
				

			request.setAttribute("R5c1",e.getR5c1());
			request.setAttribute("R5c2",e.getR5c2());
			request.setAttribute("R5c3",e.getR5c3());
			request.setAttribute("R5c4",e.getR5c4());
			request.setAttribute("R5c5",e.getR5c5());
			request.setAttribute("R5c6",e.getR5c6());
			request.setAttribute("R5c7",e.getR5c7());
			request.setAttribute("R5c8",e.getR5c8());
				

			request.setAttribute("R6c1",e.getR6c1());
			request.setAttribute("R6c2",e.getR6c2());
			request.setAttribute("R6c3",e.getR6c3());
			request.setAttribute("R6c4",e.getR6c4());
			request.setAttribute("R6c5",e.getR6c5());
			request.setAttribute("R6c6",e.getR6c6());
			request.setAttribute("R6c7",e.getR6c7());
			request.setAttribute("R6c8",e.getR6c8());
			

			request.setAttribute("R7c1",e.getR7c1());
			request.setAttribute("R7c2",e.getR7c2());
			request.setAttribute("R7c3",e.getR7c3());
			request.setAttribute("R7c4",e.getR7c4());
			request.setAttribute("R7c5",e.getR7c5());
			request.setAttribute("R7c6",e.getR7c6());
			request.setAttribute("R7c7",e.getR7c7());
			request.setAttribute("R7c8",e.getR7c8());

			request.setAttribute("R8c1",e.getR8c1());
			request.setAttribute("R8c2",e.getR8c2());
			request.setAttribute("R8c3",e.getR8c3());
			request.setAttribute("R8c4",e.getR8c4());
			request.setAttribute("R8c5",e.getR8c5());
			request.setAttribute("R8c6",e.getR8c6());
			request.setAttribute("R8c7",e.getR8c7());
			request.setAttribute("R8c8",e.getR8c8());

			request.setAttribute("R9c1",e.getR9c1());
			request.setAttribute("R9c2",e.getR9c2());
			request.setAttribute("R9c3",e.getR9c3());
			request.setAttribute("R9c4",e.getR9c4());
			request.setAttribute("R9c5",e.getR9c5());
			request.setAttribute("R9c6",e.getR9c6());
			request.setAttribute("R9c7",e.getR9c7());
			request.setAttribute("R9c8",e.getR9c8());

			request.setAttribute("R10c1",e.getR10c1());
			request.setAttribute("R10c2",e.getR10c2());
			request.setAttribute("R10c3",e.getR10c3());
			request.setAttribute("R10c4",e.getR10c4());
			request.setAttribute("R10c5",e.getR10c5());
			request.setAttribute("R10c6",e.getR10c6());
			request.setAttribute("R10c7",e.getR10c7());
			request.setAttribute("R10c8",e.getR10c8());

			request.setAttribute("R11c1",e.getR11c1());
			request.setAttribute("R11c2",e.getR11c2());
			request.setAttribute("R11c3",e.getR11c3());
			request.setAttribute("R11c4",e.getR11c4());
			request.setAttribute("R11c5",e.getR11c5());
			request.setAttribute("R11c6",e.getR11c6());
			request.setAttribute("R11c7",e.getR11c7());
			request.setAttribute("R11c8",e.getR11c8());

			request.setAttribute("R12c1",e.getR12c1());
			request.setAttribute("R12c2",e.getR12c2());
			request.setAttribute("R12c3",e.getR12c3());
			request.setAttribute("R12c4",e.getR12c4());
			request.setAttribute("R12c5",e.getR12c5());
			request.setAttribute("R12c6",e.getR12c6());
			request.setAttribute("R12c7",e.getR12c7());
			request.setAttribute("R12c8",e.getR12c8());
				

			request.setAttribute("R13c1",e.getR13c1());
			request.setAttribute("R13c2",e.getR13c2());
			request.setAttribute("R13c3",e.getR13c3());
			request.setAttribute("R13c4",e.getR13c4());
			request.setAttribute("R13c5",e.getR13c5());
			request.setAttribute("R13c6",e.getR13c6());
			request.setAttribute("R13c7",e.getR13c7());
			request.setAttribute("R13c8",e.getR13c8());

			request.setAttribute("R14c1",e.getR14c1());
			request.setAttribute("R14c2",e.getR14c2());
			request.setAttribute("R14c3",e.getR14c3());
			request.setAttribute("R14c4",e.getR14c4());
			request.setAttribute("R14c5",e.getR14c5());
			request.setAttribute("R14c6",e.getR14c6());
			request.setAttribute("R14c7",e.getR14c7());
			request.setAttribute("R14c8",e.getR14c8());
				
		}
		
		request.getRequestDispatcher("newindex.jsp").forward(request,response);
		
		
		

				pm.close();

	}
}

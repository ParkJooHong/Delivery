

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Delivery;
import dto.Order;


@WebServlet("*.do")
public class DeliveryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeliveryController() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	public void doProcess(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");


		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		System.out.println("command = " + command);
		
		String page = "";
		
		if(command.equals("/goOrder.do"))
		{
			String chicName = request.getParameter("chicName");
			int howNum = Integer.parseInt(request.getParameter("howNum"));
			String[] add = request.getParameterValues("add");
			String plz = request.getParameter("plz");
			
			Order o = new Order(chicName, howNum, add, plz);
			request.setAttribute("order", o);
			
			
			page = "delivery.jsp";
		}
		
		if(command.equals("/goDelivery.do"))
		{
			/// 위의 첫페이지 데이터값이다.
			String chicName = request.getParameter("chicName");
			int howNum = Integer.parseInt(request.getParameter("howNum"));
			String[] add = request.getParameterValues("add");
			String plz = request.getParameter("plz");
			
			Order o = new Order(chicName, howNum, add, plz);
			request.setAttribute("order", o);
			
			
			
			
			String buyer = request.getParameter("buyer");
			
			String tell = request.getParameter("tell");	
			
			String adress = request.getParameter("adress");
				
			Delivery d = new Delivery(buyer, tell, adress);
			request.setAttribute("delivery", d);
			
			//주문 금액
			int totalPrice = 10000 * howNum + 1000 * add.length;
			request.setAttribute("totalPrice", totalPrice);
			
			page ="order_info.jsp";
		}
				
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);

		
	}

}

package action;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import model.DateSet;
import model.Emp;

public class termAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		MemberDao md = new MemberDao();
		Date start = (Date)request.getAttribute("startday");
		Date end = (Date)request.getAttribute("endday");
		
		DateSet dateSet = new DateSet();
		
		dateSet.setStartday(start);
		dateSet.setEndday(end);
		
		List<Emp> list = md.empList(dateSet);
		request.setAttribute("list", list);
		
		forward.setRedirect(false);		
		forward.setPath("_1.where/NewFile1.jsp");
		return forward;
	}

}

<h1>Hello World!</h1>
<!-- 

class NewFile_jsp extends JspBase implements HttpJspBase {

	private ServletContext application;
	private ServletConfig config;
	private Object page;
	private HttpSession session;
	private JspWriter out;
	private PrintWriter pw;

	public void jspInit(){
		//...
	}
	
	public void jspService(HttpServletRequest request, HttpServletResponse response){
		application = this.getServletContext();
		config = this.getServletConfig();
		page = new Object();
		session = request.getSession();
		out = getJspWriter();
		pw = response.getPrintWriter();
		
		pw.write("<h1>Hello World!</h1>");
		
	}
	
	public void jspDestroy() {
		
	}
}

-->
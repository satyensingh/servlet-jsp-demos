package st1;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import java.io.*;
import javax.servlet.jsp.*;

public class TagCode4 extends SimpleTagSupport {

	public void doTag() throws JspException, IOException {
		JspFragment fr = getJspBody();
		JspContext context = getJspContext();
		if (fr == null) {
			context.getOut().write("You have not used body,hence we are leaving,Bye");
			throw new SkipPageException();
		} else {
			fr.invoke(null);
		}

	}
}
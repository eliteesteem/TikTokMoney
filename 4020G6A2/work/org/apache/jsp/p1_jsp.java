/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.68
 * Generated at: 2016-03-15 17:53:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class p1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write(" <!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \n");
      out.write("          \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"2.css\" /> \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h3>Macbook Details</h3>\n");
      out.write("<input type=\"button\"  class=\"button\" value=\"Go back\" class=\"button\" onClick=\"history.go(-1);return true;\"/>\n");
      out.write("<center><img alt=\"\" src=\"images/1.jpg\" align=\"middle\"></center>\n");
      out.write("<table class=\"details\">\n");
      out.write("<thead>\n");
      out.write("    <tr>\n");
      out.write("      <th class=\"row-1 row-name\">NAME</th>\n");
      out.write("      <th class=\"row-2 row-price\">PRICE</th>\n");
      out.write("      <th class=\"row-3 row-detail\">DESCRIPTION</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("<tbody><tr>\n");
      out.write("\t  <td>MABOOK</td>\n");
      out.write("      <td>$1499.99</td>\n");
      out.write("      <td>The MacBook is a brand of notebook computers manufactured by Apple Inc. from early 2006 to late 2011, and relaunched in 2015. It replaced the iBook series and 12-inch PowerBook series of notebooks as a part of the Apple-Intel transition from PowerPC. Positioned as the low end of the MacBook family, below the premium ultra-portable MacBook Air and the powerful MacBook Pro,[3] the MacBook was aimed at the consumer and education markets.[4] It was the best-selling Macintosh ever. For five months in 2008, it was the best-selling laptop of any brand in US retail stores.[5] Collectively, the MacBook brand is the \"world's top-selling line of premium laptops.\"[6]\n");
      out.write("\n");
      out.write("There have been four separate designs of the MacBook. The original model used a combination of polycarbonate and fiberglass casing which was modeled after the iBook G4. The second type was introduced in October 2008 alongside the 15-inch MacBook Pro; the MacBook shared the more expensive laptop's unibody aluminum casing, but omitted FireWire, which hurt sales.[7] A third design, introduced in late 2009, had a polycarbonate unibody casing and no FireWire ports.\n");
      out.write("\n");
      out.write("On July 20, 2011, the MacBook was quietly discontinued for consumer purchase as it had been effectively superseded by the MacBook Air whose starting price was lowered.[8] Apple continued to sell the MacBook to educational institutions until February 2012.[1][2]\n");
      out.write("\n");
      out.write("A new, redesigned MacBook line was launched on March 9, 2015. Available in silver, gold or space grey, it is thinner than the MacBook Air and removes the traditional MagSafe charging port (along with all other ports, except the headphone jack) in favor of the multi-purpose USB Type-C port.</td>\n");
      out.write("</tr>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

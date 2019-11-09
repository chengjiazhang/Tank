package com.tank.util.tag;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * @author: ZCJ
 * @Date: 2019-11-09 14:43
 * @Description:
 */
public class PageTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {

        JspWriter out=getJspContext().getOut();
        out.write("Hello World! This is my tag.");
    }
}

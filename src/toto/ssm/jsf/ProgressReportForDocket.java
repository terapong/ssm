package toto.ssm.jsf;

import java.io.InputStream;
import java.util.*;

import javax.faces.context.*;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.*;

import net.sf.jasperreports.engine.*;

public class ProgressReportForDocket {
	public String getProgressReportForForDocket() throws Exception {
		Map<String, Object> parametor = new HashMap<String, Object>();
		FacesContext facesContext = FacesContext.getCurrentInstance();
		ExternalContext externalContext = facesContext.getExternalContext();
		HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
		try {
		InputStream reportStream = facesContext.getExternalContext().getResourceAsStream("/report/ISSUESLIP.jrxml");
		ServletOutputStream servletOutputStream = response.getOutputStream();
		JasperRunManager.runReportToPdfStream(reportStream, servletOutputStream, parametor, new JREmptyDataSource());
		response.setContentType("application/pdf");
		servletOutputStream.flush();
		servletOutputStream.close();
		} catch (Exception ex) {
		ex.printStackTrace();
		} finally {
		response.getOutputStream().close();
		}
		facesContext.responseComplete();
		return null;
		}
}

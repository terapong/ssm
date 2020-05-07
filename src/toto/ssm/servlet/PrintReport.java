package toto.ssm.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections4.map.HashedMap;

import net.sf.jasperreports.engine.JasperPrint;

import javax.servlet.*;
import javax.servlet.http.*;

public class PrintReport {
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// 
//        ServletOutputStream servletOutputStream = response.getOutputStream();
// 
//        String reportName = "/resources/ISSUESLIP.jasper";
// 
//        Map<String, Object> paramters = new HashedMap<String, Object>();
//        Date paramtersDate= (Date) request.getAttribute("paramtersDate");
//        paramters.put("PARAMTER_DATE", paramtersDate);
// 
//        System.out.println("parameter value is: " + paramtersDate);
// 
//        InputStream reportStream = null;
//        JasperPrint jasperPrint = null;
// 
//        try {
// 
//            reportStream = getServletConfig().getServletContext().getResourceAsStream(reportName);
// 
//            JasperDesign jasperDesign = JRXmlLoader.load(reportStream);
//            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
//            jasperPrint = JasperFillManager.fillReport(jasperReport, paramters, getConnection());
// 
//            // OutputStream outputStream = new FileOutputStream(new
//            // File("catalogExxcelReport.xls"));
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
// 
//            JRXlsExporter exporter = new JRXlsExporter();
//            exporter.setParameter(JRExporterParameter.INPUT_FILE_NAME, jasperPrint);
//            exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, byteArrayOutputStream);
//            exporter.exportReport();
//            byteArrayOutputStream.writeTo(servletOutputStream);
// 
//            servletOutputStream.flush();
//            servletOutputStream.close();
//        } catch (Exception e) {
//            e.printStackTrace();
// 
//            throw new RuntimeException("Error on Reports Controller !!!");
// 
//        }
//    }

}

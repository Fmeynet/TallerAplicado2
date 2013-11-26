package reporte;

import java.sql.Connection;
import java.sql.DriverManager;

import org.orm.PersistentTransaction;

import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;




public class ServicioReporte {
	
	
public void reporteCliente(){
	
	try {
		 
		  // Class.forName ("oracle.jdbc.driver.OracleDriver"); 
		   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		  
		  // Connection conn = DriverManager.getConnection  
		    // ("jdbc:oracle:thin:@localhost:1521:xe", "USSer", "Pass");
		   
		   String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
		            "databaseName=TallerAp2;user=login;password=meynet;";
		   
		   Connection con = DriverManager.getConnection(connectionUrl);

		JasperReport reporte = (JasperReport) JRLoader.loadObject("report1.jasper");
	    JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, con);

	    JRExporter exporter = new JRPdfExporter();
	    
	    exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
	    exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("C:\\Users\\Meynet\\Desktop\\reporte.pdf"));
	    exporter.exportReport();

	} catch (Exception e) {
		// TODO: handle exception
		System.out.print(e);
	}
	
		   }
	
}


package ExtendReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

	 static ExtentReports extent;

	public static ExtentReports extentReportGenerator() {

		String reportPath = System.getProperty("user.dir") + "\\src\\test\\java\\ExtendReport\\ExtentReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
		reporter.config().setReportName("Test Automation");
		reporter.config().setDocumentTitle("Automation Result");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA", "Pankaj");

		return extent;
	}

}

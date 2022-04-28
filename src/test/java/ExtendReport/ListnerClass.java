package ExtendReport;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListnerClass extends BaseTest implements ITestListener {

	ExtentReports extent = ExtentReporterNG.extentReportGenerator();
	ExtentTest etest;
	private static ThreadLocal<ExtentTest> testrep = new ThreadLocal<ExtentTest>();

	@Override
	public void onTestStart(ITestResult result) {

		etest = extent.createTest(result.getMethod().getMethodName());// testcase name
		testrep.set(etest);
		System.out.println(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		testrep.get().log(Status.PASS, "Successfull");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		WebDriver driver = null;
		
		String TestCaseName = result.getMethod().getMethodName();
		
		System.out.println("TestCase name:" + TestCaseName);
		
		Object testObj = result.getInstance();

		Class clazz = result.getTestClass().getRealClass();
		try {
			driver = (WebDriver) clazz.getDeclaredField("driver").get(testObj);// will give the driver of failed
																				// testcase
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e1) {
			e1.printStackTrace();
		}

		testrep.get().fail(result.getThrowable());
		try {
			testrep.get().addScreenCaptureFromPath(getScreenshot(result.getMethod().getMethodName(), driver),
					TestCaseName);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

		extent.flush();

	}

}

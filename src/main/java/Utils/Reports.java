package Utils;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports implements  ITestListener{
	
	ExtentSparkReporter spark;
    ExtentReports report;
    ThreadLocal<ExtentTest> test = new ThreadLocal<>();
	
	@Override
	 public void onStart(ITestContext context) {
		if(report==null)
	{
	spark = new ExtentSparkReporter("C:\\Users\\user\\eclipse-workspace\\PlaywrightAssignment\\test-output\\ExtentReports\\Report.html");
	report = new ExtentReports();
	report.attachReporter(spark);
	}
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		 ExtentTest extentTest =
	                report.createTest(result.getTestClass().getName()
	                + " :: " + result.getMethod().getMethodName());
	        test.set(extentTest);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		test.get().pass("This Tc is passed");
	}
    @Override
    public void onTestFailure(ITestResult result) {
        test.get().fail(result.getThrowable());
        test.get().fail("This Tc is failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().skip("Test Skipped");
    }
    
    
    @Override
    public void onFinish(ITestContext context) {
        
        if (report != null) {
            report.flush();
        }
}

}

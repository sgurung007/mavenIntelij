package listeners;


import com.aventstack.extentreports.reporter.ExtentReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import runners.MyRunner;

public class Listener  implements ITestListener {
    private static ExtentReporter extent;
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart print");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess print");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("onTestFailure print Suraj");
        MyRunner.closeBrower();


    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {


    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish print");


    }
}

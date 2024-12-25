package base;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.Testutils;

public class listener extends Testutils implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName() + " test started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName() + " test passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName() + " test failed");
        try {
			getscreenshots();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getName() + " test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Can be used for tests that failed but still passed within a certain success percentage
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test started");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test finished");
    }
}



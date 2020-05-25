package com.nglebanov.selatstar.core.testng

import org.testng.*

class Listener : ITestListener, ISuiteListener, IInvokedMethodListener {
    // This belongs to ISuiteListener and will execute before the Suite start
    override fun onStart(arg0: ISuite) {
        Reporter.log("About to begin executing Suite " + arg0.name, true)
    }

    // This belongs to ISuiteListener and will execute, once the Suite is finished
    override fun onFinish(arg0: ISuite) {
        Reporter.log("About to end executing Suite " + arg0.name, true)
    }

    // This belongs to ITestListener and will execute before starting of Test set/batch
    override fun onStart(arg0: ITestContext) {
        Reporter.log("About to begin executing Test " + arg0.name, true)
    }

    // This belongs to ITestListener and will execute, once the Test set/batch is finished
    override fun onFinish(arg0: ITestContext) {
        Reporter.log("Completed executing test " + arg0.name, true)
    }

    // This belongs to ITestListener and will execute only when the test is pass
    override fun onTestSuccess(arg0: ITestResult) { // This is calling the printTestResults method
        printTestResults(arg0)
    }

    // This belongs to ITestListener and will execute only on the event of fail test
    override fun onTestFailure(arg0: ITestResult) { // This is calling the printTestResults method
        printTestResults(arg0)
    }

    // This belongs to ITestListener and will execute before the main test start (@Test)
    override fun onTestStart(arg0: ITestResult) {
        println("The execution of the main test starts now")
    }

    // This belongs to ITestListener and will execute only if any of the main test(@Test) get skipped
    override fun onTestSkipped(arg0: ITestResult) {
        printTestResults(arg0)
    }

    override fun onTestFailedButWithinSuccessPercentage(arg0: ITestResult) {}
    // This is the method which will be executed in case of test pass or fail
// This will provide the information on the test
    private fun printTestResults(result: ITestResult) {
        Reporter.log("Test Method resides in " + result.testClass.name, true)
        if (result.parameters.isNotEmpty()) {
            var params: String? = null
            for (parameter in result.parameters) {
                params += "$parameter,"
            }
            Reporter.log("Test Method had the following parameters : $params", true)
        }
        var status: String? = null
        when (result.status) {
            ITestResult.SUCCESS -> status = "Pass"
            ITestResult.FAILURE -> status = "Failed"
            ITestResult.SKIP -> status = "Skipped"
        }
        Reporter.log("Test Status: $status", true)
    }

    // This belongs to IInvokedMethodListener and will execute before every method including @Before @After @Test
    override fun beforeInvocation(arg0: IInvokedMethod, arg1: ITestResult) {
        val textMsg = "About to begin executing following method : " + returnMethodName(arg0.testMethod)
        Reporter.log(textMsg, true)
    }

    // This belongs to IInvokedMethodListener and will execute after every method including @Before @After @Test
    override fun afterInvocation(arg0: IInvokedMethod, arg1: ITestResult) {
        val textMsg = "Completed executing following method : " + returnMethodName(arg0.testMethod)
        Reporter.log(textMsg, true)
    }

    // This will return method names to the calling function
    private fun returnMethodName(method: ITestNGMethod): String {
        return method.realClass.simpleName + "." + method.methodName
    }
}
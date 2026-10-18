package JavaLoops;

public class TestResultAnalysis {

	public static void main(String[] args) {

		boolean[] testResults = {true, false, true, true, false, true, false, false, true};
		int totalTests = testResults.length;
		int passedTests = 0;
		
		//Print each testCase result
		System.out.println("test case result");
		for(int i = 0; i < totalTests; i++) {
			if(testResults[i]) {
				System.out.println("Test case: " + (i + 1) + " is PASSED");
				passedTests++;
			} else {
				System.out.println("Test case: " + (i + 1) + " is FAILED");
			}
		}
		
		//Calculate passedTests percentage
		double passPercentage = ( (double)passedTests/ totalTests ) * 100;
		
		//Print classification
		String testClassification = (passPercentage >= 35) ? "Test has PASSED" : "Test has FAILED";
		
		System.out.println("Test Summary");
		System.out.println("Total tests: " + totalTests);
		System.out.println("PASSED tests: " + passedTests);
		System.out.println("PASSED percentage: " + passPercentage + "%");
		System.out.println("Overall testRun: " + testClassification);

	}

}

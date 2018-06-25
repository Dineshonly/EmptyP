
package Generic;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports implements Iautoconst {
	@Test
	public void abc()
	{
	ExtentReports re=new ExtentReports(REPORT_PATH);
   ExtentTest t = re.startTest("testname");
  t.log(LogStatus.PASS,"this is my firest tc");
  re.flush();



}
}
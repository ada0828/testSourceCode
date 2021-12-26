package Task2.TestCase;

import Task1.TestCase.BaseTestCase;
import Task2.ApiImplementation.*;
import Task2.ApiTransaction.ApiTransaction;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Task2TestCase extends BaseTestCase {

    //最低温度
    @Test(alwaysRun = true)
    public void testChanceTminSCTestcase() throws Exception {
        String api_url = "https://pda.weather.gov.hk/sc/locspc/data/extended_forecast/TempProb/chance_tmin_sc.png";
        ChanceTminSC chanceTminSC = new ApiTransaction().getChanceTminSC();
        chanceTminSC.setApiUrl(api_url);
        HttpResponse response = chanceTminSC.invokeGet();
        System.out.println(response);
        StatusLine responseStatus = null;
        String content = "";
        if (response != null){
            responseStatus = response.getStatusLine();
            content = response.getEntity().toString();
            System.out.println("response status is:" + responseStatus);
            System.out.println("response content is:" + content);
            System.out.println("response content length is:" + content.length());
        }
        Assert.assertEquals(responseStatus.toString(),"HTTP/1.1 200 OK","testChanceTminSCTestcase response status test failed!");
    }

    //最高温度
    @Test(alwaysRun = true)
    public void testChanceTmaxSCTestcase() throws Exception {
        String api_url = "https://pda.weather.gov.hk/sc/locspc/data/extended_forecast/TempProb/chance_tmax_sc.png";
        ChanceTmaxSC chanceTmaxSC = new ApiTransaction().getChanceTmaxSC();
        chanceTmaxSC.setApiUrl(api_url);
        HttpResponse response = chanceTmaxSC.invokeGet();
        StatusLine responseStatus = null;
        String content = "";
        if (response != null){
            responseStatus = response.getStatusLine();
            content = response.getEntity().toString();
            System.out.println("response status is:" + responseStatus);
            System.out.println("response content is:" + content);
            System.out.println("response content length is:" + content.length());
        }
        Assert.assertEquals(responseStatus.toString(),"HTTP/1.1 200 OK","testChanceTmaxSCTestcase response status test failed!");
    }

    //平均海平面气压
    @Test(alwaysRun = true)
    public void testChanceMslpSCTestcase() throws Exception {
        String api_url = "https://pda.weather.gov.hk/sc/locspc/data/extended_forecast/TempProb/chance_mslp_sc.png";
        ChanceMslpSC chanceMslpSC = new ApiTransaction().getChanceMslpSC();
        chanceMslpSC.setApiUrl(api_url);
        HttpResponse response = chanceMslpSC.invokeGet();
        StatusLine responseStatus = null;
        String content = "";
        if (response != null){
            responseStatus = response.getStatusLine();
            content = response.getEntity().toString();
            System.out.println("response status is:" + responseStatus);
            System.out.println("response content is:" + content);
            System.out.println("response content length is:" + content.length());
        }
        Assert.assertEquals(responseStatus.toString(),"HTTP/1.1 200 OK","testChanceMslpSCTestcase response status test failed!");
    }

    @Test(alwaysRun = true)
    public void testFndUCTestcase() throws Exception {
        String api_url = "https://pda.weather.gov.hk/sc/locspc/data/fnd_uc.xml";
        FndUC fndUC = new ApiTransaction().getFndUC();
        fndUC.setApiUrl(api_url);
        HttpResponse response = fndUC.invokeGet();
        StatusLine responseStatus = null;
        String content = "";
        if (response != null){
            responseStatus = response.getStatusLine();
            content = response.getEntity().toString();
            System.out.println("response status is:" + responseStatus);
            System.out.println("response content is:" + content);
            System.out.println("response content length is:" + content.length());
        }
        Assert.assertEquals(responseStatus.toString(),"HTTP/1.1 200 OK","testFndUCTestcase response status test failed!");
    }

    @Test(alwaysRun = true)
    public void testFlwWxiconsCTestcase() throws Exception {
        String api_url = "https://pda.weather.gov.hk/sc/locspc/data/flw_wxicons_c.xml";
        FlwWxiconsC flwWxiconsC = new ApiTransaction().getFlwWxiconsC();
        flwWxiconsC.setApiUrl(api_url);
        HttpResponse response = flwWxiconsC.invokeGet();
        StatusLine responseStatus = null;
        String content = "";
        if (response != null){
            responseStatus = response.getStatusLine();
            content = response.getEntity().toString();
            System.out.println("response status is:" + responseStatus);
            System.out.println("response content is:" + content);
            System.out.println("response content length is:" + content.length());
        }
        Assert.assertEquals(responseStatus.toString(),"HTTP/1.1 200 OK","testFlwWxiconsCTestcase response status test failed!");
    }
}

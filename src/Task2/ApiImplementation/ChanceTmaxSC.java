package Task2.ApiImplementation;

import Task2.Common.Common;
import org.apache.http.HttpResponse;

public class ChanceTmaxSC {
    String apiUrl = "";
    String params = "";
    Common common = new Common();

    public void setApiUrl(String api_url) {
        apiUrl = api_url;
    }

    public void setParams(String par) {
        params = par;
    }

    //发送get请求
    public HttpResponse invokeGet() throws Exception {
        String urlStr = this.apiUrl;
        if (!(params.isEmpty() || params == null)){
            urlStr = this.apiUrl +"?" + params;
        }
        System.out.println("urlStr:" + urlStr);
        HttpResponse result = common.doGet(urlStr);
        return result;
    }
}

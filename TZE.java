import cn.hutool.core.util.ArrayUtil;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.junit.Before;
import org.junit.Test;

public class TZETest {

    private String token;

    private String activityId;

    private String sectionId = "1529641001463316480";

    @Before
    public void setUp() {
        token = "5b3ca1957915429b906da9f50970d707";
        activityId = "1677128971850170369";
    }

    @Test
    public void test() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            doSendRequests();
        }
    }

    private void doSendRequests() throws InterruptedException {
        for (String pendingResourceId : getPendingResourceIds(token)) {
            sendStudyPost(pendingResourceId);
            Thread.sleep(65000);
        }
    }

    private String[] getPendingResourceIds(String token) {
        String fetchUrl = "http://jspx.tze.cn:9900/myactivity/myCourse/list?activityId=" + activityId
                + "&completeFlag=0&pageNum=1&pageSize=100&sectionId=" + sectionId + "&subjectId=&courseCategoryId=";
        HttpResponse response = HttpUtil.createGet(fetchUrl).header("token", token).execute();
        JSONObject resJson = JSONUtil.parseObj(response.body());
        JSONArray jsonArray = (JSONArray) resJson.getByPath("data.list");
        String[] resourceIds = new String[jsonArray.size()];
        if (jsonArray != null) {
            for (int i = 0; i < jsonArray.size(); i++) {
                resourceIds[i] = (String) ((JSONObject) jsonArray.get(i)).get("resourceId");
            }
        }
        System.out.println(ArrayUtil.toString(resourceIds));
        return resourceIds;
    }

    private void sendStudyPost(String resourceId) {
        JSONObject param = new JSONObject();
        param.set("activityId", activityId);
        param.set("resourceId", resourceId);
        param.set("studyDuration", 3600);
        HttpResponse response = HttpUtil.createPost("http://jspx.tze.cn:9900/myactivity/studyLog/updateStudyLog").header("token", this.token).body(param.toString()).execute();
        System.out.println(response.body());
    }
}

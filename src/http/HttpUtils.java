package http;

import net.sf.json.JSONObject;
import org.junit.Test;

import java.io.*;

public class HttpUtils {
    @Test
    public void sendPostJson() throws IOException {
        String path = "http://127.0.0.1:8080";
        JSONObject obj = new JSONObject();
        obj.put("id", "10001");
        obj.put("name", "xiaxuan");
        obj.put("sex", "M");
        String jsonStr = obj.toString();
        byte[] data = jsonStr.getBytes();
        java.net.URL url = new java.net.URL(path);
        java.net.HttpURLConnection conn = (java.net.HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Connection", "keep-alive");
        conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
        conn.setRequestProperty("Content-Length", String.valueOf(data.length));
        OutputStream outStream = conn.getOutputStream();
        outStream.write(data);
        outStream.flush();
        outStream.close();
        if(conn.getResponseCode() == 200){
            BufferedReader in = new BufferedReader(new InputStreamReader((InputStream) conn.getInputStream(), "UTF-8"));
            String msg = in.readLine();
            System.out.println("msg11: " + msg);
            in.close();
        }
        conn.disconnect();
    }

}

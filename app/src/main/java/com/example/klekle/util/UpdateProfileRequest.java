package com.example.klekle.util;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class UpdateProfileRequest extends StringRequest {
    static ServerBaseURL serverBaseURL = new ServerBaseURL();
    static final String baseURL = serverBaseURL.getBaseURL();
    final static private String URL = baseURL + "/main/my/updateProfile.php";
    private Map<String,String>map;

    public UpdateProfileRequest(String profile, String userid, Response.Listener<String>listener){
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("profile", profile);
        map.put("userid", userid);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
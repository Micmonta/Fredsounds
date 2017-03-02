package network;

import android.app.Application;

import com.android.volley.RequestQueue;

/**
 * Created by micmo on 17/03/02.
 */


public class CustomApplication extends Application {
    private RequestQueue requestQueue;
    @Override
    public void onCreate() {
        super.onCreate();
        requestQueue = VolleySingleton.getInstance(getApplicationContext()).getRequestQueue();
    }
    public RequestQueue getVolleyRequestQueue(){
        return requestQueue;
    }
}
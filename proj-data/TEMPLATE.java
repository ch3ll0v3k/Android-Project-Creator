package PACKAGE_NAME;
// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.InputStream;
//import java.io.IOException;

// --------------------------------------------------
//import java.net.InetAddress;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.net.MalformedURLException;

//import java.net.HttpURLConnection;
//import java.net.URL;
// --------------------------------------------------
//import java.util.List;
//import java.util.ArrayList;

// --------------------------------------------------
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;

// --------------------------------------------------
//import org.apache.http.conn.HttpHostConnectException;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.HttpClient;
//import org.apache.http.HttpResponse;
//import org.apache.http.HttpEntity;
//import org.apache.http.entity.BufferedHttpEntity;
//import org.apache.http.impl.client.DefaultHttpClient;

// ==================================================
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.os.StrictMode;

//import android.os.Handler;
//import android.os.Looper;
//import android.os.Message;

//import android.app.Activity;
//import android.app.Dialog;

//import android.net.Uri;

//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;

//import android.transition.Transition;
//import android.transition.TransitionManager;
//import android.transition.AutoTransition;
//import android.transition.Visibility;
//import android.transition.Slide;
//import android.transition.Fade;
//import android.transition.Explode;

//import android.view.animation.Animation;
//import android.view.animation.Transformation;
//import android.view.animation.AnimationSet;
//import android.view.animation.AnimationUtils;

//import android.location.Location;
//import android.location.LocationListener;
//import android.location.LocationManager;

//import android.hardware.usb.UsbConstants;
//import android.hardware.usb.UsbDeviceConnection;
//import android.hardware.usb.UsbEndpoint;
//import android.hardware.usb.UsbInterface;
//import android.hardware.usb.UsbManager;
//import android.hardware.usb.UsbDevice;

//import android.net.Uri;
import android.util.Log;
//import android.content.Context;
//import android.content.Intent;

//import android.view.View;
//import android.view.View.OnClickListener;
//import android.view.View.OnTouchListener;
//import android.view.MotionEvent;
//import android.view.GestureDetector;
//import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
//import android.view.MenuInflater;
//import android.view.ContextMenu;
//import android.view.Gravity;
//import android.view.ViewGroup.MarginLayoutParams;
//import android.view.Gravity;

//import android.widget.TextView;
//import android.widget.Switch;
//import android.widget.Button;
//import android.widget.CompoundButton;
//import android.widget.CompoundButton.OnCheckedChangeListener;
//import android.widget.CheckBox;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.FrameLayout;
//import android.widget.LinearLayout.LayoutParams;
//import android.widget.ListView;
//import android.widget.ArrayAdapter;

// ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
import android.os.StrictMode;
import android.util.Log;
import android.view.Display;
import android.widget.Toast;

// -----------------------------------------------------
//import PACKAGE_NAME.CLASS_NAME.SomeClass;


// #################################################################################
public class CLASS_NAME extends ActionBarActivity {

    // ================================================================
    private final static String LOG_TAG = "CLASS_NAME";

    private static Display mDisplay;
    private static int SCREEN_W_PX;
    private static int SCREEN_H_PX;

    private static int SCREEN_W_IDP;
    private static int SCREEN_H_IDP;
    // -------------------------------------------------------


    //Button btn;
    //TextView textView;

    // ================================================================
    @Override
    public void onCreate(Bundle savedInstanceState) {

        // -------------------------------------------------------
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // -------------------------------------------------------
        LOG(" :::::::::::::::::::::::::::::::['CLASS_NAME']:::::::::::::::::::::::::::::::" );
        LOG(" onCreate: START");

        mDisplay     = getWindowManager().getDefaultDisplay();
        SCREEN_W_PX  = mDisplay.getWidth();
        SCREEN_H_PX  = mDisplay.getHeight();
        SCREEN_W_IDP = px2dp(SCREEN_W_PX);
        SCREEN_H_IDP = px2dp(SCREEN_H_PX);



        // -------------------------------------------------------
        // Bundle extras = getIntent().getExtras();
        // getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#33B5E5")));
        // getActionBar().setTitle("Niew Title");
        // getActionBar().setIcon(R.drawable.abc_ic_ab_back_holo_dark);

        // -------------------------------------------------------
        //enableStrictMode();
        // -------------------------------------------------------

    }

    // ================================================================
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // -------------------------------------------------------
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        // -------------------------------------------------------

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // -------------------------------------------------------
        //if( R.id.menu_main == item.getItemId()){} algorithm_x1_btn
        return true;
        // -------------------------------------------------------
    }

    // ================================================================
    public void ToastMsg(String _msg) { Toast.makeText(getApplicationContext(), _msg, Toast.LENGTH_LONG).show(); }
    public void LOG(String _msg) { Log.i( LOG_TAG, _msg ); }
    public int dp2px(int dp) { return (int) (dp * getResources().getDisplayMetrics().density + 0.5f); }
    public int px2dp(int px) { return (int) (px / getResources().getDisplayMetrics().density + 0.5f); }

    // ================================================================
    public void enableStrictMode() {

        try {

            LOG("StrictMode.setThreadPolicy(policy)");
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        } catch (Exception e) {

            LOG("enableStrictMode: "+e.toString());

        }
        // -------------------------------------------------------
    }
    // ================================================================

}
// #################################################################################
/*


::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
gps_status_switch.setOnCheckedChangeListener(new OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if (isChecked) GPSAction("start");
        else GPSAction("stop");
    }
});

// -------------------------------------------------------
mOnTouchListener = new OnTouchListener() {
    public boolean onTouch(View v, MotionEvent event) {

        // ---------------------------------------------------------------------
        if ( event.getAction() == MotionEvent.ACTION_MOVE) {

            if (allow_drag_menu) {

                if ( (int)event.getX() > MENU_W+1) {
                    // reverce ->
                } else {
                    menuLayoutParams.setMargins( -MENU_W + (int)event.getX(), -MENU_H, 0, 0);
                    swipe_menu_root.setLayoutParams( menuLayoutParams );
                }
            }

            return true;

        } else if ( event.getAction() == MotionEvent.ACTION_DOWN ) {

            start_X = (int)event.getX();
            //start_Y = (int)event.getY();

            if (start_X < 40 || start_X > 430 ) allow_drag_menu = true;
            return true;

        } else if ( event.getAction() == MotionEvent.ACTION_UP ) {

            end_X = (int)event.getX();
            //end_Y = (int)event.getY();

            if (allow_drag_menu) {

                if (end_X > (MENU_W/2))
                    menuLayoutParams.setMargins( 0, -MENU_H, 0, 0);// from right
                else
                    menuLayoutParams.setMargins( -MENU_W, -MENU_H, 0, 0);// from right

                swipe_menu_root.setLayoutParams( menuLayoutParams );

            }
            return true;

        } else return false;
        // ---------------------------------------------------------------------
    }
};

mRootView.setOnTouchListener( mOnTouchListener );

// -------------------------------------------------------
OnClickListener onClickListener = new OnClickListener() {
    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.show_on_map_btn:  mapAction("show"); break;
            case R.id.hide_map_btn:     mapAction("hide"); break;
            case R.id.save_map_btn:     mapAction("save"); break;
            case R.id.clear_list_btn:
                MakeRequest("?lat="+_lat+"&lon="+_lon);
                clearCordsList();
                break;

        }
    }
};

show_on_map_btn.setOnClickListener( onClickListener );
hide_map_btn.setOnClickListener( onClickListener );
save_map_btn.setOnClickListener( onClickListener );
clear_list_btn.setOnClickListener( onClickListener );

::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
private Bitmap getImageFromRemoteServer(String url_str) {

    // -------------------------------------------------------
    InputStream is = null;
    Bitmap bm = null;

    try {

        toStatusBar("Start: request");
        HttpGet httpRequest = new HttpGet(url_str);//bitmapUrl.toURI());
        HttpClient httpclient = new DefaultHttpClient();
        HttpResponse response = (HttpResponse) httpclient.execute(httpRequest);

        HttpEntity entity = response.getEntity();
        BufferedHttpEntity bufHttpEntity = new BufferedHttpEntity(entity);
        is = bufHttpEntity.getContent();
        bm = BitmapFactory.decodeStream(is);

    } catch ( Exception e ) {

        LOG("Exception:[0] " +e.toString() +"\n["+url_str+"]" );

    } finally {
        if (is != null)
            try { is.close(); } catch (IOException e) { LOG("IOException:[1] " + e.toString() ); }
    }

    return bm;
    // -------------------------------------------------------

}

::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
*/



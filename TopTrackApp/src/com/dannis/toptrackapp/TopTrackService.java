package com.dannis.toptrackapp;

import com.dannis.toptrackapp.LastFMHelper.ApiException;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

public class TopTrackService extends IntentService {
public static  String metro = "";
	  /** 
	   * A constructor is required, and must call the super IntentService(String)
	   * constructor with a name for the worker thread.
	   */
	  public TopTrackService() {
	      super("TopTrackService");
	  }

	  /**
	   * The IntentService calls this method from the default worker thread with
	   * the intent that started the service. When this method returns, IntentService
	   * stops the service, as appropriate.
	   */
	  @Override
	  protected void onHandleIntent(Intent intent) {
	      // Normally we would do some work here, like download a file
	     Bundle extras = intent.getExtras();
	     metro = extras.getString("metroName");
	     
	   
    	 String result = "";
    	 try {
    		 result = LastFMHelper.downloadFromServer(metro);
    		 //Add to content provider
    		 
    	 } catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
    	 }
	     
    	 Intent broadCast = new Intent();
	     broadCast.putExtra("data", result);
	     broadCast.setAction(TopTrackServiceReciever.ACTION);
	     //broadCast.addCategory(Intent.CATEGORY_DEFAULT);
	     sendBroadcast(broadCast);
	            
	  }
	  
	}
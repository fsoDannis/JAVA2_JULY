package com.dannis.toptrackapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class TopTrackServiceReciever extends BroadcastReceiver {
	
	public static final String ACTION = "com.dannis.toptrackapp.TopTrackServiceReciever.message";
	public TopTrackServiceReciever() {
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO: This method is called when the BroadcastReceiver is receiving
		// an Intent broadcast.
		Log.d("TopTrack","I am here");
		
		String data = intent.getExtras().getString("data");
		
		if(context instanceof TopTrackListActivity)
		{
			Log.d("TopTrack",data);
			//THESE THINGS I KNOW I NEED TO DO.... JUST NOT SURE HOW. 
			//Query data from content provider
			//Build list view from query data
			//Build list adapter
			//(TopTrackListActivity)context).
		}
		//throw new UnsupportedOperationException("Not yet implemented");
	}
}

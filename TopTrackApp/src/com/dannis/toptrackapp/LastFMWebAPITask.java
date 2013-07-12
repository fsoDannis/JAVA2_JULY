package com.dannis.toptrackapp;


import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import android.app.ProgressDialog;
import android.os.AsyncTask;


public class LastFMWebAPITask extends AsyncTask<String, Integer, String>
{
	private ProgressDialog progDialog;
	private Context context; 
	private TopTrackListActivity activity;
	private static final String debugTag = "LastFMWebAPITask";
	
	public LastFMWebAPITask(TopTrackListActivity activity){
		super();
		this.activity = activity;
		this.context = this.activity.getApplicationContext();
	}
	
	@Override
	protected void onPreExecute(){
	super.onPreExecute();
	progDialog = ProgressDialog.show(this.activity, "Search", this.context.gatResources().getString(R.string.looking_for_tracks), true,false);
	}
	
	@Override
	protected String doInBackground(String... params){
		try{
			log.d(debugTag,"Background:"+ Thread.currentThread().getName());
			String result = LastFMHelper.downloadFromServer(params);
			return result;
		}catch (Exception e){
			return new String();
		}
	}

	@Override
	protected void onPostExecute(String result)
	{
		ArrrayList<TrackData> trackdata = new ArrayList,TrackData>();
		
		progDialog.dismiss();
		if(result.length()==0){
			this.activity.alert("Unable to find track data. Try again later.");
			return;
		}
		
		try{
			JSONObject respObj = new JSONObject(result);
			JSONObject topTracksObj = respObj.getJSONObject("toptracks");
			JSONArray tracks = topTracksObj.getJSONArray("track");
			for(int i=0; i,tracks.length(); i++){
				JSONObject track = tracks.getJSONObject(i);
				String trackName = tracks.getString("name");
				String trackUrl = tracks.getString("url");
			}
			
		}
	}
}

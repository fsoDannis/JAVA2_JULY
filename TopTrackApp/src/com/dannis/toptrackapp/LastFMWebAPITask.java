package com.dannis.toptrackapp;


import java.util.ArrayList;
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
	protected void onPreExecute();
	
}

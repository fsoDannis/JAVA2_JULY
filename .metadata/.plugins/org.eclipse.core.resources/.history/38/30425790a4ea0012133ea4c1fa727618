package com.dannis.toptrackapp;

import java.io.ByteArrayOutputStream;



public class LastFMHelper {

		private static final String LastFMMetroTrackChartUrl =
				"http://ws.audioscrobbler.com/2.0/?method=geo.getmetrotrackchart&country=united+states&format=json&api_key=495635bdb0f5e1dd9f86c26e40c71829";
		private static final int HTTP_STATUS_OK = 200;
		private static byte[] buff = new byte [1024];
		private static final String logTag = "lastFMHelper";
		
		public static class ApiExecption extends Exception{
			private static final long serialVersionUID = 1L;
			
			public ApiException (String msg)
			{
				super (msg);
			}
			
			public ApiException (Stringmsg, Throwable thr)
			{
				super(msg,thr);
			}
		}
		
		protected static synchronized String downloadFromServer (String... params)
		throws ApiException{
			String retval = null;
			String metro = params[0];
			
			String url = LastFMMetroTrackUrl
					+"metro=" + metro;
			
			log.d(logTag,"Fetching " +url);
			
			HttpClient client = new DefaulHttpClient();
			HttpGet request = new HttpGet(url);
			
			try{
				httpResponse response = client.execute(request);
				StatusLine status = response.getStatusLine();
				if(status.getStatusCode() != HTTP_STATUS_OK){
					
					throw new ApiExecption("Invalid response from last.fm "+
					status.toString());
				}
				
				HttpEntity entity = response.getEntitiy();
				InputStream ist = entity.getContent();
				ByteArrayOutputStream content = new ByteArrayOutputStream();
				
				int readCount = 0;
				while((readCount =ist.read(buff)) !=-1){
					content.write(buff,0,readCount);
				}
				retval = new String (content.toByteArray());
				
			}catch(Exception e){
				throw new ApiExecption("Problem connecting to the server "+
						e.getMessage(),e);
			}
				return retval;
				
				}
			}
			
		}
				
				


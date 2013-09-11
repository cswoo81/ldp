package com.leave4u.ldp.core.util;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpClientUtil {
	
	private static Logger logger = LoggerFactory.getLogger(HttpClientUtil.class);
	
	private static final int HTTP_CONNECTION_TIMEOUT = 5000; 
	private static final int HTTP_SO_CONNECTION_TIMEOUT = 3000;
	
	public static String callJsonByGetMethod(String url) {
		
		String resultJson = ""; 
		
		HttpClient httpClient = new DefaultHttpClient();
		
		try {
			
			HttpConnectionParams.setConnectionTimeout(httpClient.getParams(), HTTP_CONNECTION_TIMEOUT);
			HttpConnectionParams.setSoTimeout(httpClient.getParams(), HTTP_SO_CONNECTION_TIMEOUT);
			
			HttpGet request = new HttpGet(url);
			
			HttpResponse response = httpClient.execute(request);
			
			int statusCd = response.getStatusLine().getStatusCode();
			logger.debug("response statusCd : " + statusCd); 
			
			HttpEntity responseEntity = response.getEntity(); 
			//Header responseEncoding = responseEntity. getContentEncoding(); 
			//logger.debug("response encoding : " + responseEncoding.getValue());
			
			resultJson = EntityUtils.toString(responseEntity);
			
			EntityUtils.consume(responseEntity);
			
		} catch (ClientProtocolException e) {
			logger.error("error : " + e);
		} catch (IOException e) {
			logger.error("error : " + e);
		} catch (Exception e) {
			logger.error("error : " + e);
		} finally {
			
			httpClient.getConnectionManager().shutdown();
			
		}
		
		return resultJson; 
		
	}

}

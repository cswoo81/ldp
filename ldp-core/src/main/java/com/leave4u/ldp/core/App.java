package com.leave4u.ldp.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.leave4u.ldp.core.util.HttpClientUtil;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static Logger logger = LoggerFactory.getLogger(App.class);
	
	
    public static void main( String[] args )
    {
    	logger.info("hello world debug logger .. ");
        
        String tmp = HttpClientUtil.callJsonByGetMethod("http://www.645lotto.net/ajax_jsonNew.asp?sGameNo=562");
        
        System.out.println("tmp : " + tmp);
        
        
    }
}

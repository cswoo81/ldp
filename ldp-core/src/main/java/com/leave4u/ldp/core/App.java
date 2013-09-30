package com.leave4u.ldp.core;

import java.util.Properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leave4u.ldp.core.dao.remote.LottoDrawResultRemoteDaoHttp;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static Logger logger = LoggerFactory.getLogger(App.class);
	
	@Autowired
	@Qualifier("config")
	private Properties config;
	
	public void main1(  )
    {
    	logger.info("hello world debug logger .. ");
    	
    	logger.debug("cswoo" + test());
        
        LottoDrawResultRemoteDaoHttp lottoDrawResultRemoteDaoHttp = new LottoDrawResultRemoteDaoHttp();
        
        lottoDrawResultRemoteDaoHttp.getLottoDrawResultItem(1);
        
        //System.out.println("tmp : " + tmp);
        
        
    }
    
    public String test() {
    	return (String)config.get("lotto-site-url");
    }
    
}

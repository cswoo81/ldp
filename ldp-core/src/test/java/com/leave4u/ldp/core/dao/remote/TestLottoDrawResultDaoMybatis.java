package com.leave4u.ldp.core.dao.remote;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.leave4u.ldp.core.dao.LottoDrawResultDao;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "classpath:/spring/core-context.xml" }) 
public class TestLottoDrawResultDaoMybatis {
	
	private static Logger logger = LoggerFactory.getLogger(TestLottoDrawResultDaoMybatis.class);
	
	@Autowired
	private LottoDrawResultDao lottoDrawResultDao;
	
	@Before
	public void beforeTest() {

		logger.debug("beforeTest start .. ");
		
		logger.debug("beforeTest end   .. ");
		
	}
	
	@After
	public void afterTest() {
		
		logger.debug("afterTest start .. ");
		
		logger.debug("afterTest end   .. ");
		
	}
	
	@Test
	public void testForTest() {
		
		logger.debug("testForTest start .. ");
		
		System.out.println("test..");
		
		logger.debug("testForTest end   .. ");
		
	}

}

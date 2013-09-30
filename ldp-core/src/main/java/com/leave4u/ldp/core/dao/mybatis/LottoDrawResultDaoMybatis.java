package com.leave4u.ldp.core.dao.mybatis;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.leave4u.ldp.core.dao.LottoDrawResultDao;

@Repository("lottoDrawResultDaoMybatis")
public class LottoDrawResultDaoMybatis extends SqlSessionDaoSupport implements
		LottoDrawResultDao {
	
	private static Logger logger = LoggerFactory.getLogger(LottoDrawResultDaoMybatis.class);

	@Override
	public Integer getLottoDrawResultMaxNoDao() {
		
		logger.debug("getLottoDrawResultMaxNoDao start .. ");
		
		
		
		logger.debug("getLottoDrawResultMaxNoDao end   .. ");
		
		return getSqlSession().selectOne("test.selectTest") ; 
		
	}

}

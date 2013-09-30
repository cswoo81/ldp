package com.leave4u.ldp.core.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leave4u.ldp.core.dao.LottoDrawResultRemoteDao;
import com.leave4u.ldp.core.service.LottoResultService;

@Service("lottoResultService")
public class LottoResultServiceImpl implements LottoResultService {
	
	private static Logger logger = LoggerFactory.getLogger(LottoResultServiceImpl.class);
	
	@Autowired
	private LottoDrawResultRemoteDao lottoDrawResultRemoteDao; 

	@Override
	public void getLottoResult() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLottoResult() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void putLottoDrawResultListFromLottoSite() {
		
		logger.debug("putLottoDrawResultListFromLottoSite start .. ");
		
		// DB에서 MAX NO 값 조회해 와서 +1 하여 로또 사이트 조회해 온 후
		
		// 그 값을 DB에 인서트 
		
		logger.debug("putLottoDrawResultListFromLottoSite end   .. ");
		
	}
	
	@Override
	public void putLottoDrawResultItemFromLottoSite(String no) {
		
	}
	
}

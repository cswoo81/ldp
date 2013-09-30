package com.leave4u.ldp.core.dao.remote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.leave4u.ldp.core.dao.LottoDrawResultRemoteDao;
import com.leave4u.ldp.core.exception.LdpInvalidParameterException;
import com.leave4u.ldp.core.model.LottoDrawResult;
import com.leave4u.ldp.core.util.HttpClientUtil;

@Repository("lottoDrawResultRemoteDao")
public class LottoDrawResultRemoteDaoHttp implements LottoDrawResultRemoteDao {
	
	private static Logger logger = LoggerFactory.getLogger(LottoDrawResultRemoteDaoHttp.class);
	
	@Value("#{config['lotto-site-url']}")
	private String lottoSiteUrl;

	@Override
	public LottoDrawResult getLottoDrawResultItem(Integer no) {
		
		logger.debug("getLottoDrawResultItem start .. ");
		
		if( no == null || no < 1 ) {
			throw new LdpInvalidParameterException("no : ", no);
		}
		
		String resultJson = HttpClientUtil.callJsonByGetMethod(lottoSiteUrl + no);
		
		Gson gson = new Gson();	
		
		LottoDrawResult lottoDrawResult = gson.fromJson(resultJson, LottoDrawResult.class);
		
		logger.debug("getLottoDrawResultItem end   .. ");
		
		return lottoDrawResult;
		
	}

}

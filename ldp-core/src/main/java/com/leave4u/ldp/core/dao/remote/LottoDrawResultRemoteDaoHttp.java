package com.leave4u.ldp.core.dao.remote;

import com.leave4u.ldp.core.dao.LottoDrawResultRemoteDao;
import com.leave4u.ldp.core.model.LottoDrawResult;
import com.leave4u.ldp.core.util.HttpClientUtil;

public class LottoDrawResultRemoteDaoHttp implements LottoDrawResultRemoteDao {

	@Override
	public LottoDrawResult getLottoDrawResult() {
		
		HttpClientUtil.callJsonByGetMethod("http://www.645lotto.net/ajax_jsonNew.asp?sGameNo=562");
		
		return null;
	}

}

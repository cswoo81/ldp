package com.leave4u.ldp.core.dao;

import com.leave4u.ldp.core.model.LottoDrawResult;

public interface LottoDrawResultRemoteDao {
	
	public LottoDrawResult getLottoDrawResultItem(String no);
	
	// 최신 로또 번호는 잘 못 들어올 수 있으므로 1주일 간 주기적으로 업데이트 쳐 준다. 
	// 스케쥴러가 돌면서 하루에 한번 씩 로또 당첨 번호를 가져온다. 
	// 스케쥴러가 돌 때 db에서 최신 로또 번호를 가져와 로또사이트에서 값을 가져와 비교한다.
	// 비교해서 다르면 업데이트 
	
	// 로또 사이트에서 다음 회차가 있을 경우 또 가져오는 걸 반복 없을때까지 인서트.
	// db에 최신 로또 번호가 없을 경우 1회부터 가져온다. 
	// 
	
	
	// 스케쥴러 최초 실행 시 db에서 가장 max 회차 수를 구해온다. 
	// max회차수가 null 또는 0 일 경우 next 회차 수는 1. 
	// max회차수로 사이트에서 번호조회했을 때 next회차수가 0보다 크면 다음 회차수가 존재하는 것이므로 
	// 반복해서 돈다. 
	// 0일 경우 멈춤. 
	// next회차수가 없을 경우 현재 db에 저장되어 있는 번호와 비교 후 다르면 업데이트. 

}

package com.leave4u.ldp.core.model;

import java.math.BigInteger;

import com.google.gson.annotations.SerializedName;

public class LottoDrawResult extends CommonModel {
	
	@SerializedName("GRWNO")
	private Integer DrawNo; 			// 추첨 회차
	@SerializedName("GRWDate")
	private String 	DrawDate; 			// 추첨 일자
	
	@SerializedName("FirstBall")
	private Integer winningBallFirth;		// 첫번째 당첨 볼 
	@SerializedName("SecondBall")
	private Integer winningBallSecond;  	// 두번째 당첨 볼 
	@SerializedName("ThirdBall")
	private Integer winningBallThird;		// 세번째 당첨 볼 
	@SerializedName("FourthBall")
	private Integer winningBallFourth;		// 네번째 당첨 볼 
	@SerializedName("FifthBall")
	private Integer winningBallFifth;		// 다섯번째 당첨 볼 
	@SerializedName("SixthBall")
	private Integer winningBallSixth;		// 여섯번째 당첨 볼 
	@SerializedName("BonusBall")
	private Integer winningBallBonus;		// 보너스 당첨 볼 
	
	@SerializedName("FirstPrzwnerCo")
	private Integer 	firstWinninerCnt;		// 1등 당첨자 수 
	@SerializedName("FirstWinamnt")
	private BigInteger 	firstWinningAmt;		// 1등 당첨금 액수 
	@SerializedName("TotFirstWinamnt")
	private BigInteger 	firstWinningAmtTot; 	// 1등 당첨금 총 액수
	@SerializedName("SecondPrzwnerCo")
	private Integer 	secondWinninerCnt;		// 2등 당첨자 수 
	@SerializedName("SecondWinamnt")
	private BigInteger 	secondWinningAmt;		// 2등 당첨금 액수 
	@SerializedName("TotSecondWinamnt")
	private BigInteger 	secondWinningAmtTot; 	// 2등 당첨금 총 액수
	@SerializedName("ThirdPrzwnerCo")
	private Integer 	thirdWinninerCnt;		// 3등 당첨자 수 
	@SerializedName("ThirdWinamnt")
	private BigInteger 	thirdWinningAmt;		// 3등 당첨금 액수 
	@SerializedName("TotThirdWinamnt")
	private BigInteger 	thirdWinningAmtTot; 	// 3등 당첨금 총 액수
	@SerializedName("ForthPrzwnerCo")
	private Integer 	fourthWinninerCnt;		// 4등 당첨자 수 
	@SerializedName("ForthWinamnt")
	private BigInteger 	fourthWinningAmt;		// 4등 당첨금 액수 
	@SerializedName("TotForthWinamnt")
	private BigInteger 	fourthWinningAmtTot; 	// 4등 당첨금 총 액수
	@SerializedName("FifthPrzwnerCo")
	private Integer 	fifthWinninerCnt;		// 5등 당첨자 수 
	@SerializedName("FifthWinamnt")
	private BigInteger 	fifthWinningAmt;		// 5등 당첨금 액수 
	@SerializedName("TotFifthWinamnt")
	private BigInteger 	fifthWinningAmtTot; 	// 5등 당첨금 총 액수
	
	@SerializedName("TotPrzwnerCo")
	private Integer 	winninerCntTot; 		// 총 당첨자 수 
	@SerializedName("TotPrzamnt")
	private BigInteger 	winningAmtTot; 			// 총 당첨 금액 
	@SerializedName("TotSellamnt")
	private BigInteger 	sellingAmtTot; 			// 총 판매 금액 
	
	@SerializedName("CarryOn")
	private String 		winninerDesc; 			// 1등 당첨자 설명 
	
	@SerializedName("prevDRWNO")
	private Integer 	prevDrawNo; 			// 이전 추첨 회차 
	@SerializedName("nextDRWNO")
	private Integer 	nextDrawNo; 			// 다음 추첨 회차 
	
	public Integer getDrawNo() {
		return DrawNo;
	}
	public void setDrawNo(Integer drawNo) {
		DrawNo = drawNo;
	}
	public String getDrawDate() {
		return DrawDate;
	}
	public void setDrawDate(String drawDate) {
		DrawDate = drawDate;
	}
	public Integer getWinningBallFirth() {
		return winningBallFirth;
	}
	public void setWinningBallFirth(Integer winningBallFirth) {
		this.winningBallFirth = winningBallFirth;
	}
	public Integer getWinningBallSecond() {
		return winningBallSecond;
	}
	public void setWinningBallSecond(Integer winningBallSecond) {
		this.winningBallSecond = winningBallSecond;
	}
	public Integer getWinningBallThird() {
		return winningBallThird;
	}
	public void setWinningBallThird(Integer winningBallThird) {
		this.winningBallThird = winningBallThird;
	}
	public Integer getWinningBallFourth() {
		return winningBallFourth;
	}
	public void setWinningBallFourth(Integer winningBallFourth) {
		this.winningBallFourth = winningBallFourth;
	}
	public Integer getWinningBallFifth() {
		return winningBallFifth;
	}
	public void setWinningBallFifth(Integer winningBallFifth) {
		this.winningBallFifth = winningBallFifth;
	}
	public Integer getWinningBallSixth() {
		return winningBallSixth;
	}
	public void setWinningBallSixth(Integer winningBallSixth) {
		this.winningBallSixth = winningBallSixth;
	}
	public Integer getWinningBallBonus() {
		return winningBallBonus;
	}
	public void setWinningBallBonus(Integer winningBallBonus) {
		this.winningBallBonus = winningBallBonus;
	}
	public Integer getFirstWinninerCnt() {
		return firstWinninerCnt;
	}
	public void setFirstWinninerCnt(Integer firstWinninerCnt) {
		this.firstWinninerCnt = firstWinninerCnt;
	}
	public BigInteger getFirstWinningAmt() {
		return firstWinningAmt;
	}
	public void setFirstWinningAmt(BigInteger firstWinningAmt) {
		this.firstWinningAmt = firstWinningAmt;
	}
	public BigInteger getFirstWinningAmtTot() {
		return firstWinningAmtTot;
	}
	public void setFirstWinningAmtTot(BigInteger firstWinningAmtTot) {
		this.firstWinningAmtTot = firstWinningAmtTot;
	}
	public Integer getSecondWinninerCnt() {
		return secondWinninerCnt;
	}
	public void setSecondWinninerCnt(Integer secondWinninerCnt) {
		this.secondWinninerCnt = secondWinninerCnt;
	}
	public BigInteger getSecondWinningAmt() {
		return secondWinningAmt;
	}
	public void setSecondWinningAmt(BigInteger secondWinningAmt) {
		this.secondWinningAmt = secondWinningAmt;
	}
	public BigInteger getSecondWinningAmtTot() {
		return secondWinningAmtTot;
	}
	public void setSecondWinningAmtTot(BigInteger secondWinningAmtTot) {
		this.secondWinningAmtTot = secondWinningAmtTot;
	}
	public Integer getThirdWinninerCnt() {
		return thirdWinninerCnt;
	}
	public void setThirdWinninerCnt(Integer thirdWinninerCnt) {
		this.thirdWinninerCnt = thirdWinninerCnt;
	}
	public BigInteger getThirdWinningAmt() {
		return thirdWinningAmt;
	}
	public void setThirdWinningAmt(BigInteger thirdWinningAmt) {
		this.thirdWinningAmt = thirdWinningAmt;
	}
	public BigInteger getThirdWinningAmtTot() {
		return thirdWinningAmtTot;
	}
	public void setThirdWinningAmtTot(BigInteger thirdWinningAmtTot) {
		this.thirdWinningAmtTot = thirdWinningAmtTot;
	}
	public Integer getFourthWinninerCnt() {
		return fourthWinninerCnt;
	}
	public void setFourthWinninerCnt(Integer fourthWinninerCnt) {
		this.fourthWinninerCnt = fourthWinninerCnt;
	}
	public BigInteger getFourthWinningAmt() {
		return fourthWinningAmt;
	}
	public void setFourthWinningAmt(BigInteger fourthWinningAmt) {
		this.fourthWinningAmt = fourthWinningAmt;
	}
	public BigInteger getFourthWinningAmtTot() {
		return fourthWinningAmtTot;
	}
	public void setFourthWinningAmtTot(BigInteger fourthWinningAmtTot) {
		this.fourthWinningAmtTot = fourthWinningAmtTot;
	}
	public Integer getFifthWinninerCnt() {
		return fifthWinninerCnt;
	}
	public void setFifthWinninerCnt(Integer fifthWinninerCnt) {
		this.fifthWinninerCnt = fifthWinninerCnt;
	}
	public BigInteger getFifthWinningAmt() {
		return fifthWinningAmt;
	}
	public void setFifthWinningAmt(BigInteger fifthWinningAmt) {
		this.fifthWinningAmt = fifthWinningAmt;
	}
	public BigInteger getFifthWinningAmtTot() {
		return fifthWinningAmtTot;
	}
	public void setFifthWinningAmtTot(BigInteger fifthWinningAmtTot) {
		this.fifthWinningAmtTot = fifthWinningAmtTot;
	}
	public Integer getWinninerCntTot() {
		return winninerCntTot;
	}
	public void setWinninerCntTot(Integer winninerCntTot) {
		this.winninerCntTot = winninerCntTot;
	}
	public BigInteger getWinningAmtTot() {
		return winningAmtTot;
	}
	public void setWinningAmtTot(BigInteger winningAmtTot) {
		this.winningAmtTot = winningAmtTot;
	}
	public BigInteger getSellingAmtTot() {
		return sellingAmtTot;
	}
	public void setSellingAmtTot(BigInteger sellingAmtTot) {
		this.sellingAmtTot = sellingAmtTot;
	}
	public String getWinninerDesc() {
		return winninerDesc;
	}
	public void setWinninerDesc(String winninerDesc) {
		this.winninerDesc = winninerDesc;
	}
	public Integer getPrevDrawNo() {
		return prevDrawNo;
	}
	public void setPrevDrawNo(Integer prevDrawNo) {
		this.prevDrawNo = prevDrawNo;
	}
	public Integer getNextDrawNo() {
		return nextDrawNo;
	}
	public void setNextDrawNo(Integer nextDrawNo) {
		this.nextDrawNo = nextDrawNo;
	}

}

package kr.co.movie.review.model;

import java.sql.Timestamp;

public class ReviewVO {
	private int rNum;
	private String uId;
	private String mTitle;
	private double rRate;
	private String rContent;
	private Timestamp rDate;
	private int mId;

	public ReviewVO() {
		super();
	}

	public ReviewVO(int rNum, String uId, String mTitle, int rRate, String rContent, Timestamp rDate, int mId) {
		super();
		this.rNum = rNum;
		this.uId = uId;
		this.mTitle = mTitle;
		this.rRate = rRate;
		this.rContent = rContent;
		this.rDate = rDate;
		this.mId = mId;
	}

	public int getrNum() {
		return rNum;
	}

	public void setrNum(int rNum) {
		this.rNum = rNum;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public double getrRate() {
		return rRate;
	}

	public void setrRate(double rRate) {
		this.rRate = rRate;
	}

	public String getrContent() {
		return rContent;
	}

	public void setrContent(String rContent) {
		this.rContent = rContent;
	}

	public Timestamp getrDate() {
		return rDate;
	}

	public void setrDate(Timestamp rDate) {
		this.rDate = rDate;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	@Override
	public String toString() {
		return "ReviewVO [rNum=" + rNum + ", uId=" + uId + ", mTitle=" + mTitle + ", rRate=" + rRate + ", rContent="
				+ rContent + ", rDate=" + rDate + ", mId=" + mId + "]";
	}

}

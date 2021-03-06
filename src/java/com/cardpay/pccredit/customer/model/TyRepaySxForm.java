package com.cardpay.pccredit.customer.model;

/**
 * 
 * @author 贺珈
 * 客户经理收息（太原）
 *
 */
public class TyRepaySxForm{
	private String userId;//客户经理id
	private String month;//月份
	private String deptName;//小微团队
	private String displayName;//客户经理名称
	private String total;//收息额度
	private String countSx;//收息笔数
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getCountSx() {
		return countSx;
	}
	public void setCountSx(String countSx) {
		this.countSx = countSx;
	}

}

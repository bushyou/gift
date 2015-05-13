package com.bushyou.domain;

import java.io.Serializable;
import java.util.Date;

public class UserExchangeGiftQuery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5024218525073255619L;

	private Long userId;
	/**
	 * 0未兑换，8已经兑换，1兑换中，-4 已经删除
	 */
	private Integer status;
	private Long id;
	/**
	 * 礼品类型，本项目等于1，冗余自同exchange_gift表的type
	 */
	private Integer type;

	// 有效期 设置为true，相当于设置 查有效期内的记录
	private boolean valid = true;

	private boolean orderByGmtCreateDesc = false;

	private boolean orderByExchangeEndTime = true;

	private Long sellerId;

	// 页号 页号从0开始,默认为0
	private Integer pageNum;

	// 页大小 pageSize默认为10
	private Integer pageSize;
	
	//后台使用
	private Date beginGmtCreate;
	//后台使用
	private Date endGmtCreate;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public boolean isOrderByGmtCreateDesc() {
		return orderByGmtCreateDesc;
	}

	public void setOrderByGmtCreateDesc(boolean orderByGmtCreateDesc) {
		if (orderByGmtCreateDesc == true) {
			orderByExchangeEndTime = false;
		} else {
			orderByExchangeEndTime = true;
		}
		this.orderByGmtCreateDesc = orderByGmtCreateDesc;
	}

	public boolean isOrderByExchangeEndTime() {
		return orderByExchangeEndTime;
	}

	public void setOrderByExchangeEndTime(boolean orderByExchangeEndTime) {
		this.orderByExchangeEndTime = orderByExchangeEndTime;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * 获得limit开始号
	 * 
	 * @return
	 */
	public Integer getStartRow() {
		if (pageNum == null)
			pageNum = 0;
		if (pageSize == null)
			pageSize = 10;
		if (pageNum < 0)
			pageNum = 0;
		if (pageSize <= 0)
			pageSize = 10;

		return pageNum * pageSize;
	}

	/**
	 * 获得limit结束号
	 * 
	 * @return
	 */
	public Integer getEndRow() {

		if (pageSize == null)
			pageSize = 10;
		if (pageSize <= 0)
			pageSize = 10;

		return pageSize;
	}

	public Date getBeginGmtCreate() {
		return beginGmtCreate;
	}

	public void setBeginGmtCreate(Date beginGmtCreate) {
		this.beginGmtCreate = beginGmtCreate;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public boolean isValid() {
		return valid;
	}

	public Date getEndGmtCreate() {
		return endGmtCreate;
	}

	public void setEndGmtCreate(Date endGmtCreate) {
		this.endGmtCreate = endGmtCreate;
	}

}

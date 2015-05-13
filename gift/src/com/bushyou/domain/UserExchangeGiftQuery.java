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
	 * 0δ�һ���8�Ѿ��һ���1�һ��У�-4 �Ѿ�ɾ��
	 */
	private Integer status;
	private Long id;
	/**
	 * ��Ʒ���ͣ�����Ŀ����1��������ͬexchange_gift���type
	 */
	private Integer type;

	// ��Ч�� ����Ϊtrue���൱������ ����Ч���ڵļ�¼
	private boolean valid = true;

	private boolean orderByGmtCreateDesc = false;

	private boolean orderByExchangeEndTime = true;

	private Long sellerId;

	// ҳ�� ҳ�Ŵ�0��ʼ,Ĭ��Ϊ0
	private Integer pageNum;

	// ҳ��С pageSizeĬ��Ϊ10
	private Integer pageSize;
	
	//��̨ʹ��
	private Date beginGmtCreate;
	//��̨ʹ��
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
	 * ���limit��ʼ��
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
	 * ���limit������
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

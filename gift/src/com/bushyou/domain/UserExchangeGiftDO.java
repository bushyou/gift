package com.bushyou.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * �û��õ������ļ�¼��
 * 
 * @author bushe Date 2015-04-02
 * 
 */
public class UserExchangeGiftDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -106901391234436927L;

	/**
	 * ����
	 */
	private Long id;

	/**
	 * ����ʱ��
	 */
	private Date gmtCreate;

	/**
	 * �޸�ʱ��
	 */
	private Date gmtModified;

	/**
	 * �ֱ��ֶ����id
	 */
	private Long userId;

	/**
	 * ����ǳ�
	 */
	private String userNick;

	/**
	 * ��Ʒ���ͣ�����Ŀ����1��������ͬexchange_gift���type
	 */
	private Integer type;

	/**
	 * ����userid
	 */
	private Long sellerId;

	/**
	 * �����ǳ�
	 */
	private String sellerNick;

	/**
	 * 0δ�һ���8�Ѿ��һ���1�һ��У�-4 �Ѿ�ɾ��
	 */
	private Integer status = 0;

	/**
	 * �һ��Ŀ�ʼʱ��
	 */
	private Date exchangeStartTime;

	/**
	 * �һ��Ľ���ʱ��
	 */
	private Date exchangeEndTime;

	/**
	 * �û��һ�ʱ��
	 */
	private Date exchangedTime;

	/**
	 * �һ����������ͣ��γ̣����ȣ�����һ��Ϊ��Ʒ
	 */
	private Long exchangedContentType;

	/**
	 * �һ������ݣ��γ̣����ȣ�����
	 */
	private Long exchangedContentId;

	/**
	 * ��Դ,isv��ڣ���Ŀ��� �������Ϣ�洢��attribute�У���
	 */
	private String source;

	/**
	 * ��չ�ֶ�
	 */
	private String attribute;

	/**
	 * ���°汾��
	 */
	private Integer version;

	/**
	 * �����������id
	 */
	private Long giftId;

	/**
	 * ����id
	 */
	private Long originalOrderId;

	/**
	 * ��ʱ������Ŀǰ�γ���������CourseGiftDO�е�richCourseListֵ��search��ȡ������search��serviceд��Щ�߼�
	 * ��manager�㲻��ֱ�ӵ� ������ʹ��
	 */
	@Deprecated
	private Object bizObject;

	/**
	 * �һ���ʱ��str
	 */
	private String strExchangeEndTime;

	/**
	 * setter for column ����
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * getter for column ����
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * setter for column ����ʱ��
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	/**
	 * getter for column ����ʱ��
	 */
	public Date getGmtCreate() {
		return this.gmtCreate;
	}

	/**
	 * setter for column �޸�ʱ��
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	/**
	 * getter for column �޸�ʱ��
	 */
	public Date getGmtModified() {
		return this.gmtModified;
	}

	/**
	 * setter for column �ֱ��ֶ����id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * getter for column �ֱ��ֶ����id
	 */
	public Long getUserId() {
		return this.userId;
	}

	/**
	 * setter for column ����ǳ�
	 */
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	/**
	 * getter for column ����ǳ�
	 */
	public String getUserNick() {
		return this.userNick;
	}

	/**
	 * setter for column ��Ʒ���ͣ�����Ŀ����1��������ͬexchange_gift���type
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * getter for column ��Ʒ���ͣ�����Ŀ����1��������ͬexchange_gift���type
	 */
	public Integer getType() {
		return this.type;
	}

	/**
	 * setter for column ����userid
	 */
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	/**
	 * getter for column ����userid
	 */
	public Long getSellerId() {
		return this.sellerId;
	}

	/**
	 * setter for column �����ǳ�
	 */
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	/**
	 * getter for column �����ǳ�
	 */
	public String getSellerNick() {
		return this.sellerNick;
	}

	/**
	 * setter for column 0δ�һ���8�Ѿ��һ���1�һ��У�-4 �Ѿ�ɾ��
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * getter for column 0δ�һ���8�Ѿ��һ���1�һ��У�-4 �Ѿ�ɾ��
	 */
	public Integer getStatus() {
		return this.status;
	}

	/**
	 * setter for column �һ��Ŀ�ʼʱ��
	 */
	public void setExchangeStartTime(Date exchangeStartTime) {
		this.exchangeStartTime = exchangeStartTime;
	}

	/**
	 * getter for column �һ��Ŀ�ʼʱ��
	 */
	public Date getExchangeStartTime() {
		return this.exchangeStartTime;
	}

	/**
	 * setter for column �һ��Ľ���ʱ��
	 */
	public void setExchangeEndTime(Date exchangeEndTime) {
		this.exchangeEndTime = exchangeEndTime;
	}

	/**
	 * getter for column �һ��Ľ���ʱ��
	 */
	public Date getExchangeEndTime() {
		return this.exchangeEndTime;
	}

	/**
	 * setter for column �û��һ�ʱ��
	 */
	public void setExchangedTime(Date exchangedTime) {
		this.exchangedTime = exchangedTime;
	}

	/**
	 * getter for column �û��һ�ʱ��
	 */
	public Date getExchangedTime() {
		return this.exchangedTime;
	}

	/**
	 * setter for column �һ����������ͣ��γ̣����ȣ�����һ��Ϊ��Ʒ
	 */
	public void setExchangedContentType(Long exchangedContentType) {
		this.exchangedContentType = exchangedContentType;
	}

	/**
	 * getter for column �һ����������ͣ��γ̣����ȣ�����һ��Ϊ��Ʒ
	 */
	public Long getExchangedContentType() {
		return this.exchangedContentType;
	}

	/**
	 * setter for column �һ������ݣ��γ̣����ȣ�����
	 */
	public void setExchangedContentId(Long exchangedContentId) {
		this.exchangedContentId = exchangedContentId;
	}

	/**
	 * getter for column �һ������ݣ��γ̣����ȣ�����
	 */
	public Long getExchangedContentId() {
		return this.exchangedContentId;
	}

	/**
	 * setter for column ��Դ,isv��ڣ���Ŀ��� �������Ϣ�洢��attribute��
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * getter for column ��Դ,isv��ڣ���Ŀ��� �������Ϣ�洢��attribute��
	 */
	public String getSource() {
		return this.source;
	}

	/**
	 * setter for column ��չ�ֶ�
	 */
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	/**
	 * getter for column ��չ�ֶ�
	 */
	public String getAttribute() {
		return this.attribute;
	}

	/**
	 * setter for column ���°汾��
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * getter for column ���°汾��
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * setter for column �����������id
	 */
	public void setGiftId(Long giftId) {
		this.giftId = giftId;
	}

	/**
	 * getter for column �����������id
	 */
	public Long getGiftId() {
		return this.giftId;
	}

	public Object getBizObject() {
		return bizObject;
	}

	@Deprecated
	public void setBizObject(Object bizObject) {
		this.bizObject = bizObject;
	}

	public Long getOriginalOrderId() {
		return originalOrderId;
	}

	public void setOriginalOrderId(Long originalOrderId) {
		this.originalOrderId = originalOrderId;
	}

	public String getStrExchangeEndTime() {
		return attribute;

	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}

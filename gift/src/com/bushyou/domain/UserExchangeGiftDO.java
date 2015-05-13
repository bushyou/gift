package com.bushyou.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户得到福袋的记录表
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
	 * 主键
	 */
	private Long id;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 分表字段买家id
	 */
	private Long userId;

	/**
	 * 买家昵称
	 */
	private String userNick;

	/**
	 * 礼品类型，本项目等于1，冗余自同exchange_gift表的type
	 */
	private Integer type;

	/**
	 * 卖家userid
	 */
	private Long sellerId;

	/**
	 * 卖家昵称
	 */
	private String sellerNick;

	/**
	 * 0未兑换，8已经兑换，1兑换中，-4 已经删除
	 */
	private Integer status = 0;

	/**
	 * 兑换的开始时间
	 */
	private Date exchangeStartTime;

	/**
	 * 兑换的结束时间
	 */
	private Date exchangeEndTime;

	/**
	 * 用户兑换时间
	 */
	private Date exchangedTime;

	/**
	 * 兑换的内容类型（课程，题库等），不一定为商品
	 */
	private Long exchangedContentType;

	/**
	 * 兑换的内容（课程，题库等）主键
	 */
	private Long exchangedContentId;

	/**
	 * 来源,isv入口，类目活动； 具体的信息存储在attribute中（）
	 */
	private String source;

	/**
	 * 扩展字段
	 */
	private String attribute;

	/**
	 * 更新版本号
	 */
	private Integer version;

	/**
	 * 外键，福袋的id
	 */
	private Long giftId;

	/**
	 * 订单id
	 */
	private Long originalOrderId;

	/**
	 * 临时变量，目前课程赠送里中CourseGiftDO中的richCourseList值从search里取，但是search的service写了些逻辑
	 * ，manager层不敢直接调 不建议使用
	 */
	@Deprecated
	private Object bizObject;

	/**
	 * 兑换的时间str
	 */
	private String strExchangeEndTime;

	/**
	 * setter for column 主键
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * getter for column 主键
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * setter for column 创建时间
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	/**
	 * getter for column 创建时间
	 */
	public Date getGmtCreate() {
		return this.gmtCreate;
	}

	/**
	 * setter for column 修改时间
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	/**
	 * getter for column 修改时间
	 */
	public Date getGmtModified() {
		return this.gmtModified;
	}

	/**
	 * setter for column 分表字段买家id
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * getter for column 分表字段买家id
	 */
	public Long getUserId() {
		return this.userId;
	}

	/**
	 * setter for column 买家昵称
	 */
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	/**
	 * getter for column 买家昵称
	 */
	public String getUserNick() {
		return this.userNick;
	}

	/**
	 * setter for column 礼品类型，本项目等于1，冗余自同exchange_gift表的type
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * getter for column 礼品类型，本项目等于1，冗余自同exchange_gift表的type
	 */
	public Integer getType() {
		return this.type;
	}

	/**
	 * setter for column 卖家userid
	 */
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	/**
	 * getter for column 卖家userid
	 */
	public Long getSellerId() {
		return this.sellerId;
	}

	/**
	 * setter for column 卖家昵称
	 */
	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	/**
	 * getter for column 卖家昵称
	 */
	public String getSellerNick() {
		return this.sellerNick;
	}

	/**
	 * setter for column 0未兑换，8已经兑换，1兑换中，-4 已经删除
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * getter for column 0未兑换，8已经兑换，1兑换中，-4 已经删除
	 */
	public Integer getStatus() {
		return this.status;
	}

	/**
	 * setter for column 兑换的开始时间
	 */
	public void setExchangeStartTime(Date exchangeStartTime) {
		this.exchangeStartTime = exchangeStartTime;
	}

	/**
	 * getter for column 兑换的开始时间
	 */
	public Date getExchangeStartTime() {
		return this.exchangeStartTime;
	}

	/**
	 * setter for column 兑换的结束时间
	 */
	public void setExchangeEndTime(Date exchangeEndTime) {
		this.exchangeEndTime = exchangeEndTime;
	}

	/**
	 * getter for column 兑换的结束时间
	 */
	public Date getExchangeEndTime() {
		return this.exchangeEndTime;
	}

	/**
	 * setter for column 用户兑换时间
	 */
	public void setExchangedTime(Date exchangedTime) {
		this.exchangedTime = exchangedTime;
	}

	/**
	 * getter for column 用户兑换时间
	 */
	public Date getExchangedTime() {
		return this.exchangedTime;
	}

	/**
	 * setter for column 兑换的内容类型（课程，题库等），不一定为商品
	 */
	public void setExchangedContentType(Long exchangedContentType) {
		this.exchangedContentType = exchangedContentType;
	}

	/**
	 * getter for column 兑换的内容类型（课程，题库等），不一定为商品
	 */
	public Long getExchangedContentType() {
		return this.exchangedContentType;
	}

	/**
	 * setter for column 兑换的内容（课程，题库等）主键
	 */
	public void setExchangedContentId(Long exchangedContentId) {
		this.exchangedContentId = exchangedContentId;
	}

	/**
	 * getter for column 兑换的内容（课程，题库等）主键
	 */
	public Long getExchangedContentId() {
		return this.exchangedContentId;
	}

	/**
	 * setter for column 来源,isv入口，类目活动； 具体的信息存储在attribute中
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * getter for column 来源,isv入口，类目活动； 具体的信息存储在attribute中
	 */
	public String getSource() {
		return this.source;
	}

	/**
	 * setter for column 扩展字段
	 */
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	/**
	 * getter for column 扩展字段
	 */
	public String getAttribute() {
		return this.attribute;
	}

	/**
	 * setter for column 更新版本号
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * getter for column 更新版本号
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * setter for column 外键，福袋的id
	 */
	public void setGiftId(Long giftId) {
		this.giftId = giftId;
	}

	/**
	 * getter for column 外键，福袋的id
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

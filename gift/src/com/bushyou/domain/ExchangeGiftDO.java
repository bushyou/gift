package com.bushyou.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 描述：福袋实体表
 * 
 * @author 不舍 Date 2015-04-01
 */
public class ExchangeGiftDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1335218900162505196L;

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
	 * 礼品名称
	 */
	private String name;

	/**
	 * 礼品图片
	 */
	private String pic;

	/**
	 * 礼品类型,本项目等于1，for future use
	 */
	private Integer type = 1;

	/**
	 * 礼品总数-8代表忽略总数
	 */
	private Integer maxCount = -8;

	/**
	 * 可以兑换的商品类型，二进制数值，1 课程 2 题库
	 */
	private Long giftType = 1l;

	/**
	 * 状态 -1 作废 0 正常
	 */
	private Long status = 0l;

	/**
	 * 宝贝id
	 */
	private Long itemId;

	/**
	 * 创建记录的userid
	 */
	private Long createUserId;

	/**
	 * 创建记录的nick
	 */
	private String createUserNick;

	/**
	 * 扩展字段
	 */
	private String attribute;

	/**
	 * type=2限免课程时，代表限免课程的有效领取起始时间
	 */
	private Date startTime;

	/**
	 * type=2限免课程时，代表限免课程的有效领取截至时间
	 */
	private Date endTime;

	/**
	 * 未来使用，超值送 福袋抵扣/优惠价格
	 */
	private Long price;

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
	 * setter for column 礼品名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter for column 礼品名称
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * setter for column 礼品图片
	 */
	public void setPic(String pic) {
		this.pic = pic;
	}

	/**
	 * getter for column 礼品图片
	 */
	public String getPic() {
		return this.pic;
	}

	/**
	 * setter for column 礼品类型,本项目等于1，for future use
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * getter for column 礼品类型,本项目等于1，for future use
	 */
	public Integer getType() {
		return this.type;
	}

	/**
	 * setter for column 礼品总数-8代表忽略总数
	 */
	public void setMaxCount(Integer maxCount) {
		this.maxCount = maxCount;
	}

	/**
	 * getter for column 礼品总数-8代表忽略总数
	 */
	public Integer getMaxCount() {
		return this.maxCount;
	}

	/**
	 * setter for column 可以兑换的商品类型，二进制数值，1 课程 2 题库
	 */
	public void setGiftType(Long giftType) {
		this.giftType = giftType;
	}

	/**
	 * getter for column 可以兑换的商品类型，二进制数值，1 课程 2 题库
	 */
	public Long getGiftType() {
		return this.giftType;
	}

	/**
	 * setter for column 状态 -1 作废 0 正常
	 */
	public void setStatus(Long status) {
		this.status = status;
	}

	/**
	 * getter for column 状态 -1 作废 0 正常
	 */
	public Long getStatus() {
		return this.status;
	}

	/**
	 * setter for column 宝贝id
	 */
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	/**
	 * getter for column 宝贝id
	 */
	public Long getItemId() {
		return this.itemId;
	}

	/**
	 * setter for column 创建记录的userid
	 */
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	/**
	 * getter for column 创建记录的userid
	 */
	public Long getCreateUserId() {
		return this.createUserId;
	}

	/**
	 * setter for column 创建记录的nick
	 */
	public void setCreateUserNick(String createUserNick) {
		this.createUserNick = createUserNick;
	}

	/**
	 * getter for column 创建记录的nick
	 */
	public String getCreateUserNick() {
		return this.createUserNick;
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

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	// @Override
	// public String toString() {
	// return ReflectionToStringBuilder.toString(this);
	// }
	//
	// @Override
	// public Object clone() throws CloneNotSupportedException {
	// try {
	// return BeanUtils.cloneBean(this);
	// } catch (IllegalAccessException e) {
	// e.printStackTrace();
	// } catch (InstantiationException e) {
	// e.printStackTrace();
	// } catch (InvocationTargetException e) {
	// e.printStackTrace();
	// } catch (NoSuchMethodException e) {
	// e.printStackTrace();
	// }
	//
	// return super.clone();
	// }
}
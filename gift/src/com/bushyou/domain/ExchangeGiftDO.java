package com.bushyou.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * ����������ʵ���
 * 
 * @author ���� Date 2015-04-01
 */
public class ExchangeGiftDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1335218900162505196L;

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
	 * ��Ʒ����
	 */
	private String name;

	/**
	 * ��ƷͼƬ
	 */
	private String pic;

	/**
	 * ��Ʒ����,����Ŀ����1��for future use
	 */
	private Integer type = 1;

	/**
	 * ��Ʒ����-8�����������
	 */
	private Integer maxCount = -8;

	/**
	 * ���Զһ�����Ʒ���ͣ���������ֵ��1 �γ� 2 ���
	 */
	private Long giftType = 1l;

	/**
	 * ״̬ -1 ���� 0 ����
	 */
	private Long status = 0l;

	/**
	 * ����id
	 */
	private Long itemId;

	/**
	 * ������¼��userid
	 */
	private Long createUserId;

	/**
	 * ������¼��nick
	 */
	private String createUserNick;

	/**
	 * ��չ�ֶ�
	 */
	private String attribute;

	/**
	 * type=2����γ�ʱ����������γ̵���Ч��ȡ��ʼʱ��
	 */
	private Date startTime;

	/**
	 * type=2����γ�ʱ����������γ̵���Ч��ȡ����ʱ��
	 */
	private Date endTime;

	/**
	 * δ��ʹ�ã���ֵ�� �����ֿ�/�Żݼ۸�
	 */
	private Long price;

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
	 * setter for column ��Ʒ����
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter for column ��Ʒ����
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * setter for column ��ƷͼƬ
	 */
	public void setPic(String pic) {
		this.pic = pic;
	}

	/**
	 * getter for column ��ƷͼƬ
	 */
	public String getPic() {
		return this.pic;
	}

	/**
	 * setter for column ��Ʒ����,����Ŀ����1��for future use
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * getter for column ��Ʒ����,����Ŀ����1��for future use
	 */
	public Integer getType() {
		return this.type;
	}

	/**
	 * setter for column ��Ʒ����-8�����������
	 */
	public void setMaxCount(Integer maxCount) {
		this.maxCount = maxCount;
	}

	/**
	 * getter for column ��Ʒ����-8�����������
	 */
	public Integer getMaxCount() {
		return this.maxCount;
	}

	/**
	 * setter for column ���Զһ�����Ʒ���ͣ���������ֵ��1 �γ� 2 ���
	 */
	public void setGiftType(Long giftType) {
		this.giftType = giftType;
	}

	/**
	 * getter for column ���Զһ�����Ʒ���ͣ���������ֵ��1 �γ� 2 ���
	 */
	public Long getGiftType() {
		return this.giftType;
	}

	/**
	 * setter for column ״̬ -1 ���� 0 ����
	 */
	public void setStatus(Long status) {
		this.status = status;
	}

	/**
	 * getter for column ״̬ -1 ���� 0 ����
	 */
	public Long getStatus() {
		return this.status;
	}

	/**
	 * setter for column ����id
	 */
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	/**
	 * getter for column ����id
	 */
	public Long getItemId() {
		return this.itemId;
	}

	/**
	 * setter for column ������¼��userid
	 */
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	/**
	 * getter for column ������¼��userid
	 */
	public Long getCreateUserId() {
		return this.createUserId;
	}

	/**
	 * setter for column ������¼��nick
	 */
	public void setCreateUserNick(String createUserNick) {
		this.createUserNick = createUserNick;
	}

	/**
	 * getter for column ������¼��nick
	 */
	public String getCreateUserNick() {
		return this.createUserNick;
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
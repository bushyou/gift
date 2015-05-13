/**
 * ���ʵ���ѯ����
 */
package com.bushyou.domain;

import java.io.Serializable;

public class ExchangeGiftQuery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5812997010195972227L;

	/**
	 * ��������id
	 */
	private Long id;

	/**
	 * ״̬ -1 ���� 0 ����
	 */
	private Integer status;

	/**
	 * ����
	 */
	private Integer type = 1;

	// ҳ�� ҳ�Ŵ�0��ʼ,Ĭ��Ϊ0
	private Integer pageNum;

	// ҳ��С pageSizeĬ��Ϊ1
	private Integer pageSize;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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
			pageSize = 1;
		if (pageNum < 0)
			pageNum = 0;
		if (pageSize <= 0)
			pageSize = 1;

		return pageNum * pageSize;
	}

	/**
	 * ���limit������
	 * 
	 * @return
	 */
	public Integer getEndRow() {

		if (pageSize == null)
			pageSize = 1;
		if (pageSize <= 0)
			pageSize = 1;

		return pageSize;
	}

}

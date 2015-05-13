/**
 * 礼包实体查询对象
 */
package com.bushyou.domain;

import java.io.Serializable;

public class ExchangeGiftQuery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5812997010195972227L;

	/**
	 * 福袋主键id
	 */
	private Long id;

	/**
	 * 状态 -1 作废 0 正常
	 */
	private Integer status;

	/**
	 * 类型
	 */
	private Integer type = 1;

	// 页号 页号从0开始,默认为0
	private Integer pageNum;

	// 页大小 pageSize默认为1
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
	 * 获得limit开始号
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
	 * 获得limit结束号
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

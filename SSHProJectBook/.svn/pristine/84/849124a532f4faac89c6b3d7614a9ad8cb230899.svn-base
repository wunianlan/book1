package com.hc.action;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.hc.bean.Lend;
import com.hc.service.LendService;
import com.hc.utils.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LendAction extends ActionSupport implements ModelDriven<Lend> {

	private Lend lend = new Lend();

	@Override
	public Lend getModel() {
		return lend;
	}

	private LendService lendService;

	public void setLendService(LendService lendService) {
		this.lendService = lendService;
	}

	public String initAddUI() {
		return "initAddUI";
	}

	// 保存
	public String save() {
		lendService.save(lend);
		return "initAddUI";
	}

	/**
	 * 分页查询
	 */
	private Integer pageCode = 1;// 当前页
	private Integer pageSize = 2;// 每页显示的数量

	public void setPageCode(Integer pageCode) {
		if (pageCode == null || pageCode < 1) {
			pageCode = 1;
		}
		this.pageCode = pageCode;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String findByPage() {
		// 创建离线条件查询对象
		DetachedCriteria criteria = DetachedCriteria.forClass(Lend.class);
		try {
			// 1、用学号查询
			Integer id = lend.getReader().getSid();
			if (id != null) {
				criteria.add(Restrictions.eq("reader.sid", id));
			}
		} catch (Exception e) {
		}
		PageBean<Lend> page = lendService.findByPage(pageCode, pageSize, criteria);
		// 压栈
		ActionContext.getContext().getValueStack().set("page", page);
		return "findByPage";
	}
	/**
	 * 修改之前查询 用id查询 返回一个对象
	 */
	public String initUpdate() {
		Integer lid = lend.getLid();
		if (lid == null) {
			return "login";
		}
		lend = lendService.findById(lid);
		return "initUpdate";
	}
	/**
	 * 修改
	 */
	public String update() {
		lendService.update(lend);
		return "update";
	}

}

package com.hc.service;

import org.hibernate.criterion.DetachedCriteria;

import com.hc.bean.Lend;
import com.hc.utils.PageBean;

public interface LendService {

	/**
	 * 添加(保存)借阅记录
	 * @param book
	 */
	void save(Lend lend);
	/**
	 * 分页查询
	 * @param pageCode
	 * @param pageSize
	 * @param criteria
	 * @return
	 */
	PageBean<Lend> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria);
	/**
	 * 学生模块分页查询
	 * @param pageCode
	 * @param pageSize
	 * @param criteria
	 * @return
	 */
	PageBean<Lend> findByPages(Integer pageCode, Integer pageSize, DetachedCriteria criteria);
	/**
	 * 修改前根据id查询
	 * @param book
	 * @return
	 */
	Lend findById(Integer lid);
	/**
	 * 修改
	 * @param book
	 */
	void update(Lend lend);
	/**
	 * 删除
	 * @param book
	 */
	void delete(Lend lend);
	

}

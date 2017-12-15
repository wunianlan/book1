package com.hc.service;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;

import com.hc.bean.Lend;
import com.hc.dao.LendDao;
import com.hc.utils.PageBean;

@Transactional
public class LendServiceImpl implements LendService{

	private LendDao lendDao;

	public void setLendDao(LendDao lendDao) {
		this.lendDao = lendDao;
	}
	/**
	 * 添加(保存)图书
	 */
	@Override
	public void save(Lend lend) {
		lendDao.save(lend);
	}
	/**
	 * 分页查询
	 */
	@Override
	public PageBean<Lend> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria) {
		return lendDao.findByPage(pageCode, pageSize, criteria);
	}
	/**
	 * 学生模块分页查询
	 */
	@Override
	public PageBean<Lend> findByPages(Integer pageCode, Integer pageSize, DetachedCriteria criteria) {
		return lendDao.findByPage(pageCode, pageSize, criteria);
	}
	/**
	 * 修改前根据id查询
	 */
	@Override
	public Lend findById(Integer lid) {
		return lendDao.findById(lid);
	}
	/**
	 * 修改
	 */
	@Override
	public void update(Lend lend) {
		lendDao.update(lend);
	}
	/**
	 * 删除
	 */
	@Override
	public void delete(Lend lend) {
		lendDao.delete(lend);
	}
	

}

package com.hc.bean;

public class Lend {

	/* `lid` int(20) NOT NULL AUTO_INCREMENT COMMENT '记录编号',
	  `sid` int(20) DEFAULT NULL COMMENT '学号',
	  `bid` int(20) DEFAULT NULL COMMENT '书号',
	  `lend_time` varchar(20) DEFAULT NULL COMMENT '借书时间',
	  `return_time` varchar(20) DEFAULT NULL COMMENT '还书时间',*/
	
	private Integer lid;	//主键
	private String lend_time;
	private String return_time;
	
	private Reader reader;
	private Book book;
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public String getLend_time() {
		return lend_time;
	}
	public void setLend_time(String lend_time) {
		this.lend_time = lend_time;
	}
	public String getReturn_time() {
		return return_time;
	}
	public void setReturn_time(String return_time) {
		this.return_time = return_time;
	}
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Lend [lid=" + lid + ", lend_time=" + lend_time + ", return_time=" + return_time + ", reader=" + reader
				+ ", book=" + book + "]";
	}
	
}

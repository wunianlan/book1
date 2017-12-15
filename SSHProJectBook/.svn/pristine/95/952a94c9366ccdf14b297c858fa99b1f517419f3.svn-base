package com.hc.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.hc.bean.User;
import com.hc.service.UserService;
import com.hc.utils.MDUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	private User user = new User();
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	/**
	 * 属性驱动验证码
	 */
	private String viCode;
	
	public void setViCode(String viCode) {
		this.viCode = viCode;
	}

	public String login(){
		String user_code = user.getUser_code();
		String user_password = user.getUser_password();
		HttpSession session = ServletActionContext.getRequest().getSession();
		String vcode = (String) session.getAttribute("validateCode");
		if (user_code.trim().isEmpty() || user_code == null || user_password.trim().isEmpty() || user_password == null
				|| !vcode.equalsIgnoreCase(viCode)) {
			return "login";
		}
		User u = userService.login(user);
		// 如果用户不存在就回到登入页面
		if (u == null) {
			return "login";
		}
		session.setAttribute("existUser", u);
		return "index";
	}
	/**
	 * 安全退出
	 */
	public String exit() {
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.removeAttribute("existUser");
		return "login";
	}
	/**
	 * 修改密码：修改之前先查询
	 */
	public String updatePassword() {
		Integer user_id = user.getUser_id();
		// 用id查询用户
		user = userService.findById(user_id);
		return "updatePassword";
	}

	/**
	 * ajax判断输入的密码属否正确
	 * 
	 * @throws Exception
	 */
	public String checkPassword() throws Exception {
		User u = userService.login(user);
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter pw = response.getWriter();
		if (u != null) {
			pw.println(1);
		} else {
			pw.println(0);
		}
		return NONE;
	}

	// 把输入的新密码属性驱动
	private String u_password;

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	/**
	 * 修改密码之前先查询一个对象，把查询出来的对象在放到update方法里面
	 * 
	 * @return
	 */
	public String password() {
		User u = userService.login(user);
		String md5 = MDUtils.md5(u_password);
		u.setUser_password(md5);
		userService.updatePassword(u);
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.removeAttribute("existUser");
		return "login";
	}
}

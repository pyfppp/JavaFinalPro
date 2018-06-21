package CompanyManage;


/**
 * @Copyright (C),2018,信息科学与工程学院软件工程系一班
 * @Author 裴逸凡
 * @Date 2018-6-21 上午 11:43
 * @Description Company类模型层
 * 			
 */

public class Company {
	
	private String company_name;
	private String mailbox;
	private String contact;
	private String phone;
	private String address;
	private String profile;
	private String audit_date;
	
	
	public Company() {
		
	}


	public String getCompany_name() {
		return company_name;
	}


	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}


	public String getMailbox() {
		return mailbox;
	}


	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getProfile() {
		return profile;
	}


	public void setProfile(String profile) {
		this.profile = profile;
	}


	public String getAudit_date() {
		return audit_date;
	}


	public void setAudit_date(String audit_date) {
		this.audit_date = audit_date;
	}
	
	
	
}

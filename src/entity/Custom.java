package entity;

//javabean -> 属性私有化,get/set方法公有化,无餐构造
import java.math.BigDecimal;
import java.sql.Timestamp;
//和数据库的表名一致,首字母大写
public class Custom {
	//和数据库的列名和列类型一一匹配的
	private BigDecimal id;
	private String name;
	private String password;
	private Timestamp birthday;
	private String address;
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Timestamp getBirthday() {
		return birthday;
	}
	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Custom() {
		super();
	}
	public Custom(BigDecimal id, String name, String password, Timestamp birthday, String address) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.birthday = birthday;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Custom [id=" + id + ", name=" + name + ", password=" + password + ", birthday=" + birthday
				+ ", address=" + address + "]";
	}
	
	
}

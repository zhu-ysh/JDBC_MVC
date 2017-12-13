package entity;

//javabean -> ����˽�л�,get/set�������л�,�޲͹���
import java.math.BigDecimal;
import java.sql.Timestamp;
//�����ݿ�ı���һ��,����ĸ��д
public class Custom {
	//�����ݿ��������������һһƥ���
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

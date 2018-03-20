package simpleXmlTest.simpleBean;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root
public class Student {
	//Ĭ���ֶ�����Ϊ��ǩ���� ����ͨ��name��������
	@Element
	public String sid;
	@Element
	public String sname;
	@Element
	public int sage;
	@Element
	public Address addr;
	@ElementList(required = false)
	public List<Student> friend;
	
	@Element
	public Hobby hobby;

	@Element // ֻ������get/set����,ʹ�÷������úͻ�ȡ����ֵ
	//��ǩ������Ϊget{С} {С} get{��} {С} get{���} {���} get{��С} {СС} get{СС} {СС}
	// ֻע��get����
	// Default constructor can not accept read only
	// @org.simpleframework.xml.Element(name=, type=void, data=false, required=true)
	// on method 'hh' in class simpleXmlTest.simpleBean.Student
	public String getH() {
		return "haha";
	}

	 @Element
	// ֻע��set����
	// No matching get method for public void
	// simpleXmlTest.simpleBean.Student.setHh(java.lang.String) in class
	// simpleXmlTest.simpleBean.Student
	public void setH(String xx) {
		System.out.println("xx=" + xx);
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddr=" + addr + ", friend=" + friend
				+ "]";
	}

}

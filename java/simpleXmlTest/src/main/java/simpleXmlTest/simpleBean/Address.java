package simpleXmlTest.simpleBean;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Transient;

@Root //ʹ��@Rootע��,û��ʹ��ע������Ա�����
public class Address {
	//ʹ����@Rootע�⵫û���ֶ�ʱ����Ϊ<saddr/>
	
	//��û����@Rootע��������û�п���ʹ�õ�����ʱ����
	//Transform of class simpleXmlTest.simpleBean.Address not supported
	
	//private������Ҳ����ͨ�������ȡ

	@Transient // ʹ�����ע��Ĭ�Ϻ��Ա��ֶ� ���������û������δ�����ֶ��򱨴� Transform of class
				// simpleXmlTest.simpleBean.Address not supported
	public final String guoji = "�й�";

	//final���������staticҲ������,��д������,��Ҫ����
	// Default constructor can not accept read only
	// @org.simpleframework.xml.Element(name=, type=void, data=false,
	// required=false) on field 'testfinal' public final java.lang.String
	// simpleXmlTest.simpleBean.Address.testfinal in class
	// simpleXmlTest.simpleBean.Address
	@Transient
	public final String testFinal = "testFinal";
	//static Ĭ��ֱ�Ӻ��� ��@Elementע���д���ļ� ��final��ȡʱ���ı�ԭֵҲ������
	//@Element
	public static String testStaticFinal = "testStaticFinal";
	@Element
	public String shengfen = "����";
	@Element
	public String diqu = "�ϲ�";
	
	//����Ҫ���޲͹��췽��
	//����ͨ������ֱ������
	public Address() {
	}

	public Address(String shengfen, String diqu) {
		super();
		this.shengfen = shengfen;
		this.diqu = diqu;
	}

	@Override
	public String toString() {
		return "Address [guoji=" + guoji + ", testFinal=" + testFinal + ", shengfen=" + shengfen + ", diqu=" + diqu
				+ "]";
	}

	
	

}

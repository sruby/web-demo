package io.github.sruby.junit.basetools;

import junit.framework.TestCase;

/**
 * �������Թ���
 * @author liuwf on 2016��4��1�� ����3:33:12
 */
public class JavaTest extends TestCase
{
	protected int value1,value2;
	
	/**
	 * ����ǰ����
	 */
	protected void setUp()
	{
		System.out.println("���Կ�ʼ");
		value1 = 10;
		value2 = 1;
	}
	
	/**
	 * �̳�TestCase�ķ�ʽ,���Է�����Ҫ��test��ͷ.
	 * ע�ⲻ��Ҫ
	 * @author liuwf on 2016��4��5�� ����5:23:24
	 */
	public void test()
	{
		System.out.println(value1 + value2);
	}
	
	protected void tearDown()
	{
		System.out.println("���Խ���");
	}
}

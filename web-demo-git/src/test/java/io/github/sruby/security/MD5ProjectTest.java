package io.github.sruby.security;

import junit.framework.TestCase;

/**
 * md5���ܲ���
 * @author liuwf on 2016��4��5�� ����5:25:42
 */
public class MD5ProjectTest extends TestCase
{
	public void testDecode()
	{
		byte[] decode = MD5Project.decode("MTIzNDU2Nzg5MA==");
		System.out.println(new String(decode));
	}
}

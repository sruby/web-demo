package io.github.sruby.util;

import java.util.List;

/**
 * des: ���Ϲ�����
 * @author: liuwf on 2016��3��22�� ����10:26:37
 */
public class CollectionUtil
{
	/**
	 * des:�ж�list�Ƿ�Ϊ��
	 * @author: liuwf on 2016��3��22�� ����10:26:50
	 * @param list
	 * @return
	 */
	public static boolean isBlankList(List list)
	{
		if(list !=null && !list.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}

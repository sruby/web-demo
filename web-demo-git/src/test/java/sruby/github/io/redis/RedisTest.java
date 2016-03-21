package sruby.github.io.redis;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.thinkive.redis.client.JedisClient;

/**
 * ����: redis��demo 
 * ����: ���ķ�  
 * ��������: 2016��3��21�� 
 * ����ʱ��: ����7:51:25
 */
public class RedisTest
{
	private JedisClient client = new JedisClient();
	Logger logger = Logger.getLogger(RedisTest.class);
	
	/**
	 * ���������Ա���ʧЧʱ��
	 * ���ߣ����ķ�
	 * ʱ�䣺2016��3��21�� ����8:00:19
	 * @throws InterruptedException 
	 */
	@Test
	public void testExpire() throws InterruptedException
	{
		client.set("key", "value",5);
		String value = client.getString("key");
		logger.info("value:"+value);
		
		Thread.sleep(5*1000);
		
		value = client.getString("key");
		logger.info("˯��5����ֵvalue:"+value);
	}
	
	/**
	 * ���������Ա���list
	 * ���ߣ����ķ�
	 * ʱ�䣺2016��3��21�� ����8:16:59
	 */
	@Test
	public void testSetList()
	{
		Map<String,String> map = new HashMap<String, String>();
		map.put("key", "value");
		
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		list.add(map);
		
		client.set("keyList", list);
		
		List<Map<String, String>> listValue = client.getList("keyList");
		logger.info("list:"+listValue.toString());
		
		String listStr = client.getString("keyList");
		logger.info("listStr:"+listStr);
		
		List<Map<String, String>> listValue2 = client.getList("keyList2");
		
		assert listValue2 == null:"listValue2 is null";
		assert listValue2.isEmpty():"listValue2 is empty";
	}
}

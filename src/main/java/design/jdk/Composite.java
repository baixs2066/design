package design.jdk;

import java.util.HashMap;
import java.util.Map;

public class Composite {
	//���ģʽ�� jdk �е�Ӧ�þ���  HashMap
	
	public static void main(String[] args) {
		
		
		//˵��
		//1. Map ����һ������Ĺ���  ���������ǵ� Component
		//2.HashMap ��һ���м�Ĺ���  Composite ʵ�֣��̳�����ط���
		//3.Node ��HashMap �ľ�̬�ڲ��࣬���� Leaf Ҷ�ӽڵ㣬����û��put ����
		//static class Node<K,V> implements Map.Entry<K,V>
		
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(0, "���μ�");
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "���μ�");
		map.put(2, "��¥��");
		hashMap.putAll(map);
		System.out.println(hashMap);
		
	}

}

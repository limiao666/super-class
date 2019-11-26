package test.surface_project.example.map_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MapMain {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap();
		map.put("Li Xiaohong", 0);
		map.put("lily", 4);
		map.put("hyj", 5);
		map.put("jim", 3);
		map.put("limiao",3);
		
		String key = "Li Xiaohong";
		Integer value = null;
		if (map.containsKey(key))
		{
			value = map.get(key);
			System.out.println("Use key:" + key + " find value:" + value);
		}
		else
		{
			System.out.println("Does not contain key:" + key);
		}
		
		key = "limiao";
		if (map.containsKey(key))
		{
			value = map.get(key);
			System.out.println("Use key:" + key + " find value:" + value);
		}
		else
		{
			System.out.println("Does not contain key:" + key);
			value = map.get(key);
			System.out.println("Use key:" + key + " find value:" + value + " If map does not contain key, it will return null, be carefull.");
		}
		key = "Tom";
	    if(map.containsKey(key)){
	    	value=map.get(key);
			System.out.println("Use key:" + key + " find value:" + value);
		}else{
			System.out.println("Does not contain key:" + key);
//			value = map.get(key);
//			System.out.println("Use key:" + key + " find value:" + value + " If map does not contain key, it will return null,be carefull.");
		}
		
		// ?????????°¿???????????????ßª?????????°¿?????????Ì‡???????????????????????ßª????????????????????????iterator???????°¿?index??
		// Map.Entry????map??????????????????key-value??
		// Iterator.next()????????????????????map??????????????
        // Entry.getKey()??????????????key-value???ß›??key
        // Entry.getValue()????????key-value???ß›??value
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()){
			Map.Entry entry = (Map.Entry) it.next();
			key=(String) entry.getKey();
			value=(Integer) entry.getValue();
			System.out.println("Use iterator to get the first entry is Key :"+key+"  Value :"+value);

		}


        // ????????????map??????????????
//		entry = (Map.Entry) it.next();
//        key=(String) entry.getKey();
//        value=(Integer) entry.getValue();
//        System.out.println("Use iterator to get the second entry is Key :"+key+"  Value :"+value);
//
	}

}

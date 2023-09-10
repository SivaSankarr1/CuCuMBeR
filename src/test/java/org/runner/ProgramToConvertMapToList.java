package org.runner;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class ProgramToConvertMapToList {
	//ProgramToConvertMapToList
public static void main(String[] args) {
LinkedHashMap<String,String> map= new LinkedHashMap<String,String>();
map.put("username", "Siva");
map.put("Password", "Siva123");

LinkedHashMap<String,String> map1= new LinkedHashMap<String,String>();
map1.put("username", "Sankar");
map1.put("Password", "Sankar123");
List<LinkedHashMap<String,String>> li= new LinkedList<LinkedHashMap<String,String>>();
li.add(map);
li.add(map1);

String username = li.get(0).get("username");
System.out.println(username);
String pass = li.get(0).get("Password");
System.out.println(pass);
}
}

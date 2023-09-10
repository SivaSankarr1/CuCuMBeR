package org.runner;

import java.util.LinkedList;
import java.util.List;

public class ListProgramPractice {
public static void main(String[] args) {
LinkedList<String> li =new LinkedList<String>();
li.add("username");
li.add("Password");
li.add("city");
LinkedList<String> li1= new LinkedList<String>();
li1.add("username1");
li1.add("password1");
li1.add("city1");
LinkedList<String> li2= new LinkedList<String>();
li2.add("username2");
li2.add("password2");
li2.add("city2");
List<LinkedList<String>> Listall= new LinkedList();
Listall.add(li);
Listall.add(li1);
Listall.add(li2);
String username = Listall.get(2).get(0);
System.out.println(username);
String pass = Listall.get(2).get(2);
System.out.println(pass);
String city = Listall.get(2).get(2);
System.out.println(city);

}
}

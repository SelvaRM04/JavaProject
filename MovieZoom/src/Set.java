/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Selva
 */

import java.net.*;
public class Set {
    
    public static void main(String args[]) throws UnknownHostException
    {
        /*ArrayList<String> a1 = new ArrayList<>();
        a1.add("George");
        a1.add("Jim");
        a1.add("Blake");
        a1.add("John");
        a1.add("Kevin");
        a1.add("Michael");
        
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("George");
        a2.add("Kale");
        a2.add("Kevin");
        a2.add("Michelle");
        a2.add("Ryan");
        a2.add("");
        
        ArrayList<String> u = new ArrayList<>();
        u.addAll(a1);
        
        for(int j=0;j<a2.size();j++)
        {
            int f=0;
            String r = a2.get(j);
            for(int i=0;i<u.size();i++)
            {
                if(r.equals(u.get(i)))
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
                u.add(r);
        }
        
        ArrayList<String> in = new ArrayList<>();
        
        for(int j=0;j<a2.size();j++)
        {
            String r = a2.get(j);
            for(int i=0;i<a1.size();i++)
            {
                if(r.equals(u.get(i)) && in.contains(r)==false)
                {
                    in.add(r);
                    break;
                }
            }
        }
        
        ArrayList<String> d = new ArrayList<>();
        d.addAll(a1);
        
        for(int j=0;j<a2.size();j++)
        {
            String r = a2.get(j);
            if(d.contains(r)) d.remove(r);
        }
        
        System.out.println("Union : ");
        for(String s : u)
            System.out.print(s + " ");
        
        String s1 = "Hello";
        String s2=s1;
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        
        System.out.println("Intersection : ");
        for(String s : in)
            System.out.print(s + " ");
        System.out.println();
        
        System.out.println("Difference : ");
        for(String s : d)
            System.out.print(s + " ");
        
        
     */
        InetAddress ip = InetAddress.getByName("www.geeksforgeeks.org");
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());
    }
}

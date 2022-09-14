package baobao.Demo2;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {

        //List:有序，可重复，有索引
        //ArrayList LinkedList ：有序，重复，有索引
        //Set：无序，不重复，无索引
        //HashSet：无序，不重复，无索引。linkedList:有序，不重复，无索引
        //TreeSet：默认升序排列，不重复，无索引。

        Collection a1 = new ArrayList();
        a1.add("Java");
        a1.add(23);
        a1.add("萨");
        System.out.println(a1);

        System.out.println("============================================");

        Collection h1 = new HashSet();
        h1.add("Java");
        h1.add(23);
        h1.add("撒");
        System.out.println(h1);

        System.out.println("============================================");

        Collection<String> a2 = new ArrayList<>();
        a2.add("23");
        //a2.add(23);
        a2.add("Java");
        a2.add("黑马程序员");
        System.out.println(a2);

        System.out.println("============================================");


    }
}

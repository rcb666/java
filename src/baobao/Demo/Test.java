package baobao.Demo;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        int[] ages = {12,6,26,43,18};
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        Integer[] ages1 = {12,6,26,32,43,18};
        Arrays.sort(ages1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //自己制定比较规则
                //if(o1>o2)
                //{
                //    return -1;
                //}else if (o1<o2){
                //    return 1;
                //}
                return -(o1 - o2);//
                //return o1 - o2;//默认升序排列
            }
        });
        System.out.println(Arrays.toString(ages1));
        System.out.println("========================");

        Student[] stus = new Student[3];
        stus[0] = new Student("吴磊",23,180);
        stus[1] = new Student("胡歌",31,180);
        stus[2] = new Student("古薰儿",18,180);
        System.out.println(Arrays.toString(stus));


        //Arrays.sort(stus);
        Arrays.sort(stus, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //自己制定比较规则
                return o1.getAge() - o2.getAge();
                //return Double.compare(o1.getHeight(), o2.getHeight());//浮点型可以这样写
            }
        });
        System.out.println(Arrays.toString(stus));

    }
}

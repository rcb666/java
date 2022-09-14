package baobao.Demo1;

public class Test2 {
    public static void main(String[] args) {
        int [] arrs = {10,14,16,25,28,30,35,88,100};

        System.out.println(binarySearch(arrs, 8));
    }

    /**
     * 二分查找算法的实现
     * @param arrs 排序的数组
     * @param data 要找的数据
     * @return 索引  元素不存在  直接返回-1
     */
    public static int binarySearch(int[] arrs,int data) {
        //1、定义左右位置
        int left = 0;
        int right = arrs.length - 1;
        //2、开始循环
        while (left <= right)
        {
            //取中间索引
            int middleIndex = (left + right) / 2;
            //3、判断当前中间位置的元素和要找的元素的大小
            if (data > arrs[middleIndex]){
                //往右边找，左位置更新为中间索引+1
                left = middleIndex + 1;
            }else if(data < arrs[middleIndex])
            {
                //往左边找，右边位置更新为中间位置-1
                right = middleIndex - 1;
            }else
            {
                return middleIndex;
            }
        }
        return -1;
    }
}

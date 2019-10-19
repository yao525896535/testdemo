public class Demo {
    public static void main(String[] args) {
        int [] arr ={10,13,9,4,5,2};
        findMax(arr,1 );
    }
    public static void findMax(int[] arr, int n) {
        for (int i = 0; i < arr.length - 1; i++) {      //对数组进行排序
            for (int j = 0; j < arr.length - 1 - i; j++) {  //降序排序
                int tmp;
                if (arr[j] < arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {          //遍历数组
            int a = arr[k];
            System.out.println(a);
        }
        System.out.println("第"+n+"大的数是:"+ arr[n-1]);
    }
}

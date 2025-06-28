public class video10 {
    public static void main(String[] args) {
        int nums[][] = new int[4][];  // jagged array
        nums[0] = new int[4];
        nums[1] = new int[3];
        nums[2] = new int[6];
        nums[3] = new int[6];
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums[i].length - 1; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }
        for(int i=0; i<= nums.length - 1; i++) {
            for(int j=0; j<= nums[i].length - 1; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package Arrays;


public class TrappingWaterOptimized {

    public static int trappedWater(int height[]){

        int left=0, right=height.length-1;
        int leftMax=0, rightMax=0;
        int trappedWater=0;

        while(left <= right){

            if(height[left] < height[right]){

                if(height[left] > leftMax){
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {

                if(height[right] > rightMax){
                    rightMax = height[right];
                } else{
                    trappedWater += rightMax - height[right];
                }
                right--;
            }

        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {3, 0, 2, 0, 4};
        System.out.println(trappedWater(height));
    }
}
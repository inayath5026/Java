package Arrays;

public class TrappingWater {

    public static int trapWater(int height[]){

        int size = height.length;
        //Auxiliary Arrays to store Max. Left & Right Boundaries
        int leftMaxBound[] = new int[size];
        int rightMaxBound[] = new int[size];
        int trappedWater = 0;

        leftMaxBound[0] = height[0];

        for(int i=1;i<size;i++){
            leftMaxBound[i] = Math.max(height[i], leftMaxBound[i-1]);
        }

        rightMaxBound[size-1] = height[size-1];
        for(int i=size-2;i>=0;i--){
            rightMaxBound[i] = Math.max(height[i], rightMaxBound[i+1]);
        }

        for(int i=0;i<size;i++){

            int waterLevel = Math.min(leftMaxBound[i],rightMaxBound[i]);
            trappedWater += waterLevel - height[i];

        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = { 4,2,0,3,2,5 };
        System.out.println(trapWater(height));
    }
}

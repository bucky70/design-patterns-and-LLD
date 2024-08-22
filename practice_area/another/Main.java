package practice_area.another;

public class Main {
    public static void main(String args[]){
        int[] nums={0,0,1,1,1,1,2,2,3,3};
        int index = 1;
        int occurance = 1;

        for(int i=1; i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                occurance++;
            }else{
                occurance = 1;
            }

            if (occurance <= 2){
                nums[index] = nums[i];
                index++;
            }
        }  
        for(int i=0;i<index;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println(index);
    
    }
}

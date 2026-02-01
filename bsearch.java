public class bsearch {
    public static int binarySearch(int[] nums, int value){
        int l=0, r=nums.length;
        
        while(l<=r){
            int mid = l+(r-l)/2;
            // System.out.println(mid);
            if(nums[mid]==value) return mid;
            else if(nums[mid]>value){
                r = mid-1;
            } else {
                l = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        for(int num: nums){
            System.out.print(num);
        }
        System.out.println("");

        int value = 9;
        int search = binarySearch(nums, value);
        if(search!=-1){
            System.out.println("Value "+value+" is found at position: "+search);
        } else {
            System.out.println("Value "+value+" not found!");
        }
    }
    
}

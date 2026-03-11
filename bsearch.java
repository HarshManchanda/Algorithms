public class bsearch {
    public static int binarySearch(int[] nums, int value){
        int l=0, r=nums.length-1;
        
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

    public static int binarySearchRecursive(int[] nums, int left, int right, int value){
        if (nums == null || nums.length == 0 || left > right) return -1;
        int mid = left + (right-left)/2;
        if(nums[mid]==value) return mid;
        else if(nums[mid]>value){
            return binarySearchRecursive(nums, left, mid-1, value);
        } else {
            return binarySearchRecursive(nums, mid+1, right, value);
        }
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        for(int num: nums){
            System.out.print(num);
        }
        System.out.println("");

        int value = 5;
        System.out.println("Binary Search Result for non recursive method: ");
        int search = binarySearch(nums, value);
        if(search!=-1){
            System.out.println("Value "+value+" is found at position: "+search);
        } else {
            System.out.println("Value "+value+" not found!");
        }

        System.out.println("Binary Search Result for recursive method: ");
        int recSearch = binarySearchRecursive(nums, 0, nums.length-1, value);
        if(recSearch!=-1){
            System.out.println("Value "+value+" is found at position: "+recSearch);
        } else  {
            System.out.println("Value "+value+" not found!");
        }
    }
    
}

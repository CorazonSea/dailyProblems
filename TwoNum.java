public int[] twoSum0(int[] nums, int target) {
        int[] s = new int[2];
        for(int i=0;i<nums.length;i++){
             for(int j=i;j<nums.length;j++){
                if (nums[i] + nums[j] == target){
                    s[0]=i;
                    s[1]=j;
                    break;
                }
            }
        }
        return s;
    }

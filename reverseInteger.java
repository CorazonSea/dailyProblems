class Solution {
    public int reverse(int x) {
        String str = x + "";
        StringBuilder target = new StringBuilder(); 
		
		for(int i= str.length()-1; i>=0; i--) {
			if (str.charAt(i) == '-') {
				target.insert(0, '-');
			}else {
				target.append(str.charAt(i));
				if (Long.valueOf(target.toString()) <= 0) {
					target.deleteCharAt(0);
				}
			}
		}
        if (target.toString().equals("")){
           target.append("0");
        }
        long s = Long.valueOf(target.toString());
		if (s>Integer.MAX_VALUE || s<Integer.MIN_VALUE) {
			return 0;
		}
        return (int)s;
    }
}

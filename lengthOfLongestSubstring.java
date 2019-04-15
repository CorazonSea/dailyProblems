 public int lengthOfLongestSubstring(String s) {
		
		if (s.length() == 1){
			 return 1;
		}
        String str = "";
        int j = 0;
        for(int i=1;i<s.length();i++){        	
            String target = s.substring(j,i);           
            int index = target.indexOf(s.substring(i,i+1));
            if (index >= 0) {            	
            	j = index + j + 1;
            	if (str.length() < target.length()){
            		str= target;
            	}
            }else if (i == s.length()-1 && str.length() < s.substring(j,i+1).length()){
            	
            	str = s.substring(j,i+1);
            }
            
        } 
        
		return str.length();
	}

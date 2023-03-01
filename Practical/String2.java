class String2
    {
            public static void main(String args[])
        {     
            String name = "Anushka";
            int value = name.length();
            String s1 = name.toLowerCase();
            String nonTrimString = "   anu    ";
            String nonTrimString2String = nonTrimString.trim();
            String s2 = name.toUpperCase();
            String  anu = name.substring(0);
            String ch = name.replace('A', 'T');
            System.out.println(value);   // to find the value of String variable.Lenght().
            System.out.println(s2);
            System.out.println(anu); // original String will never change
            System.out.println(nonTrimString2String);
            System.out.println(name.substring(1,4));
            System.out.println(ch);
            System.out.println(name.replace("Anushka",  "Tnus")); // target with replacement 
            System.out.println(name.startsWith("dnu"));  
            System.out.println(name.endsWith("a"));
            System.out.println(name.charAt(6));   
            System.out.println(name.indexOf("k")); 
            System.out.println(name.indexOf( "hka", 4));
            System.out.println(name.lastIndexOf("hka"));
            System.out.println(name.equals("Anushka"));
            System.out.println(name.equalsIgnoreCase("anushka"));
            System.out.println("iam  escape  Sequence \n double quote");

    }    }    
        

        
    
   
         
    
       

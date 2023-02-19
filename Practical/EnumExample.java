class EnumExample {
    //To declare inside the class
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

        Day() {
            System.out.println("I am a private constructor of enum");
        }

    }

    public static void main(String args[]) {
        //For declaring outside class
        Day d = Day.THURSDAY;//Classname.constant
        System.out.println(d);
        System.out.println("Value of tuesday is" + Day.valueOf("TUESDAY"));//to display values
        System.out.println("Index of tuesday is" + Day.valueOf("TUESDAY").ordinal());//invoke ordinal method to obtain index
        for (Day d1 : Day.values())//values
        //Enhanced for loop used to print enum class
        {
            System.out.println(d1);
        }

    }
}

public class Tshirts {
	
//	Assuming 38 size is Medium
	
    static String size(int cms) {
        if(cms < 38) {
            return "S";
        } else if(cms > 37 && cms < 42) {
            return "M";
        } else {
            return "L";
        }
    }

    public static void main(String[] args) { 
        System.out.println("All is well (maybe!)");
    }
}

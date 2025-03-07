public class Accessmode {
    protected void msg() {
        System.out.println("This is an example of accessing a protected specifier");
    }
}



class exp extends Accessmode {
  
    protected void msg() {
        
        System.out.println("Example 2");
    }

    public static void main(String[] args) {
        exp obj = new exp(); 
        obj.msg();  
    }
}



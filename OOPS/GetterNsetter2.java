//getter and setters

// if any propert is associated with an object these fxn are used to operate on it 

//get- used to return the value
//set - to modify the value   like already used 

class Pen {
         //property
        private String color;
        private int tip;
    
    
    
        void setColor(String newcolor){
            color = newcolor;
            // this is setter only
        }
        void setTip(int newtip){
            // we can actually keep "this" here as well.

            //tip=newtip;
            this.tip =newtip;
            // we can write tip=newtip, aswell

            // jo "this.tip"-  likha hai ye jo tip class mai initiallt define kiya hai vo bata rha hai, "newtip"-  vo hai jo fxn ka paramter hai

        }


        // now we will use getter that are used to get info 
        String getColor(){
            return color;
        }
        //this is a tag used to tell that "this" fxn is used.

        int getTip(){
            return this.tip;
            // if we try to retun nre tip insted of this.tip , it will show error even though botha re same
        }


}
    
public class GetterNsetter2 {
    public static void main(String[] args) {
        Pen pp = new Pen();
        pp.setColor("blue");
        
        System.out.println(pp.getColor());

        pp.setTip(5);
        System.out.println(pp.getTip());
        
    }
    
    
}

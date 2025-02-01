public class Cars{
    public String brand;
    public int ModelNumber;
    public String color;


    public Cars(String brand,int ModelNumber,String color){
        this.brand=brand;
        this.ModelNumber=ModelNumber;
        this.color=color;
    }

    
    public String GetBrandString(){return this.brand;}
    public int GetModelNumber(){return this.ModelNumber;}
    public String GetColorString(){return this.color;}

    public void SetBrand(){this.brand=brand;}
    public void SetModelNumber(){this.ModelNumber=ModelNumber;}
    public void SetColor(){this.color=color;}

    public static void main(String[] args) {
        
        Cars tesla=new Cars("tesla", 6780, "white");

        System.out.println(tesla);
    }

    public String toString(){
        return ("i have a " + this.color + " color " +this.brand);
    }
}
    
   
  
    
    
    
   



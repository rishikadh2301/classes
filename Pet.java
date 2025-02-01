public class Pet {

    public int age;
    public String name;
    public String species;
    
    public Pet(int age,String name, String species){
    this.age=age;
    this.name=name;
    this.species=species;}
    public Pet(int age,String name){
        this.age=age;
        this.name=name;
        
    }


    public int getAge(){return this.age;}

    public String getNameString(){return this.name;}

    public String getSpecieString(){return this.species;}

    public void setAge(int age){this.age=age;}
    public void setNameString(String nameString){this.name=name;}
    public void getSpecieString(String specieString){this.species=species;}
    

    public static void main(String[] args) {
        Pet jackie=new Pet(3,"jackie","dog");
        // System.out.println(jackie.getNameString()+" "+jackie.getAge());
        System.out.println(jackie);
    }

    public String toString(){
        return (this.name + "is my dog and he is "+this.age+" years old.");
    }
}



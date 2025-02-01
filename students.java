public class students {
    public String name;
    public String subject;
    public int marks;

    public students(String name,String subject,int marks){
        this.name=name;
        this.subject=subject;
        this.marks=marks;}

    public String getNameString(){return this.name;}
    public String getGrade(){return this.subject;}
    public int getmarks(){return this.marks;}

    public void setNameString(){this.name=name;}
    public void setgradeString(){this.subject=subject;}
    public void setmarks(){this.marks=marks;}

    public String toString(){
        return (this.name+" got "+this.marks+" in "+this.subject);
    }

    public static void main(String[] args) {
        students rishika=new students("rishika", "math", 100);
        System.out.println(rishika);
    }



    


    
}

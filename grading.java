public enum grading {
    A(100,"top"),
    B(90,"ALMOST TOP"),
    C(80,"MIDDLE"),
    D(70,"LOWER"),
    F(50,"INSUFFICIENT");


    private int points;
    private String description;

    private grading(int points,String description){
        this.description=description;
        this.points=points;
    }

    public int getPoints() {
        return this.points;
    }

    public String getDescription() {
        return this.description;
    }

    public static void main(String[] args) {
        grading g = grading.A;
        
    }

    
}

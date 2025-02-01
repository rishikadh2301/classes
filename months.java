public enum months {
    January(31),
    February(28),
    March(31);

    private int days;
    private months(int days){
        this.days=days;


    }
    public int getDays(){return this.days;}
    public static void main(String[] args) {
        months m=months.January;
        months[] winter={months.February,months.March,months.January};
        System.out.println(m+" have "+m.getDays()+" days.");
        
    }
}

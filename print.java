class print{
    public static <t> void display(t value){
        System.out.println(value);
    }
    public static void main(String args[]){
        display(55);
        display("string");
        display(55.86);
    }
}
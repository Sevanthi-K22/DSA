class first{
    public static <T> T demo(T[] arr){
        return arr[0];
    }
    public static void main(String args[]){
        Integer[] numbers ={10,20,30};
        System.out.println(demo(numbers));
}
}
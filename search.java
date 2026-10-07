class search{
    public static <T> boolean search(T[] arr,T key){
        for(T elements : arr){
            if(elements.equals(key)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Integer[] numbers = {12,22,16,4};
        System.out.println(search(numbers,22));

    }
}
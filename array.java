class array{
    public static <t> void printArray(t[] arr){
        for(t elements: arr)
            System.out.println(elements);
    }
    public static void main(String args[]){
        Integer[] numbers = {1,2,3,4,5};
        String[] letters= {"a","b","c","d"};

        printArray(numbers);
        printArray(letters);
    }
}
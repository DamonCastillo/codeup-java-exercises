import java.util.Arrays;

class ArraysExercises {


    public static String[]addPerson(String[] arr, String newName){
        String[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = newName;
        return newArr;
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        // toString makes it readable

        String[] people = {"john", "jim", "hope"};
        for (String person : people){
            System.out.println(person);
        }
        people = addPerson(people, "bob");
        for( String person : people){
            System.out.println(person);
        }




    }




}

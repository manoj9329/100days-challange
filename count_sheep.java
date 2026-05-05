

public class count_sheep {

    public static int countSheeps(Boolean[] sheep) {
        int count = 0;
for(int i = 0; i<sheep.length; i++){
    if (sheep[i] != null && sheep[i] == true) {
        count++;       
    }
}
    return count;
}
    

    public static void main(String[] args) {
        Boolean[] sheep = {true, true, null, false, true, null, true};

        int result = countSheeps(sheep);
        System.out.println("Number of sheep present: " + result);
    }
}

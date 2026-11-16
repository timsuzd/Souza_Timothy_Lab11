import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists{
    void main(){
        Scanner in = new Scanner(System.in);
        String input = "";
        int intInput = 0;
        boolean done = false;
        ArrayList<String> myArrList = new ArrayList<>();

        SafeInput.prettyHeader("List Maker");
        IO.println("Choose a menu option.");
        do {
            input = SafeInput.getRegExString(in, "[A]dd, [D]elete, [I]nsert, [P]rint, [Q]uit", "^[AaDdIiPpQq]$");
            input = input.toUpperCase();
            System.out.println(input);
            if (input.equals("A")){
                input = SafeInput.getNonZeroLenString(in, "Insert the String you want to add");
                arrayAdd(input, myArrList);
            }
            if (input.equals("D")){
                arrayDelete(in, intInput, myArrList);
            }
            if (input.equals("I")){
                arrayInsert(in, intInput, input, myArrList);
            }
            if (input.equals("P")){
                arrayPrint(myArrList);
            }
            if (input.equals("Q")){
                done = SafeInput.getYNConfirm(in, "Are you sure you want to exit?");
            }
        }while(!done);
    }


    private static void arrayAdd(String txt, ArrayList<String> myArrList){
        myArrList.add(txt);
    }
    private static void arrayDelete(Scanner in, int intInput, ArrayList<String> myArrList){
        if (myArrList.isEmpty()){
            System.out.println("There are no items in the list.");
        }
        else{
            intInput = SafeInput.getRangedInt(in, "Which number string would you like to remove? (Input 0 to cancel)", 0, myArrList.size());
            if (intInput == 0){
                System.out.println("Delete Cancelled.");
            }
            else{
                myArrList.remove(intInput-1);
            }
        }
    }
    private static void arrayInsert(Scanner in, int i, String txt, ArrayList<String> myArrList){
        i = SafeInput.getRangedInt(in, "Where do you want to add this string? (Input 0 to cancel)", 0, myArrList.size());
        if (i == 0){
            System.out.println("Add Cancelled.");
        }
        else {
            txt = SafeInput.getNonZeroLenString(in, "Define the string");
            myArrList.add((i-1), txt);
        }
    }
    private static void arrayPrint(ArrayList<String> myArrList){
        System.out.print("\n");
        for (int i = 0; i < myArrList.size(); i++){
            System.out.println((i+1) + ") " + myArrList.get(i));
        }
    }


    /**ArrayList<String> myArrList = new ArrayList<>(); // note the diamond notation on the type parameter <> so you don’t have to repeat the type

     Add and element to the end
     myArrlist.add("Some String");

     Read an element at location m which is an index just like an array
     String var = myArrList.get(m); // again m is the index which is zero based as in the arrays

     Insert an element at location m
     myArrlist.add(m, "Some String"); // again m is an index like an array
     See how the add method has two forms? We call this overloading.
     How many items does the arrayList hold:
     myArrList.size();

     Overwrite or replace an item at index m:
     myArrList.set(m, "New String Value");
*/






     /**A – Add an item to the list
 D – Delete an item from the list
 I – Insert an item into the list
 P – Print (i.e. display) the list
*/



 }
import java.util.List;

public class OperatiiTemaLab14Lists {

    public void printList(List<Integer> myList){
        for (int i = 0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }

    public void addaNumberToList(List<Integer> myList, int number){
        myList.add(number);
        System.out.println(myList);
    }

    public void printListByPosition(List<Integer> myIntList, int index){
        for (int i= index; i < myIntList.size(); i++){
            System.out.println(myIntList.get(i));
        }
    }

    public void printListInReverse(List<Integer> myList){
        for (int i= myList.size()-1; i >= 0;i--){
            System.out.println(myList.get(i));
        }
    }

    public void addStringToList(List<String> myList, int position, String text){
        myList.add(position,text);
    }

    public void addNumbertoFirstPosition(List<Integer> myList, int number){
        myList.add(0,number);
    }

    public void printparameterpositionList(List<Integer> myList){
        for (int i = 0; i<myList.size();i++) {
            System.out.println("Pozitia "+i+" are valoarea "+myList.get(i));
        }
    }

    public  int getLargestNumber(List<Integer> numbers) {
        int largest = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }







}


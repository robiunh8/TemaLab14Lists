import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myIntList= new ArrayList<>();
        myIntList.add(10);
        myIntList.add(20);
        myIntList.add(30);
        myIntList.add(40);
        myIntList.add(50);


        List<String> myStringList=new ArrayList<>();
        myStringList.add("one");
        myStringList.add("two");
        myStringList.add("three");
        myStringList.add("four");

        OperatiiTemaLab14Lists logicalOP = new OperatiiTemaLab14Lists();


        //ex1
        System.out.println(" ");
        System.out.println("exercitiul 1");
        logicalOP.printList(myIntList);
        //ex2
        System.out.println(" ");
        System.out.println("exercitiul 2");
        logicalOP.addaNumberToList(myIntList,100);
        //ex3
        System.out.println(" ");
        System.out.println("exercitiul 3");
        logicalOP.printListByPosition(myIntList,2);
        //ex4
        System.out.println(" ");
        System.out.println("exercitiul 4");
        logicalOP.printListInReverse(myIntList);
        //ex5
        System.out.println(" ");
        System.out.println("exercitiul 5");
        logicalOP.addStringToList(myStringList,1,"Hello");
        System.out.println(myStringList);
        //ex 6
        System.out.println(" ");
        System.out.println("exercitiul 6");
        logicalOP.addNumbertoFirstPosition(myIntList,1);
        System.out.println(myIntList);
        //ex 7
        System.out.println(" ");
        System.out.println("exercitiul 7");
        logicalOP.printparameterpositionList(myIntList);
        //ex 8
        System.out.println(" ");
        System.out.println("exercitiul 8");
        System.out.println(logicalOP.getLargestNumber(myIntList));


    }
}
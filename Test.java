import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Node<Integer> h = new Node<>(0);
    Node<Integer> p1 = new Node<>(1);
    Node<Integer> p2 = new Node<>(1);
    Node<Integer> curr;
    h.next=p1; p1.next=p2;
    Scanner scanner = new Scanner(System.in);
    int len;
    System.out.println("Enter a length:");
    len = scanner.nextInt();
    scanner.close();
    if(len==0){
      System.out.print("The sum of the fibonacci of length "+len+" is: ");
      System.out.println(0);
    }
    else if(len <3){
      System.out.print("The sum of the fibonacci of length "+len+" is: ");
      System.out.println(1);
    }
    else{
      for(int i = 3; i<len; i++){
        curr = new Node<Integer>(p1.val+p2.val);
        p2.next = curr;
        p1=p2;
        p2=curr;  
    }
    System.out.print("The sum of the fibonacci of length "+len+" is: ");
    System.out.println(Source.sumList(h));
    }

    }
}

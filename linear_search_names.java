import java.util.Scanner;

public class linear_search_names {
    public static void search(person arr[],String n){
        for(int i=0;i<arr.length-1;i++){
            if (n.equals(arr[i].name)){
                System.out.println("MATCH FOUND");
            }
        }

    }
    public static void display(person arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].name+"  "+arr[i].age+"  "+arr[i].city);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        person infos[] = new person[2];
        for (int i = 0;i<2;i++){
            
            System.out.println("Enter name "+i+":");
            String name=scan.next();
            //enter the age and city
            System.out.println("Enter the age"+i+":");
            int age = scan.nextInt();
            System.out.println("Enter the city"+i+":");
            String city = scan.next();
            person p = new person(name,age,city);
            infos[i]=p;

            
            
        }
        display(infos);

        System.out.println("SEARCHING THE NAME");
        search(infos,"mukilan");
        

    }
    
}
class person{
    String name;
    int age;
    String city;
    public person(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }


}
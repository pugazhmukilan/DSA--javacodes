import java.util.Arrays;
public class hastable_collusion_array{
    public static void main(String args[]){
        //creation of object
        HashTable table = new HashTable(3);
        table.insert(1,20);
        table.insert(0,21);
        


        System.out.println("gettig the value of the  0 th position");
        System.out.println(table.get(0));
        System.out.println();
        
        System.out.println("deleting the value of the 0 th position");
        table.remove(0);
        System.out.println();
        

        System.out.println("getting the value of the 1 st postion");
        System.out.println(table.get(1));
        System.out.println();
        

        System.out.println("getting the value  of the 10 th position");
        System.out.println(table.get(0));//if it is -1 then the place is empty and no value is entered there
        
    }
}
class HashTable {
    private int[] table;
    private int[] keys;
    private int[] values;

    public HashTable(int size) {
        table = new int[size];
        Arrays.fill(table, -1); //fill every position with "-1" element
        keys = new int[size];
        values = new int[size];
    }

    public void insert(int key, int value) {
        int hash = key % table.length;
        if (table[hash] != -1) {
            int i = 1;
            while (true) {
                int newHash = (hash + i) % table.length;
                if (table[newHash] == -1) {
                    hash = newHash;
                    break;
                }
                i++;
            }
        }
        table[hash] = key;
        keys[hash] = key;
        values[hash] = value;
    }

    public int get(int key) {
        int hash = key % table.length;
        if (table[hash] != -1) {
            for (int i = 0; i < keys.length; i++) {
                if (keys[i] == key) {
                    return values[i];
                }
            }
        }
        return -1;
    }

    public void remove(int key) {
        int hash = key % table.length;
        if (table[hash] != -1) {
            for (int i = 0; i < keys.length; i++) {
                if (keys[i] == key) {
                    table[i] = -1;
                    keys[i] = -1;
                    values[i] = -1;
                    break;
                }
            }
        }
    }
}

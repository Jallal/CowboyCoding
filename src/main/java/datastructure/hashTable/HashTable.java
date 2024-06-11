package datastructure.hashTable;
public class HashTable {

    //array to hold hash table
    private DataField[] hashArray;

    private int arraySize;

    // for deleting item
    private DataField nonItem;

    public HashTable(int size){

        this.arraySize = size;
        this.hashArray = new DataField[this.arraySize];
        this.nonItem = new DataField(-1);
    }


    // hash function
    public int hashFunction(int key){

        return key%arraySize;
    }


    public void insert(DataField dataField){

        int key = dataField.getKey(); // extract the key
        int hashValue = this.hashFunction(key);  // hash the key 

        //untill empty cell or -1
        while(hashArray[hashValue] !=null && hashArray[hashValue].getKey() !=-1){

            // go to the next cell
            ++hashValue;
            //wrap around if necessary 
            hashValue %= arraySize;
        }
        // insert item
        hashArray[hashValue] = dataField;
    }

     // delete a data item
    public DataField delete(int key){
        DataField temp =null;
        
        //hash key
        int hashValue = this.hashFunction(key);

        //util empty cell
        while(this.hashArray[hashValue]!=null){

                // found the key
            if(this.hashArray[hashValue].getKey()==key){

                //save the item
                 temp = this.hashArray[hashValue];
                // delete the item
                this.hashArray[hashValue] = this.nonItem;

                return temp;
            }
        //go to the next cell
        ++hashValue;

        //wraparound if neccessary 
        hashValue %= this.arraySize;
        }
        //can't find the item
        return temp;
    }


    public DataField find(int key){

        DataField temp =null;

        //hash the key
        int hashValue = this.hashFunction(key);

        //util emty cell
        while(this.hashArray[hashValue]!=null){

                //found it return the item
            if(this.hashArray[hashValue].getKey() == key){
                temp = this.hashArray[hashValue];
            }
            // go to the next cell
            ++hashValue; 
            // wrap around if necessary 
            hashValue %= arraySize; 
        }
     return temp;
    }

    public static void main(String[] args){

        DataField dataField =null;
        int key;
        int size;
        int n;
        int keysPerCell;


    }
}

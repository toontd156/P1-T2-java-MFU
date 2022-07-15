package lab8;

public class HashTable2 {
    private int size = 0;
	private String[] fr;
	private String[] eng;

	public HashTable2(int capacity) {
		fr = new String[capacity];
        eng = new String[capacity];
	}

	public void put(String key, String value) {
		if(size == fr.length) {
            System.out.println("hash table is full"); 
            return;
        }
        int index = hashFunction(key);
        fr[index] = key;
        eng[index] = value;
        size++;
        System.out.println("Putting " + key + "is successful. ");
    }
    public void get(String key){

    }
	public int getSize() {
		return size;
	}

	public int hashFunction(String key) {
        int hash = (key.hashCode() & 0x7FFFFFFF) % eng.length;
        return hash;

	}

	public void printHashTable() {
	System.out.println("--- Hash table ---");
    for(int i = 0; i < fr.length; i++) {
        System.out.println(i +" " + fr[i] + " " + eng[i]);
    }




	} 
}

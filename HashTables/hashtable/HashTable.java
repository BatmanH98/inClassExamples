package hashtable;

public class HashTable {
	Node[] table;
	int capacity;
	int size;
	
	public HashTable(int capacity) {
		table = new Node[capacity];
		this.capacity=capacity;
		this.size=0;
	}
	
	public int hashkey(String key) {
		int index;
		int total=0;
		
		for(index=0;index<key.length();index++) {
			total = total + (int) key.charAt(index) * 13;
		}
		index = total % this.capacity;
		return index;
	}
	
	public void put(String key, String value) {
		int hashkey = hashkey(key);
		Node node = new Node(key,value);
		this.table[hashkey]=node;
		this.size++;
	}
	
	public String get(String key) {
		String str=null;
		int hashkey = hashkey(key);
		if(this.table[hashkey]!=null) {
			str = this.table[hashkey].value;
		}
		return str;
	}
	
	public void show() {
		int index;
		
		System.out.printf("Load Factor: %3.2f\n", (float)this.size/this.capacity);
		System.out.printf("--------------\n");
		for(index=0;index<this.capacity;index++) {
			if(this.table[index]!=null) {
				System.out.printf("[%d]: Key: %s Value: %s\n", index, this.table[index].key,
					this.table[index].value);
			}else {
				System.out.printf("[%d]: NULL\n", index);
			}
		}
	}
}

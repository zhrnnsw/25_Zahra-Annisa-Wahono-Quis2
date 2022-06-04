package Kuis;

public class Queue {
    Node_25 front, rear;
    int size;

    public Queue(){
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void enqueue(int noA, Pembeli p){
        if(isEmpty()){
            front = new Node_25(null,noA, p, null);
            rear = front;
        }else{
            Node_25 current = front;
            while(current.next != null){
                current = current.next;
            }
            Node_25 newNode = new Node_25(null,noA, p, null);
            current.next = newNode;
            rear = current.next;
        }
        size++;
    }

    public void dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong!");
        }else{
            Node_25 tmp = front;
            front = front.next;
            front.prev = null;
            size--;
            System.out.println(tmp.data.namaPembeli +" telah memesan Menu");
            
        }
        
    }

    public void addPesanan (Pesanan s){
        if(isEmpty()){
            front = new Node_25(null, s, null);
            rear = front;
        }else{
            Node_25 current = front;
            while(current.next != null){
                current = current.next;
            }
            Node_25 newNode = new Node_25(current, s, null);
            current.next = newNode;
            rear = current.next;
        }
        size++;
    }
    
    public void daftarPesan (){
        if(!isEmpty()){
            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Pesanan Masuk Resto Royal Delish");
            System.out.println("++++++++++++++++++++++++++++++++++");
            Node_25 tmp = front;
            System.out.println("|No.\t|Nama Pesanan\t|Harga\t|");
            while(tmp != null){
                System.out.println("|"
                +tmp.pesan.kodePesanan+ "\t|" + tmp.pesan.namaPesanan +"\t|"+tmp.pesan.harga);
                tmp = tmp.next;
            }
            System.out.println("semua Pesanan berhasil dicetak");
        }else{
            System.out.println("Lingked Lists Kosong");
        }
    }
    public void print(){
        if(!isEmpty()){
            Node_25 tmp = front;
            System.out.println("|No.\t|Nama\t|No HP");
            while(tmp != null){
                System.out.println("|"+tmp.noA+"\t|"
                +tmp.data.namaPembeli+ "\t|" + tmp.data.NoHP +"\t|");
                tmp = tmp.next;
            }
            System.out.println("Sisa antrian: "+size);
        }else{
            System.out.println("Lingked Lists Kosong");
        }
    }
}

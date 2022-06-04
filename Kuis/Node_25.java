package Kuis;

public class Node_25{
    Pembeli data;
    Pesanan pesan;
    Node_25 prev,next;
    int noA;

    Node_25(Node_25 prev,int noA, Pembeli data, Node_25 next){
        this.data = data;
        this.prev = prev;
        this.next = next;
        this.noA = noA;
    }

    Node_25(Node_25 prev, Pesanan p, Node_25 next){
        this.pesan = pesan;
        this.prev = prev;
        this.next = next;
    }
}
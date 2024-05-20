package Quiz2;

import Quiz2.Klasemen.Pembalap;

public class Method {
        Node head;
    public void addDriver(String nama, int menang, int position, int lap, int poin){
        Node newDriver = new Node(nama, menang, position, lap, poin, null);
        if(head == null){
            head = newDriver;
        } else {
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newDriver;
        }
    }
    public void printStandings(){
        Node standings = head;
        while(standings != null){
            System.out.println(standings.position+". "+standings.nama+" | Menang: "+standings.menang+" | Laps: "+standings.lap+" | Poin: "+standings.poin);
            standings = standings.next;
        }
    }
    public void updateStandings(int i, Pembalap[] drivers) {
        int lap = 0;
        for(int j = 0; j < drivers.length; j++){
            if(drivers[j].position == i){
                lap += 10 - drivers[j].menang;
            }
        }
        Node standings = head;
        while(standings != null){
            if(standings.position == i){
                standings.lap += lap;
            }
            standings = standings.next;
        }
    }
}

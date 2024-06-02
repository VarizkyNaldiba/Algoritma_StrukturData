
# Pertemuan 14
## Jobsheet 13 Tree
- Nama    : Varizky Naldiba Rimra
- Kelas   : TI - 1H

### Kegiatan Praktikum 1
#### Verifikasi Hasil
![alt text](image.png)
##### Pertanyaan 
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding
binary tree biasa?
> Binary Tree memiliki aturan yang jelas mengenai dimana data-data tersebut ditempatkan. Sehingga membuat pencarian lebih cepat dan efisien dibandingkan dengan binary tree biasa yang tidak memiliki aturan khusus. Binary tree biasa tidak lebih efisien karena kita program tersebut akan melakukan pencarian satu-persatu.
2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
> sebagai pointer atau penunjuk dimana letak data child/anak. Atribut left menunjukkan ke child disebelah kiri, dan right menunjukkan ke child disebelah kanan.
3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
> Atribut root adalah sebagai node utama/ induk dari sebuah tree
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
> Ketika objek tree pertama kali dibuat, nilai dari root akan dinisiasi ke null terlbeih dahulu.
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
> maka akan terjadi proses pengecekan terlbih dahulu, yaitu mengecek apakah tree kosong (menggunakan method isEmpty()), jika iya, maka node baru akan ditambahkan dan dijadikan sebagai root.
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan
secara detil untuk apa baris program tersebut?
```java
if(data<current.data){
if(current.left!=null){
current = current.left;
}else{
current.left = new Node(data);
break;
}
}
```
> Pertama, akan dilakukan pengecekan apakah data yang ditambahkan lebih kecil dari data di node saat ini. 
- Jika iya, maka akan dilanjutkan proses pengecekan berikutnya, yakni apakah node anak kiri dari node saat ini tidak null/ kosong. 
- Jika tidak null, maka pointer current/ pointer node-saat-ini akan dipindahkan ke node-anak-kiri dari node-saat-ini. 
- Namun jika current.left (anak-kiri dari node-saat-ini) adalah kosong, maka data yang akan ditambahkan akan diletakkan di node current.left ini.

### Kegiatan Praktikum 2 
#### Verifikasi Hasil 
![alt text](image-1.png)
##### Pertanyaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
> Atribut data adalah variabel yang digunakan untuk menyimpan data atau nilai, dan idxLast adalah indeks terakhir dari node data.
2. Apakah kegunaan dari method populateData()?
> Method populateData() digunakan untuk mengisi nilai pada data dan mengatur nilai indeks terakhir dari data yang disimpan.
3. Apakah kegunaan dari method traverseInOrder()?
> method traverseInOrder() digunakan untuk melakukan penelusuran pada binary tree yang nantinya akan diprint dalam bentuk urutan nilai dengan urutan left-root-right
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing?
> Dengan root yang dimulai dari index 0,
maka anak kiri dari node 2 berada di indeks ke = 2i+1 = 2(2)+1 = 5
dan anak kanan dari node 2 berada di indeks ke = 2i+2 = 2(2)+2 = 6
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
> statement int idxLast = 6 digunakan untuk menginisialisai variabel idxLast dengan nilai 6, yang menunjukkan bahwa akan ada 7 nilai yang diprint atau kurang dari sama dengan indeks ke-6

### Tugas Praktikum
#### Waktu pengerjaan: 90 menit
1. Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara
rekursif.
- Hasil
> ![alt text](image-2.png)
2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang
paling besar yang ada di dalam tree.
- Hasil
> ![alt text](image-3.png)
3. Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf.
- Hasil
> ![alt text](image-4.png)
4. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada
di dalam tree.
- Hasil
> ![alt text](image-5.png)
5. Modifikasi class BinaryTreeArray, dan tambahkan :
• method add(int data) untuk memasukan data ke dalam tree
```java
void add(int nilai) {
        if (idxlast < data.length - 1) {
            idxlast++;
            data[idxlast] = nilai;
        } else {
            System.out.println("Tree sudah penuh!");
        }
    }
```
• method traversePreOrder() dan traversePostOrder()
- Hasil
> ![alt text](image-6.png)
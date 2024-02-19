Nama : Varizky Naldiba Rimra <br>
Kelas : TI 1H <br>
Nim : 2341720243 <br>

# Pertemuan 2 Praktikum Algoritma dan Struktur Data

## Percobaan 1 Deklarasi Class, Atribut dan Method

![alt text](Percobaan1.png) <br>

### Pertanyaan Percobaan 1

1. Sebutkan dua karakteristik class atau object!<br>
- Class <br>
 Blue print yang mendefinisikan atribut (variable) <br>
 Kerangka dasar dalam pembuatan objek<br>
- Object <br>
Setiap objek memiliki identitas <br>
Objek memiliki keadaan tersendiri tergantung variable nya <br>

2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Buku? Sebutkan apa saja atributnya! <br>
5 class yaitu judul, pengarang, halaman, stok, harga. <br>

3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya! <br>
4 method
- method Tampil Informasi
- method Terjual
- method Restock
- method Ganti Harga <br>

4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)! <br>

![alt text](terjual.png) <br>

5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int? <br>
untuk mengidentifikasi jumlah yang di masukkan pengguna <br>

## Percobaan 2 Instansiasi Object, serta Mengakses Atribut dan Method

![alt text](Percobaan2.png)

### Pertanyaan 

1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan? <br>
![alt text](1.png)<br>
![alt text](2.png) <br>
Object yang dihasilkan adalah bk1 dan bk2 <br>

2. Bagaimana cara mengakses atribut dan method dari suatu objek? <br>
- Atribut 
menggunakan sintaks "namaObjek.namaAtribut" <br>
- Method 
menggunakan sintaks ""namaObjek.namaMetode()" <br>

3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?

## Percobaan 3

![alt text](Percobaan3.png)

### Pertanyaan 

1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?
3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses secara berurutan? Jelaskan alasannya!
5. Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor berparameter dari class Buku!
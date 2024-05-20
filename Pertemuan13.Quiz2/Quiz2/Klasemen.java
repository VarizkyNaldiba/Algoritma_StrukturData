import java.util.Scanner;

public class Klasemen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        F1SLL daftarPembalap = new F1SLL();

        // Tampilkan klasemen
        System.out.println("Daftar List :");
        System.out.println("1. Bahrain");
        System.out.println("2. Saudi Arabia");
        System.out.println("3. Australia");
        System.out.println("4. Azerbaijan");
        System.out.println("5. Miami");
        System.out.println("6. Emilia-Romagna");
        System.out.println("7. Monaco");
        System.out.println("8. Spain");
        System.out.println("9. Canada");
        System.out.println("10. Austria ");
        System.out.println("11. Great Britain");
        System.out.println("12. Hungary");
        System.out.println("13. Belgium");
        System.out.println("14. Netherlands");
        System.out.println("15. Italy");
        System.out.println("16. Singapore");
        System.out.println("17. Japan");
        System.out.println("18. Qatar");
        System.out.println("19. United States");
        System.out.println("20. Mexico");
        System.out.println("21. Brazil");
        System.out.println("22. Las Vegas");
        System.out.println("23. Abu Dhabi");
        System.out.println("24. Puncak Klasemen ");

        int pilihan;
        do {
            System.out.print("\nPilihlah Grand Prix yang Anda Inginkan ! (1-23) : ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Bahrain|");
                    System.out.println("---------------------");
                    Pembalap[] Bahrain = {
                            new Pembalap(18, "Lance Stroll", 8),
                            new Pembalap(1, "Max Verstappen", 25),
                            new Pembalap(22, "Yuki Tsunoda", 0),
                            new Pembalap(4, "Lando Norris", 0),
                            new Pembalap(77, "Valtteri Bottas", 4),
                            new Pembalap(11, "Sergio Perez", 18),
                            new Pembalap(63, "George Russell", 6),
                            new Pembalap(21, "Nyck De Vries", 0),
                            new Pembalap(14, "Fernando Alonso", 15),
                            new Pembalap(31, "Esteban Ocon", 0),
                            new Pembalap(2, "Logan Sargeant", 0),
                            new Pembalap(55, "Carlos Sainz", 12),
                            new Pembalap(23, "Alexander Albon", 1),
                            new Pembalap(81, "Oscar Piastri", 0),
                            new Pembalap(20, "Kevin Magnussen", 0),
                            new Pembalap(10, "Pierre Gasly", 2),
                            new Pembalap(44, "Lewis Hamilton", 10),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(16, "Charles Leclerc", 0)
                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Bahrain) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();
                    break;
                case 2:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Saudi Arabia|");
                    System.out.println("---------------------");
                    Pembalap[] Saudi = {
                            new Pembalap(1, "Max Verstappen", 19),
                            new Pembalap(4, "Lando Norris", 0),
                            new Pembalap(16, "Charles Leclerc", 6),
                            new Pembalap(63, "George Russell", 12),
                            new Pembalap(2, "Logan Sargeant", 0),
                            new Pembalap(31, "Esteban Ocon", 4),
                            new Pembalap(77, "Valtteri Bottas", 0),
                            new Pembalap(22, "Yuki Tsunoda", 0),
                            new Pembalap(14, "Fernando Alonso", 15),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(21, "Nyck De Vries", 0),
                            new Pembalap(20, "Kevin Magnussen", 1),
                            new Pembalap(44, "Lewis Hamilton", 10),
                            new Pembalap(10, "Pierre Gasly", 2),
                            new Pembalap(11, "Sergio Perez", 25),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(55, "Carlos Sainz", 8),
                            new Pembalap(81, "Oscar Piastri", 0),
                            new Pembalap(23, "Alexander Albon", 0),
                            new Pembalap(18, "Lance Stroll", 0)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Saudi) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();
                    break;
                case 3:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Australia|");
                    System.out.println("---------------------");
                    Pembalap[] Australia = {
                            new Pembalap(18, "Lance Stroll", 12),
                            new Pembalap(1, "Max Verstappen", 25),
                            new Pembalap(22, "Yuki Tsunoda", 1),
                            new Pembalap(4, "Lando Norris", 8),
                            new Pembalap(77, "Valtteri Bottas", 0),
                            new Pembalap(11, "Sergio Perez", 11),
                            new Pembalap(27, "Nico Hulkenberg", 6),
                            new Pembalap(21, "Nyck De Vries", 0),
                            new Pembalap(14, "Fernando Alonso", 15),
                            new Pembalap(31, "Esteban Ocon", 0),
                            new Pembalap(2, "Logan Sargeant", 0),
                            new Pembalap(55, "Carlos Sainz", 0),
                            new Pembalap(23, "Alexander Albon", 0),
                            new Pembalap(10, "Pierre Gasly", 0),
                            new Pembalap(44, "Lewis Hamilton", 18),
                            new Pembalap(81, "Oscar Piastri", 4),
                            new Pembalap(24, "Zhou Guanyu", 2),
                            new Pembalap(20, "Kevin Magnussen", 0),
                            new Pembalap(63, "George Russell", 0),
                            new Pembalap(16, "Charles Leclerc", 0)
                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Australia) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();
                    break;
                case 4:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Azerbaijan|");
                    System.out.println("---------------------");
                    Pembalap[] Azerbaijan = {
                            new Pembalap(11, "Sergio Perez", 25),
                            new Pembalap(1, "Max Verstappen", 18),
                            new Pembalap(16, "Charles Leclerc", 15),
                            new Pembalap(14, "Fernando Alonso", 12),
                            new Pembalap(55, "Carlos Sainz", 10),
                            new Pembalap(44, "Lewis Hamilton", 8),
                            new Pembalap(18, "Lance Stroll", 6),
                            new Pembalap(63, "George Russell", 5),
                            new Pembalap(4, "Lando Norris", 2),
                            new Pembalap(22, "Yuki Tsunoda", 1),
                            new Pembalap(81, "Oscar Piastri", 0),
                            new Pembalap(23, "Alexander Albon", 0),
                            new Pembalap(20, "Kevin Magnussen", 0),
                            new Pembalap(10, "Pierre Gasly", 0),
                            new Pembalap(31, "Esteban Ocon", 0),
                            new Pembalap(2, "Logan Sargeant", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(77, "Valtteri Bottas", 0),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(21, "Nyck De Vries", 0)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Azerbaijan) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();
                    break;
                case 5:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Miami|");
                    System.out.println("---------------------");
                    Pembalap[] US = {
                            new Pembalap(1, "Max Verstappen", 26),
                            new Pembalap(11, "Sergio Perez", 18),
                            new Pembalap(14, "Fernando Alonso", 15),
                            new Pembalap(63, "George Russell", 12),
                            new Pembalap(55, "Carlos Sainz", 10),
                            new Pembalap(44, "Lewis Hamilton", 8),
                            new Pembalap(16, "Charles Leclerc", 6),
                            new Pembalap(10, "Pierre Gasly", 4),
                            new Pembalap(31, "Esteban Ocon", 2),
                            new Pembalap(20, "Kevin Magnussen", 1),
                            new Pembalap(22, "Yuki Tsunoda", 0),
                            new Pembalap(18, "Lance Stroll", 0),
                            new Pembalap(77, "Valtteri Bottas", 0),
                            new Pembalap(23, "Alexander Albon", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(4, "Lando Norris", 0),
                            new Pembalap(21, "Nyck De Vries", 0),
                            new Pembalap(81, "Oscar Piastri", 0),
                            new Pembalap(2, "Logan Sargeant", 0)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : US) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 6:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Emilia Romagna|");
                    System.out.println("---------------------");
                    System.out.println("===========================");
                    System.out.println(" STATUS = CANCELED ");
                    System.out.println("===========================");
                    break;
                case 7:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Monaco|");
                    System.out.println("---------------------");
                    Pembalap[] Monaco = {
                            new Pembalap(1, "Max Verstappen", 25),
                            new Pembalap(14, "Fernando Alonso", 18),
                            new Pembalap(31, "Esteban Ocon", 15),
                            new Pembalap(44, "Lewis Hamilton", 13),
                            new Pembalap(63, "George Russell", 10),
                            new Pembalap(16, "Charles Leclerc", 8),
                            new Pembalap(10, "Pierre Gasly", 6),
                            new Pembalap(55, "Carlos Sainz", 4),
                            new Pembalap(4, "Lando Norris", 2),
                            new Pembalap(81, "Oscar Piastri", 1),
                            new Pembalap(77, "Valtteri Bottas", 0),
                            new Pembalap(21, "Nyck De Vries", 0),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(23, "Alexander Albon", 0),
                            new Pembalap(22, "Yuki Tsunoda", 0),
                            new Pembalap(11, "Sergio Perez", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(2, "Logan Sargeant", 0),
                            new Pembalap(20, "Kevin Magnussen", 0),
                            new Pembalap(18, "Lance Stroll", 0)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Monaco) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 8:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Spain|");
                    System.out.println("---------------------");
                    Pembalap[] Spain = {
                            new Pembalap(1, "Max Verstappen", 26),
                            new Pembalap(44, "Lewis Hamilton", 18),
                            new Pembalap(63, "George Russell", 15),
                            new Pembalap(11, "Sergio Perez", 12),
                            new Pembalap(55, "Carlos Sainz", 10),
                            new Pembalap(18, "Lance Stroll", 8),
                            new Pembalap(14, "Fernando Alonso", 6),
                            new Pembalap(31, "Esteban Ocon", 4),
                            new Pembalap(24, "Zhou Guanyu", 2),
                            new Pembalap(10, "Pierre Gasly", 1),
                            new Pembalap(16, "Charles Leclerc", 0),
                            new Pembalap(22, "Yuki Tsunoda", 0),
                            new Pembalap(81, "Oscar Piastri", 0),
                            new Pembalap(23, "Alexander Albon", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(21, "Nyck De Vries", 0),
                            new Pembalap(4, "Lando Norris", 0),
                            new Pembalap(20, "Kevin Magnussen", 0),
                            new Pembalap(77, "Valtteri Bottas", 0),
                            new Pembalap(18, "Lance Stroll", 0)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Spain) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 9:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Canada|");
                    System.out.println("---------------------");
                    Pembalap[] Canada = {
                            new Pembalap(1, "Max Verstappen", 25),
                            new Pembalap(14, "Fernando Alonso", 18),
                            new Pembalap(44, "Lewis Hamilton", 15),
                            new Pembalap(16, "Charles Leclerc", 12),
                            new Pembalap(55, "Carlos Sainz", 10),
                            new Pembalap(11, "Sergio Perez", 9),
                            new Pembalap(23, "Alexander Albon", 6),
                            new Pembalap(31, "Esteban Ocon", 4),
                            new Pembalap(18, "Lance Stroll", 2),
                            new Pembalap(77, "Valtteri Bottas", 1),
                            new Pembalap(81, "Oscar Piastri", 0),
                            new Pembalap(10, "Pierre Gasly", 0),
                            new Pembalap(4, "Lando Norris", 0),
                            new Pembalap(22, "Yuki Tsunoda", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(20, "Kevin Magnussen", 0),
                            new Pembalap(21, "Nyck De Vries", 0),
                            new Pembalap(63, "George Russell", 0),
                            new Pembalap(18, "Lance Stroll", 0)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Canada) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 10:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Austria|");
                    System.out.println("---------------------");
                    Pembalap[] Austria = {
                            new Pembalap(1, "Max Verstappen", 26),
                            new Pembalap(16, "Charles Leclerc", 18),
                            new Pembalap(11, "Sergio Perez", 15),
                            new Pembalap(4, "Lando Norris", 12),
                            new Pembalap(14, "Fernando Alonso", 10),
                            new Pembalap(55, "Carlos Sainz", 8),
                            new Pembalap(63, "George Russell", 6),
                            new Pembalap(44, "Lewis Hamilton", 4),
                            new Pembalap(18, "Lance Stroll", 2),
                            new Pembalap(10, "Pierre Gasly", 1),
                            new Pembalap(23, "Alexander Albon", 0),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(20, "Kevin Magnussen", 0),
                            new Pembalap(18, "Lance Stroll", 0),
                            new Pembalap(31, "Esteban Ocon", 0),
                            new Pembalap(77, "Valtteri Bottas", 0),
                            new Pembalap(81, "Oscar Piastri", 0),
                            new Pembalap(21, "Nyck De Vries", 0),
                            new Pembalap(22, "Yuki Tsunoda", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Austria) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 11:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Great Britain|");
                    System.out.println("---------------------");
                    Pembalap[] Britain = {
                            new Pembalap(1, "Max Verstappen", 26),
                            new Pembalap(4, "Lando Norris", 18),
                            new Pembalap(44, "Lewis Hamilton", 15),
                            new Pembalap(81, "Oscar Piastri", 12),
                            new Pembalap(63, "George Russell", 10),
                            new Pembalap(11, "Sergio Perez", 8),
                            new Pembalap(14, "Fernando Alonso", 6),
                            new Pembalap(23, "Alexander Albon", 4),
                            new Pembalap(16, "Charles Leclerc", 2),
                            new Pembalap(55, "Carlos Sainz", 1),
                            new Pembalap(2, "Logan Sargeant", 0),
                            new Pembalap(20, "Kevin Magnussen", 0),
                            new Pembalap(31, "Esteban Ocon", 0),
                            new Pembalap(77, "Valtteri Bottas", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(18, "Lance Stroll", 0),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(22, "Yuki Tsunoda", 0),
                            new Pembalap(21, "Nyck De Vries", 0),
                            new Pembalap(10, "Pierre Gasly", 0)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Britain) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 12:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Hungary|");
                    System.out.println("---------------------");
                    Pembalap[] Hungary = {
                            new Pembalap(1, "Max Verstappen", 26),
                            new Pembalap(16, "Charles Leclerc", 18),
                            new Pembalap(11, "Sergio Perez", 15),
                            new Pembalap(4, "Lando Norris", 12),
                            new Pembalap(14, "Fernando Alonso", 10),
                            new Pembalap(55, "Carlos Sainz", 8),
                            new Pembalap(63, "George Russell", 6),
                            new Pembalap(44, "Lewis Hamilton", 4),
                            new Pembalap(18, "Lance Stroll", 2),
                            new Pembalap(10, "Pierre Gasly", 1),
                            new Pembalap(23, "Alexander Albon", 0),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(20, "Kevin Magnussen", 0),
                            new Pembalap(18, "Lance Stroll", 0),
                            new Pembalap(31, "Esteban Ocon", 0),
                            new Pembalap(77, "Valtteri Bottas", 0),
                            new Pembalap(81, "Oscar Piastri", 0),
                            new Pembalap(21, "Nyck De Vries", 0),
                            new Pembalap(22, "Yuki Tsunoda", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Hungary) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 13:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Belgium|");
                    System.out.println("---------------------");
                    Pembalap[] Belgium = {
                            new Pembalap(1, "Max Verstappen", 25),
                            new Pembalap(11, "Sergio Perez", 18),
                            new Pembalap(16, "Charles Leclerc", 15),
                            new Pembalap(44, "Lewis Hamilton", 13),
                            new Pembalap(14, "Fernando Alonso", 10),
                            new Pembalap(63, "George Russell", 8),
                            new Pembalap(4, "Lando Norris", 6),
                            new Pembalap(31, "Esteban Ocon", 4),
                            new Pembalap(18, "Lance Stroll", 2),
                            new Pembalap(22, "Yuki Tsunoda", 1),
                            new Pembalap(10, "Pierre Gasly", 0),
                            new Pembalap(77, "Valtteri Bottas", 0),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(23, "Alexander Albon", 0),
                            new Pembalap(20, "Kevin Magnussen", 0),
                            new Pembalap(3, "Daniel Ricciardo", 0),
                            new Pembalap(21, "Nyck De Vries", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(55, "Carlos Sainz", 0),
                            new Pembalap(81, "Oscar Piastri", 0)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Belgium) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 14:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Netherlands|");
                    System.out.println("---------------------");
                    Pembalap[] Netherlands = {
                            new Pembalap(1, "Max Verstappen", 25),
                            new Pembalap(14, "Fernando Alonso", 19),
                            new Pembalap(10, "Pierre Gasly", 15),
                            new Pembalap(11, "Sergio Perez", 12),
                            new Pembalap(55, "Carlos Sainz", 10),
                            new Pembalap(44, "Lewis Hamilton", 8),
                            new Pembalap(4, "Lando Norris", 6),
                            new Pembalap(23, "Alexander Albon", 4),
                            new Pembalap(81, "Oscar Piastri", 2),
                            new Pembalap(31, "Esteban Ocon", 1),
                            new Pembalap(18, "Lance Stroll", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(98, "Lawrence Stroll", 0),
                            new Pembalap(77, "Valtteri Bottas", 0),
                            new Pembalap(22, "Yuki Tsunoda", 0),
                            new Pembalap(20, "Kevin Magnussen", 0),
                            new Pembalap(63, "George Russell", 0),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(16, "Charles Leclerc", 0),
                            new Pembalap(17, "Nicholas Latifi", 0),
                            new Pembalap(99, "Antonio Giovinazzi", 0),
                            new Pembalap(21, "Nyck De Vries", 0),
                            new Pembalap(31, "Esteban Ocon", 0)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Netherlands) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 15:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Italy|");
                    System.out.println("---------------------");
                    Pembalap[] Italy = {
                            new Pembalap(1, "Max Verstappen", 25),
                            new Pembalap(11, "Sergio Perez", 18),
                            new Pembalap(55, "Carlos Sainz", 15),
                            new Pembalap(16, "Charles Leclerc", 12),
                            new Pembalap(63, "George Russell", 10),
                            new Pembalap(44, "Lewis Hamilton", 8),
                            new Pembalap(23, "Alexander Albon", 6),
                            new Pembalap(4, "Lando Norris", 4),
                            new Pembalap(14, "Fernando Alonso", 2),
                            new Pembalap(77, "Valtteri Bottas", 1),
                            new Pembalap(98, "Lawrence Stroll", 0),
                            new Pembalap(81, "Oscar Piastri", 0),
                            new Pembalap(18, "Lance Stroll", 0),
                            new Pembalap(21, "Nyck De Vries", 0),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(10, "Pierre Gasly", 0),
                            new Pembalap(18, "Lance Stroll", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(20, "Kevin Magnussen", 0),
                            new Pembalap(31, "Esteban Ocon", 0),
                            new Pembalap(22, "Yuki Tsunoda", 0)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Italy) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 16:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Singapore|");
                    System.out.println("---------------------");
                    Pembalap[] Singapore = {
                            new Pembalap(55, "Carlos Sainz", 25),
                            new Pembalap(4, "Lando Norris", 18),
                            new Pembalap(44, "Lewis Hamilton", 16),
                            new Pembalap(16, "Charles Leclerc", 12),
                            new Pembalap(1, "Max Verstappen", 10),
                            new Pembalap(10, "Pierre Gasly", 8),
                            new Pembalap(81, "Oscar Piastri", 6),
                            new Pembalap(11, "Sergio Perez", 4),
                            new Pembalap(98, "Lawrence Stroll", 2),
                            new Pembalap(20, "Kevin Magnussen", 1),
                            new Pembalap(23, "Alexander Albon", 0),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(18, "Lance Stroll", 0),
                            new Pembalap(63, "George Russell", 0),
                            new Pembalap(77, "Valtteri Bottas", 0),
                            new Pembalap(31, "Esteban Ocon", 0),
                            new Pembalap(22, "Yuki Tsunoda", 0)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Singapore) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 17:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Japan|");
                    System.out.println("---------------------");
                    Pembalap[] Japan = {
                            new Pembalap(1, "Max Verstappen", 26),
                            new Pembalap(4, "Lando Norris", 18),
                            new Pembalap(81, "Oscar Piastri", 15),
                            new Pembalap(16, "Charles Leclerc", 12),
                            new Pembalap(44, "Lewis Hamilton", 10),
                            new Pembalap(55, "Carlos Sainz", 8),
                            new Pembalap(63, "George Russell", 6),
                            new Pembalap(14, "Fernando Alonso", 4),
                            new Pembalap(31, "Esteban Ocon", 2),
                            new Pembalap(10, "Pierre Gasly", 1),
                            new Pembalap(98, "Lawrence Stroll", 0),
                            new Pembalap(22, "Yuki Tsunoda", 0),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(20, "Kevin Magnussen", 0),
                            new Pembalap(23, "Alexander Albon", 0),
                            new Pembalap(77, "Valtteri Bottas", 0),
                            new Pembalap(21, "Nyck De Vries", 0),
                            new Pembalap(18, "Lance Stroll", 0),
                            new Pembalap(11, "Sergio Perez", 0)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Japan) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 18:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Qatar|");
                    System.out.println("---------------------");
                    Pembalap[] Qatar = {
                            new Pembalap(1, "Max Verstappen", 26),
                            new Pembalap(81, "Oscar Piastri", 18),
                            new Pembalap(4, "Lando Norris", 15),
                            new Pembalap(63, "George Russell", 12),
                            new Pembalap(16, "Charles Leclerc", 10),
                            new Pembalap(14, "Fernando Alonso", 8),
                            new Pembalap(31, "Esteban Ocon", 6),
                            new Pembalap(77, "Valtteri Bottas", 4),
                            new Pembalap(24, "Zhou Guanyu", 2),
                            new Pembalap(11, "Sergio Perez", 1),
                            new Pembalap(18, "Lance Stroll", 0),
                            new Pembalap(10, "Pierre Gasly", 0),
                            new Pembalap(22, "Alexander Albon", 0),
                            new Pembalap(20, "Kevin Magnussen", 0),
                            new Pembalap(23, "Yuki Tsunoda", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(98, "Lawrence Stroll", 0),
                            new Pembalap(21, "Nyck De Vries", 0),
                            new Pembalap(55, "Carlos Sainz", 0),
                            new Pembalap(44, "Lewis Hamilton", 0),
                            new Pembalap(99, "Daniel Ricciardo", 0)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Qatar) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 19:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix United States|");
                    System.out.println("---------------------");
                    Pembalap[] US2 = {
                            new Pembalap(1, "Max Verstappen", 25),
                            new Pembalap(44, "Lewis Hamilton", 0), // Disqualified
                            new Pembalap(4, "Lando Norris", 18),
                            new Pembalap(55, "Carlos Sainz", 15),
                            new Pembalap(11, "Sergio Perez", 12),
                            new Pembalap(63, "George Russell", 0), // Disqualified
                            new Pembalap(10, "Pierre Gasly", 10),
                            new Pembalap(18, "Lance Stroll", 8),
                            new Pembalap(22, "Yuki Tsunoda", 6),
                            new Pembalap(2, "Alexander Albon", 5),
                            new Pembalap(20, "Kevin Magnussen", 2),
                            new Pembalap(3, "Daniel Ricciardo", 1),
                            new Pembalap(14, "Fernando Alonso", 0), // Did Not Finish (DNF)
                            new Pembalap(81, "Oscar Piastri", 0), // Did Not Finish (DNF)
                            new Pembalap(31, "Esteban Ocon", 0) // Did Not Finish (DNF)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : US2) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 20:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Mexico|");
                    System.out.println("---------------------");
                    Pembalap[] Mexico = {
                            new Pembalap(1, "Max Verstappen", 25),
                            new Pembalap(44, "Lewis Hamilton", 19),
                            new Pembalap(16, "Charles Leclerc", 15),
                            new Pembalap(55, "Carlos Sainz", 12),
                            new Pembalap(4, "Lando Norris", 10),
                            new Pembalap(63, "George Russell", 8),
                            new Pembalap(3, "Daniel Ricciardo", 6),
                            new Pembalap(81, "Oscar Piastri", 4),
                            new Pembalap(22, "Yuki Tsunoda", 2),
                            new Pembalap(31, "Esteban Ocon", 1),
                            new Pembalap(10, "Pierre Gasly", 0),
                            new Pembalap(23, "Alexander Albon", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(77, "Valtteri Bottas", 0),
                            new Pembalap(20, "Kevin Magnussen", 0),
                            new Pembalap(11, "Sergio Perez", 0), // Did Not Finish (DNF)
                            new Pembalap(18, "Lance Stroll", 0), // Did Not Finish (DNF)
                            new Pembalap(14, "Fernando Alonso", 0) // Did Not Finish (DNF)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Mexico) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 21:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Brazil|");
                    System.out.println("---------------------");
                    Pembalap[] Brazil = {
                            new Pembalap(1, "Max Verstappen", 25),
                            new Pembalap(44, "Lewis Hamilton", 19),
                            new Pembalap(14, "Fernando Alonso", 15),
                            new Pembalap(11, "Sergio Perez", 12),
                            new Pembalap(18, "Lance Stroll", 10),
                            new Pembalap(55, "Carlos Sainz", 8),
                            new Pembalap(10, "Pierre Gasly", 6),
                            new Pembalap(4, "Lando Norris", 4),
                            new Pembalap(22, "Yuki Tsunoda", 2),
                            new Pembalap(31, "Esteban Ocon", 1),
                            new Pembalap(21, "Nyck De Vries", 0), // Did Not Finish (DNF)
                            new Pembalap(63, "George Russell", 0), // Did Not Finish (DNF)
                            new Pembalap(77, "Valtteri Bottas", 0), // Did Not Finish (DNF)
                            new Pembalap(24, "Zhou Guanyu", 0), // Did Not Finish (DNF)
                            new Pembalap(20, "Kevin Magnussen", 0), // Did Not Finish (DNF)
                            new Pembalap(23, "Alexander Albon", 0), // Did Not Finish (DNF)
                            new Pembalap(16, "Charles Leclerc", 0) // Did Not Start (DNS)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : Brazil) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 22:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Las Vegas|");
                    System.out.println("---------------------");
                    Pembalap[] US3 = {
                            new Pembalap(1, "Max Verstappen", 25),
                            new Pembalap(16, "Charles Leclerc", 18),
                            new Pembalap(11, "Sergio Perez", 15),
                            new Pembalap(31, "Esteban Ocon", 12),
                            new Pembalap(18, "Lance Stroll", 10),
                            new Pembalap(55, "Carlos Sainz", 8),
                            new Pembalap(44, "Lewis Hamilton", 6),
                            new Pembalap(63, "George Russell", 4),
                            new Pembalap(14, "Fernando Alonso", 2),
                            new Pembalap(81, "Oscar Piastri", 2),
                            new Pembalap(10, "Pierre Gasly", 0),
                            new Pembalap(22, "Yuki Tsunoda", 0), // Did Not Finish (DNF)
                            new Pembalap(27, "Nico Hulkenberg", 0), // Did Not Finish (DNF)
                            new Pembalap(7, "Lando Norris", 0), // Did Not Finish (DNF)

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : US3) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 23:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Abu Dhabi|");
                    System.out.println("---------------------");
                    Pembalap[] AbuDhabi = {
                            new Pembalap(1, "Max Verstappen", 26),
                            new Pembalap(16, "Charles Leclerc", 18),
                            new Pembalap(63, "George Russell", 15),
                            new Pembalap(11, "Sergio Perez", 12),
                            new Pembalap(7, "Lando Norris", 10),
                            new Pembalap(81, "Oscar Piastri", 8),
                            new Pembalap(14, "Fernando Alonso", 6),
                            new Pembalap(22, "Yuki Tsunoda", 4),
                            new Pembalap(44, "Lewis Hamilton", 2),
                            new Pembalap(18, "Lance Stroll", 1),
                            new Pembalap(3, "Daniel Ricciardo", 0),
                            new Pembalap(31, "Esteban Ocon", 0),
                            new Pembalap(10, "Pierre Gasly", 0),
                            new Pembalap(23, "Alexander Albon", 0),
                            new Pembalap(27, "Nico Hulkenberg", 0),
                            new Pembalap(18, "Lance Stroll", 0),
                            new Pembalap(24, "Zhou Guanyu", 0),
                            new Pembalap(55, "Carlos Sainz", 0), // Did Not Finish (DNF)
                            new Pembalap(77, "Valtteri Bottas", 0), // Completed the race but 1 lap behind
                            new Pembalap(20, "Kevin Magnussen", 0) // Completed the race but 1 lap behind

                    };
                    // Tambahkan pembalap ke daftar
                    for (Pembalap pembalapData : AbuDhabi) {
                        daftarPembalap.addPembalap(pembalapData);
                    }
                    daftarPembalap.sortPoin();
                    System.out.println("\nDaftar Pemenang:");
                    daftarPembalap.printPembalap();

                    break;
                case 24:
                    System.out.println("---------------------");
                    System.out.println("|Grand Prix Puncak Klasemen|");
                    System.out.println("---------------------");
                    // Tambahkan pembalap ke daftar
                    daftarPembalap.printPembalap();
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid");
                    break;
            }
        } while (pilihan != 0);
    }

}

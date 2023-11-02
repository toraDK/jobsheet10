import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [][] penonton = new String[4][2];

        while (true) {

            System.out.println("-Menu 1: Input data penonton");
            System.out.println("-Menu 2: Tampilkan daftar penonton");
            System.out.println("-Menu 3: Exit ");
            System.out.println("Pilih Menu");
            int menu = sc.nextInt();
            

            switch (menu) {
                case 1:
                    while(true){
                        sc.nextLine();
                        System.out.print("Masukkan nama: "); 
                        String nama = sc.nextLine(); 
                        
                        System.out.print("Masukkan baris: ");
                        int baris = sc.nextInt(); 
                        
                        System.out.print("Masukkan kolom: ");
                        int kolom = sc.nextInt();
                        sc.nextLine();

                        if(baris<1 || baris>4){
                            if(kolom<1 || kolom>2){
                                System.out.println("Kursi Tidak Tersedia");
                                break;
                            }
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi telah terisi");
                            continue;
                        }

                        penonton [baris-1][kolom-1] = nama;

                        System.out.print("Input penonton lainnya? (y/n): "); 
                        String next = sc.nextLine();
                        
                        if (next.equalsIgnoreCase("n")) { 
                            break;
                        }
                    break;
                    }
                case 2:
                    for(int i = 0; i < penonton.length; i++){
                        for(int a = 0; a < penonton[i].length; a++){
                            if (penonton[i][a] == null) {
                                penonton[i][a] = "***";
                            }
                            System.out.println("Nama penonton pada baris ke-" + i + " kolom ke-" + (a + 1) + ": " + penonton[i][a]);
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}

// Draver Test
public class TestGuru{ 

    public static void main(String[] args) {
        // membuat obyek
            Guru pakAyat = new Guru();
            Guru buAul = new Guru();
            Guru buPasha = new Guru();
            Guru buFeny = new Guru();
            Guru pakBagus = new Guru();
            pakAyat.setNama("pak Ayat", "UI UX",123456,"Malang");
            
            System.out.println("Ini data Pak Ayat");
            System.out.println("ID: " + pakAyat.id);
            System.out.println("Nama: " + pakAyat.nama);
            System.out.println("Alamat: " + pakAyat.alamat);
            System.out.println("Mapel: " + pakAyat.mapel);

            buAul.setNama("Bu Aul","produktif RPL",123456,"Sawojajar 2");
            System.out.println("Ini data Bu Aul");
            System.out.println("ID: " + buAul.id);
            System.out.println("Nama: " + buAul.nama);
            System.out.println("Alamat: " + buAul.alamat);
            System.out.println("Mapel: " + buAul.mapel);

            buPasha.setNama("Bu Pasha","produktif RPL",123456,"Malang");
            System.out.println("Ini data Bu Pasha");
            System.out.println("ID: " + buPasha.id);
            System.out.println("Nama: " + buPasha.nama);
            System.out.println("Alamat: " + buPasha.alamat);
            System.out.println("Mapel: " + buPasha.mapel);

            buFeny .setNama("Bu Feny","matematika",123456,"Sawojajar 2");
            System.out.println("Ini data Bu Feny");
            System.out.println("ID: " + buFeny.id);
            System.out.println("Nama: " + buFeny.nama);
            System.out.println("Alamat: " + buFeny.alamat);
            System.out.println("Mapel: " + buFeny.mapel);

            pakBagus.setNama("Pak Bagus","Informatika", 123456, "Malang");
            System.out.println("Ini data Pak Bagus");
            System.out.println("ID: " + pakBagus.id);
            System.out.println("Nama: " + pakBagus.nama);
            System.out.println("Alamat: " + pakBagus.alamat);
            System.out.println("Mapel: " + pakBagus.mapel);





    }
       
}
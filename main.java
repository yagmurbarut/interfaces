public class main {
    
    public static void main(String[] args) {
       Pcmuhendisi pcmuh = new Pcmuhendisi(false);
       pcmuh.adlisicil_sorgula();
       pcmuh.mezuniyet_ort(3.10);
       System.out.println(pcmuh.mezuniyet_ort(3.10));
       String[] array= {"Aselsan","Finansbank","Turksat" };
       pcmuh.is_tecrubesi(array);

       System.out.println("\n*********************\n");
       
       endustrimuh endustrimuh = new endustrimuh(true);
       endustrimuh.adlisicil_sorgula();
       endustrimuh.mezuniyet_ort(2.90);
       String[] arrays={"HUAWEI", "Siemens"};
       endustrimuh.is_tecrubesi(arrays);
       String[] referans= {"Sumeyye Koyuncu"};
       endustrimuh.referans_getir(referans);
       
        System.out.println(endustrimuh.mezuniyet_ort(2.90)); 
  }
}

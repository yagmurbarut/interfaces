public class endustrimuh implements Muhendis{
    private boolean adlisicil;
    
    public endustrimuh(boolean adlisicil){
        this.adlisicil=adlisicil;
    }
    @Override
    public String mezuniyet_ort(double derece){
        return "ortalamam: " +derece;
    }
    
    @Override
    public void adlisicil_sorgula(){
        if(adlisicil){
            System.out.println("adli sicil kaydim var");
        }
        else{
            System.out.println("adli sicil kaydim yok");
        }
    }
    @Override
    public void is_tecrubesi(String[] array){
        if(array.length==0){
            System.out.println("daha once bir sirkette calismadim");
        }
        else{
       
        System.out.println("endustri muhendisi olarak calistigim sirketler: ");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
      }
    }
    public void referans_getir(String[] array){
        
        if(array.length==0){
            System.out.println("herhangi referansim bulunmuyor");
        }
        else{
            System.out.println("referanslarim: ");
            for(int i=0; i<array.length; i++){
                System.out.println(array[i]);
            }
        }
    }
}

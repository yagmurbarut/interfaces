public class Pcmuhendisi implements Muhendis{

   
   private boolean adlisicil;
    
   public Pcmuhendisi(boolean adlisicil){
       
       this.adlisicil=adlisicil;
   }
   
   
   
   @Override
   public String mezuniyet_ort(double derece){
       return "mezuniyet ortalamam :" +derece;
       
   }

    @Override
    public void adlisicil_sorgula() {
        if(adlisicil){
            System.out.println("adli sicil kaydim var");
        }
        else{
            System.out.println("adli sicil kaydim yok");
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("yazilim muhendisi olarak su sirketlerde calistim : ");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    
}

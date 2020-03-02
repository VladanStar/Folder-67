
package undpp2r10401;

public class GlavnaKlasa {

    
    public static void main(String[] args) {
        Televizor LG = new Televizor();
        Televizor Samsung = new Televizor();
        Televizor Philips = new Televizor();
        
        if(LG.isUkljucen()){
            System.out.println("LG Televizor je ukljucen");
        }
        else{
            System.out.println("LG Televizor je iskljucen");
        }
        System.out.println("Na LG televizoru se prikazuje kanal:" + LG.getTvKanal());
        System.out.println("i jacina zvuka: " + LG.getJacinaZvuka());
        
        System.out.println("\n");
        
        if(Samsung.isUkljucen()){
            System.out.println("Samsung Televizor je ukljucen");
        }
        else{
            System.out.println("Samsung Televizor je iskljucen");
        }
        System.out.println("Na Samsung televizoru se prikazuje kanal:" + Samsung.getTvKanal());
        System.out.println("i jacina zvuka: " + Samsung.getJacinaZvuka());
        System.out.println("\n");
        
        if(Philips.isUkljucen()){
            System.out.println("Philips Televizor je ukljucen");
        }
        else{
            System.out.println("Philips Televizor je iskljucen");
        }
        System.out.println("Na Philips televizoru se prikazuje kanal:" + Philips.getTvKanal());
        System.out.println("i jacina zvuka: " + Philips.getJacinaZvuka());
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("-------------------------------------------------");
        System.out.println("Menjamo stanja objekata!");
        System.out.println("\n");
        
        LG.ukljuci();
        LG.promeniKanal(4);
        LG.setJacinaZvuka(12);
        
        if(LG.isUkljucen()){
            System.out.println("LG Televizor je ukljucen");
        }
        else{
            System.out.println("LG Televizor je iskljucen");
        }
        System.out.println("Na LG televizoru se prikazuje kanal:" + LG.getTvKanal());
        System.out.println("i jacina zvuka: " + LG.getJacinaZvuka());
        System.out.println("\n");
        Samsung.ukljuci();
        Samsung.kanalPlus();
        Samsung.kanalPlus();
        Samsung.kanalPlus();
        Samsung.kanalMinus();
        Samsung.zvukPlus();
        Samsung.zvukPlus();
        Samsung.zvukPlus();
        Samsung.zvukMinus();
        if (Samsung.isUkljucen()) {
            System.out.println("Samsung TV je uključen.");
        } else {
            System.out.println("Samsung TV je isključen.");
        }
        System.out.print("Na Samsung TV-u se prikazuje kanal " + Samsung.getTvKanal());
        System.out.print(" i jačina zvuka je " + Samsung.getJacinaZvuka() + ".");

        System.out.println("\n");
        Philips.ukljuci();
        Philips.kanalPlus();
        Philips.zadajJacinuZvuka(10);
        if (Philips.isUkljucen()) {
            System.out.println("Philips TV je uključen.");
        } else {
            System.out.println("Philips TV je isključen.");
        }
        System.out.print("Na Philips TV-u se prikazuje kanal " + Philips.getTvKanal());
        System.out.print(" i jačina zvuka je " + Philips.getJacinaZvuka() + ".");

        System.out.println("\n");

        
    }
    
}

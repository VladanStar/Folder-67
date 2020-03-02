
package undpp2r10401;

public class Televizor {
    private int tvKanal;
    private int jacinaZvuka;
    private boolean ukljucen;

    public Televizor() {
    }

    public Televizor(int tvKanal, int jacinazvuka, boolean ukljucen) {
        this.tvKanal = tvKanal;
        this.jacinaZvuka = jacinazvuka;
        this.ukljucen = ukljucen;
    }

    public int getTvKanal() {
        return tvKanal;
    }

    public void setTvKanal(int tvKanal) {
        this.tvKanal = tvKanal;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public boolean isUkljucen() {
        return ukljucen;
    }

    public void setUkljucen(boolean ukljucen) {
        this.ukljucen = ukljucen;
    }
    
    public void ukljuci(){
        ukljucen = true;
    }
    public void iskljucen(){
        ukljucen = false;
    }
    public void promeniKanal(int noviKanal){
        if(ukljucen && noviKanal >=1 && noviKanal <120){
        tvKanal = noviKanal;
        }
    }
    public void zadajJacinuZvuka(int novZvuk){
        if(ukljucen && novZvuk >=1 && novZvuk <12){
         jacinaZvuka = novZvuk;   
        }
    }
    public void kanalPlus(){
    if(ukljucen && tvKanal<120){
        tvKanal++;
    }
    }
    public void kanalMinus(){
    if(ukljucen && tvKanal >1){
        tvKanal--;
    }
    }
    public void zvukPlus(){
    if(ukljucen && jacinaZvuka >1){
        jacinaZvuka ++;
    }
    }
    public void zvukMinus(){
    if(ukljucen && jacinaZvuka <12){
        jacinaZvuka--;
    }
    }
    
}

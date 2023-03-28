public class Cafetera {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public Cafetera() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public Cafetera(int agua, int cafe, int crema, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }
    public boolean servirAmericano(){
        if (this.agua >= 180 && this.cafe >= 15 && this.vasos >0){
            this.agua -= 180;
            this.cafe -= 15;
            this.vasos--;
            return true;
        }
        return false;
    }
    public boolean servirExpreso(){
        if(true.agua >= 120 && this.cafe >= 20 && this.vasos> 0){
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos --;
            return true;
        }
        return false;
    }
    public boolean servirCapuchino() {
        if (this.agua >= 100 && this.crema >= 70 && this.cafe >= 14 && this.vasos > 0) {
            this.agua -= 100;
            this.crema -= 70;
            this.cafe -= 14;
            this.vasos--;
            return true;
        }
        return false;

    }
    public void mostrarEstado(){
        System.out.println("Agua: " + this.agua + " ml");
        System.out.println("Cafe: " + this.cafe + " g");
        System.out.println("Crema: " + this.crema + " ml");
        System.out.println("Vasos " + this.vasos);
    }
}

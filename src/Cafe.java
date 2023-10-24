public interface Cafe {
    String getDescripcion();
    double getCosto();

    public static void main(String[] args) {
        CafeFactory factory = new CafeCarameloFactory();
        Cafe cafe = factory.crearCafe();
        System.out.println(cafe.getDescripcion() + " - precio: $" + cafe.getCosto());
    }
}

class Cafesimple implements Cafe{
    public String getDescripcion(){return "Cafe Simple";}
    public double getCosto() {return 50;}
}

class CafeConLeche implements Cafe{
    public String getDescripcion() {return "Cafe con Leche";}

    @Override
    public double getCosto() {return 60;}
}
class CafeMocha implements Cafe{
    public String getDescripcion() {return "Cafe Mocha";}

    @Override
    public double getCosto() {return 70;}
}

class CafeCaramelo implements Cafe{
    public String getDescripcion(){return "Cafe Caramelo";}
    public double getCosto() {return 50;}
}
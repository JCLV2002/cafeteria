public interface CafeFactory {
    Cafe crearCafe();
}
class CafeSimpleFactory implements CafeFactory{
    @Override
    public Cafe crearCafe() {return new Cafesimple();}
}

class CafeConLecheFactory implements CafeFactory{
    @Override
    public Cafe crearCafe() {return new CafeConLeche();}
}

class CafeMochaFactory implements CafeFactory{
    @Override
    public Cafe crearCafe() {
        return new CafeMocha();
    }
}

class CafeCarameloFactory implements CafeFactory{
    @Override
    public Cafe crearCafe() {
        return new CafeCaramelo();
    }
}
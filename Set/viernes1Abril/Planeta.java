package Set.viernes1Abril;

public class Planeta extends CuerpoCeleste{

    public Planeta(String n, double PO){
        super(n, PO, TipoCuerpoCeleste.PLANETA);
    }

    @Override
    public boolean addSatelite(CuerpoCeleste cuerpo){

        return cuerpo.getTipoCuerpo() == TipoCuerpoCeleste.LUNA && super.addSatelite(cuerpo);

    }


}

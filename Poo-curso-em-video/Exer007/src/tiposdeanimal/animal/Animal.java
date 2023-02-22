package tiposdeanimal.animal;
abstract class Animal{
    //Atributes
    protected float peso;
    protected int idade;
    protected int membros;

    //Methods
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

} 

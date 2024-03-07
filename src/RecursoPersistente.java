public interface RecursoPersistente {
    public void load();
    public void save();
}
y 3 clases que implementan dicha interfaz:
public class ConfiguracionSistema implements RecursoPersistente{
    public void load(){
        System.out.println("Configuracion sistema cargada");
    }
    public void save(){
        System.out.println("Configuracion sistema almacenada");
    }
}
public class ConfiguracionUsuario implements RecursoPersistente{
    public void load(){
        System.out.println("Configuracion usuario cargada");
    }
    public void save(){
        System.out.println("Configuracion usuario almacenada");
    }
}
public class ConfiguracionHoraria implements RecursoPersistente{
    public void load(){
        System.out.println("Configuracion horaria cargada");
    }
    public void save() {
        System.out.println("ERROR, la hora no se puede almacenar, es solo de lectura");
    }
}

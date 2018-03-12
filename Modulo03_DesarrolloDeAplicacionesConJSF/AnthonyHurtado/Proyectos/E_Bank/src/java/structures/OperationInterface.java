package structures;

public interface OperationInterface {
    // Encontrar todos los registros
    public abstract void findAll();
    
    // Encontrar uno
    public abstract void findOne();
    
    // Agregar registro
    public abstract boolean add();
    
    // Actualizar registro
    public abstract boolean update();
    
    // Eliminar registro
    public abstract boolean delete();
}

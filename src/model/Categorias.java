
package Classes;

public class Categorias {
    
    public static void Categorias(String[] args){
        
        CategoriasClass solteiro = new CategoriasClass();
        solteiro.setId(1);
        solteiro.setNome("Solteiro");
        
        CategoriasClass duplo_solteiro = new CategoriasClass();
        duplo_solteiro.setId(2);
        duplo_solteiro.setNome("Duplo solteiro");
        
        CategoriasClass casal = new CategoriasClass();
        casal.setId(3);
        casal.setNome("Casal");
        
        CategoriasClass dormitórios = new CategoriasClass();
        dormitórios.setId(4);
        dormitórios.setNome("Dormitório");
}
}

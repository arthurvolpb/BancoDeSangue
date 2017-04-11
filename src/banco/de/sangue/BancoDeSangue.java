
package banco.de.sangue;



/**
 *
 * @author Arthur
 */
public class BancoDeSangue {

    public BancoDeSangue() {
    }
    
    
    
    public void cadastraPessoa(int id, String nome){
        
        Pessoa p = new Pessoa();
        p.setId(id);
        p.setNome(nome);
        System.out.println("cadastrado com sucesso :" + p.getNome()+ p.getId());
        
        
    }
    

}

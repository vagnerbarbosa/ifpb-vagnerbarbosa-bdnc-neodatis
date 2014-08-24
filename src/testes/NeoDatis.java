package testes;

import entidades.Aluno;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

/**
 *
 * @author Vagner
 */
public class NeoDatis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Aluno a = new Aluno();
a.setNome("vagner");  

ODB odb = null;

odb = ODBFactory.open("banco.neodatis");


odb.store(a);
odb.close();

// Até este ponto, perfeito. perfil.getAcessos = {100}



       
    }
}

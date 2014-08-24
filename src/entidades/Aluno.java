package entidades;

/**
 *
 * @author Vagner
 */

public class Aluno {

    
    private String nome;
    private String matricula;
    private String email;

    public Aluno() {
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return " Nome: " + nome + ", Matrícula: " + matricula + ", E-mail: " + email + "\n";
    }
}

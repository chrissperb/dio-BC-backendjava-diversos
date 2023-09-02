package candidatura;

public class ProcessoSeletivo {
  public static void main (String[] args);
}

// Criando o método para análise de dados que serão inseridos.
static void analisarCandidato (double salarioPretendido) {
    double salarioBase = 2000.0;

    if (salarioBase > salarioPretendido) {
      System.out.println ("LIGAR PARA O CANDIDATO");
    } else if (salarioBase == salarioPretendido) 
      System.out.println ("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
      else {
      System.out.println ("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }

}

//TODO: testar na IDE (codigo construído direto no GitHub).

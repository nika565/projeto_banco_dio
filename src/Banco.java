import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientesDoBanco = new ArrayList<>();

    public Banco(String nomeBanco){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void exibirClientes(){
        if(clientesDoBanco.isEmpty()){
            System.out.println("Nenhum cliente foi adicionado no banco");
        } else {
            clientesDoBanco.forEach(cliente -> {
                System.out.println(cliente.getNome());
            });
        }
    }

    public void adicionarClientes(Cliente c){
        this.clientesDoBanco.add(c);
    }

}

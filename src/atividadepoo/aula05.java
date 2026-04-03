package atividadepoo;
public class aula05 {
	    public static void main(String[] args) {
	        // Criando a conta do Jubileu
	        ContaBanco p1 = new ContaBanco();
	        p1.setNumConta(1111);
	        p1.setDono("Maria");
	        p1.abrirConta("CC"); // Conta Corrente ganha 50 reais
	        
	        // Criando a conta da Creuza
	        ContaBanco p2 = new ContaBanco();
	        p2.setNumConta(2222);
	        p2.setDono("Sarah");
	        p2.abrirConta("CP"); // Conta Poupança ganha 150 reais
	        
	        // Movimentações
	        p1.depositar(100);
	        p2.depositar(500);
	        p2.sacar(100);
	        
	        p1.sacar(150);
	        p1.fecharConta(); // Vai fechar pois o saldo ficou zerado
	        
	        // Mostrando o estado atual das contas
	        p1.estadoAtual();
	        p2.estadoAtual();
	    }
	}


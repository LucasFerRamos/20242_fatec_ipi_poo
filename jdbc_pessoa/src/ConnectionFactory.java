import java.sql.*;
public class ConnectionFactory {
    //jdbc:postgresql://
    private static final String HOST ="localhost";
    private static final String PORT ="5432";
    private static final String DB ="20242_fatec_ipi_poo_pessoas_v2";
    private static final String USER = "postgres";
    //pesquisar pela classe Properties do pacote java.util - para resolver 
    private static final String PASSWORD = "123456";
    
    //FLUXO DE EXECUÇÃO:
    public static  Connection conectar(){
        // PODE NAO FUNCIONAR
        // POR ISSO, CRIAR UM FLUXO DE INSTRUÇÕES CASO O PRINCIPAL FALHE 
        //O FLUXO ALTERNATIVO PARA TRATAR ESSA EXCEÇÃO 
        // O PRINCIPAL - É OQUE ESTAMOS TENTANDO EXECUTAR 
        try {
            //criando conexao
            var s = String.format("jdbc:postgresql://%s:%s/%s", HOST, PORT, DB);
            //estabelece conexão
            Connection c = DriverManager.getConnection(s, USER, PASSWORD);
            //devolve a conexão
            return c;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }
}

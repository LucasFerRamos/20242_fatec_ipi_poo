//data acess object

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO  {
    public void cadastrar(Pessoa p) throws  Exception{
        //1.Especificar o comando sql (INSERT)
        var sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?, ?, ?)";
        //2 Estabelecer uma conexão com o bd
        var conexao = ConnectionFactory.conectar();
        //3. Preparar o comando
        var ps = conexao.prepareStatement(sql);
        //4. Substituir ps eventuais placeholder
        ps.setString(1, p.getNome());
        ps.setString(2, p.getFone());
        ps.setString(3, p.getEmail());
        //5. Executar o comando
        ps.execute();
        //6.. Fecha a conexão
        ps.close();
    }
    public void atualizar(Pessoa p) throws Exception {
        String sql = "UPDATE tb_pessoa SET nome = ?, fone = ?, email = ? WHERE cod_pessoa = ?";
        var conexao = ConnectionFactory.conectar();
        var ps = conexao.prepareStatement(sql);
        ps.setString(1, p.getNome());
        ps.setString(2, p.getFone());
        ps.setString(3, p.getEmail());
        ps.setInt(4, p.getCodigo());
        ps.execute();
        ps.close();  
    }
    public void apagar(Pessoa p) throws Exception{
    
        var sql = "DELETE FROM tb_pessoa WHERE codigo = ?";
        var conexao = ConnectionFactory.conectar();
        var ps = conexao.prepareStatement(sql);
        ps.setInt(1, p.getCodigo());
        ps.execute();
        ps.close();
    }
    public List <Pessoa> listar() throws Exception{
        var pessoas = new ArrayList<Pessoa>();
        var sql = "SELECT * FROM tb_pessoa";
        //7+: try-with-resources
        try(var conexao = ConnectionFactory.conectar()){
            var ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                var codigo = rs.getInt("cod_pessoa");
                var nome = rs.getString("nome");
                var fone = rs.getString("fone");
                var email = rs.getString("email");
                var p = new Pessoa(codigo, nome, fone, email);
                pessoas.add(p);
            }
            return pessoas;
        }
    }
    public List <Pessoa> filtrar(String letra) throws Exception{
        var pessoas = new ArrayList<Pessoa>();
        var sql = "SELECT * FROM tb_pessoa WHERE nome LIKE ?";
        //7+: try-with-resources
        try(var conexao = ConnectionFactory.conectar()){
          var ps = conexao.prepareStatement(sql);
          ps.setString(1, letra + "%");
          ps.execute();
          ResultSet rs = ps.executeQuery();
          while(rs.next()){
            var codigo = rs.getInt("cod_pessoa");
            var nome = rs.getString("nome");
            var fone = rs.getString("fone");
            var email = rs.getString("email");
            var p = new Pessoa(codigo, nome, fone, email);
            pessoas.add(p);
          }
          return pessoas;
        }
    }
}


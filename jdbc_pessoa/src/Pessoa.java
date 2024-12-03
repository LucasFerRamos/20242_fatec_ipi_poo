import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Pessoa {
    public Pessoa(int codigo){
        this.codigo = codigo;
    }
    private int codigo;
    private String nome, fone, email;
}


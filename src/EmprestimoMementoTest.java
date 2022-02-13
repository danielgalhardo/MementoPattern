import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoMementoTest {

    Emprestimo emprestimo;
    @BeforeEach
    public void setUp() {
        emprestimo = new Emprestimo();
    }



    @Test
    public void deveRetornarUmEstadoDoEmprestimo() throws Exception
    {
        assertEquals("Emprestimo está em analise.", emprestimo.getNomeEstado());
        assertEquals(emprestimo.getEstados().size(), 1);
    }

    @Test
    public void deveRetornarDoisEstadosDoEmprestimo() throws Exception
    {
        assertEquals("Emprestimo está em analise.", emprestimo.getNomeEstado());
        emprestimo.setEstado(EmprestimoEstadoNegado.getInstancia());
        assertEquals("Emprestimo negado", emprestimo.getNomeEstado());
        assertEquals(emprestimo.getEstados().size(), 2);
    }

    @Test
    public void deveFalharBuscaPorIndiceEstado() throws Exception{
        try {
            emprestimo.setEstado(EmprestimoEstadoNegado.getInstancia());
            emprestimo.restauraEstado(3);
            fail();
        }
        catch (Exception exception){
            assertEquals("Índice inválido", exception.getMessage());
        }
    }
}

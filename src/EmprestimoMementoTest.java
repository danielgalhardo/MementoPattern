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
    public void deveRetornarEmprestimoNegado() throws Exception
    {
        assertEquals("Emprestimo está em analise.", emprestimo.getNomeEstado());
        emprestimo.setEstado(EmprestimoEstadoNegado.getInstancia());
        assertEquals("Emprestimo negado", emprestimo.getNomeEstado());
        assertEquals(emprestimo.getEstados().size(), 2);
    }

    @Test
    public void deveRetornarEmprestimoDepositado() throws Exception
    {
        emprestimo.setEstado(EmprestimoEstadoDepositado.getInstancia());
        assertEquals("Emprestimo depositado", emprestimo.getNomeEstado());
    }

    @Test
    public void deveNegarEmprestimoEmAnalise() throws Exception{
        emprestimo.setEstado(EmprestimoEstadoEmAnalise.getInstancia());
        assertEquals("Emprestimo em analise negado", emprestimo.negarEmprestimo());
    }

    @Test
    public void deveAprovarEmprestimoEmAnalise() throws Exception{
        emprestimo.setEstado(EmprestimoEstadoEmAnalise.getInstancia());
        assertEquals("Emprestimo em analise concedido", emprestimo.concederEmprestimo());
    }

    @Test
    public void deveDepositarEmprestimoConcedido() throws Exception{
        emprestimo.setEstado(EmprestimoEstadoConcedido.getInstancia());
        assertEquals("Emprestimo sera depositado", emprestimo.depositar());
    }


    @Test
    public void deveRetornarNullPara() throws Exception{
        emprestimo.setEstado(EmprestimoEstadoConcedido.getInstancia());
        assertEquals("Emprestimo sera depositado", emprestimo.depositar());
    }

    @Test
    public void deveFalharConcederEmprestimoNegado() throws Exception{
        try {
            emprestimo.setEstado(EmprestimoEstadoNegado.getInstancia());
            emprestimo.concederEmprestimo();
            fail();
        }
        catch (Exception exception){
            assertEquals("Impossivel conceder emprestimo negado", exception.getMessage());
        }
    }

    @Test
    public void deveFalharConcederEmprestimoConcedido() throws Exception{
        try {
            emprestimo.setEstado(EmprestimoEstadoConcedido.getInstancia());
            emprestimo.concederEmprestimo();
            fail();
        }
        catch (Exception exception){
            assertEquals("Impossivel conceder emprestimo concedido", exception.getMessage());
        }
    }

    @Test
    public void deveFalharNegarEmprestimoConcedido() throws Exception{
        try {
            emprestimo.setEstado(EmprestimoEstadoConcedido.getInstancia());
            emprestimo.negarEmprestimo();
            fail();
        }
        catch (Exception exception){
            assertEquals("Impossivel negar emprestimo concedido", exception.getMessage());
        }
    }

    @Test
    public void deveFalharAnalisarEmprestimoDepositado() throws Exception{
        try {
            emprestimo.setEstado(EmprestimoEstadoDepositado.getInstancia());
            emprestimo.negarEmprestimo();
            fail();
        }
        catch (Exception exception){
            assertEquals("Impossivel negar emprestimo depositado", exception.getMessage());
        }
    }

    @Test
    public void deveFalharNegarEmprestimoDepositado() throws Exception{
        try {
            emprestimo.setEstado(EmprestimoEstadoDepositado.getInstancia());
            emprestimo.negarEmprestimo();
            fail();
        }
        catch (Exception exception){
            assertEquals("Impossivel negar emprestimo depositado", exception.getMessage());
        }
    }

    @Test
    public void deveFalharDepositarEmprestimoDepositado() throws Exception{
        try {
            emprestimo.setEstado(EmprestimoEstadoDepositado.getInstancia());
            emprestimo.depositar();
            fail();
        }
        catch (Exception exception){
            assertEquals("Impossivel depositar emprestimo depositado", exception.getMessage());
        }
    }

    @Test
    public void deveFalharAnalisarEmprestimoEmAnalise() throws Exception{
        try {
            emprestimo.setEstado(EmprestimoEstadoEmAnalise.getInstancia());
            emprestimo.analisarCredito();
            fail();
        }
        catch (Exception exception){
            assertEquals("Emprestimo ja esta em analise", exception.getMessage());
        }
    }

    @Test
    public void deveFalharDepositarEmprestimoEmAnalise() throws Exception{
        try {
            emprestimo.setEstado(EmprestimoEstadoEmAnalise.getInstancia());
            emprestimo.depositar();
            fail();
        }
        catch (Exception exception){
            assertEquals("Impossivel depositar emprestimo em analise", exception.getMessage());
        }
    }

    @Test
    public void deveAnalisarEmprestimoNegado() throws Exception{

        emprestimo.setEstado(EmprestimoEstadoNegado.getInstancia());

        assertEquals("Emprestimo sera analisado por um segunda vez",  emprestimo.analisarCredito());

    }

    @Test
    public void deveFalharDepositarEmprestimoNegado() throws Exception{
        try {
            emprestimo.setEstado(EmprestimoEstadoNegado.getInstancia());
            emprestimo.depositar();
            fail();
        }
        catch (Exception exception){
            assertEquals("Impossivel depositar emprestimo negado", exception.getMessage());
        }
    }

    @Test
    public void deveFalharNegarEmprestimoNegado() throws Exception{
        try {
            emprestimo.setEstado(EmprestimoEstadoNegado.getInstancia());
            emprestimo.negarEmprestimo();
            fail();
        }
        catch (Exception exception){
            assertEquals("Impossivel negar emprestimo negado", exception.getMessage());
        }
    }
}

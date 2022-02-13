public class EmprestimoEstadoNegado implements  EmprestimoEstado
{

    private EmprestimoEstadoNegado(){};
    private static EmprestimoEstadoNegado instancia = new EmprestimoEstadoNegado();


    public static EmprestimoEstadoNegado getInstancia()
    {
        return instancia;
    }

    @Override
    public String getEstado() {
        return "Emprestimo negado";
    }

    @Override
    public String analisarCredito(Emprestimo pedido) throws Exception {
        return ("Emprestimo sera analisado por um segunda vez");
    }

    @Override
    public String negarEmprestimo(Emprestimo pedido) throws Exception{
        throw new Exception("Impossivel negar emprestimo negado");
    }

    @Override
    public String concederEmprestimo(Emprestimo pedido) throws Exception {
        throw new Exception("Impossivel conceder emprestimo negado");
    }

    @Override
    public String depositar(Emprestimo pedido) throws Exception {
        throw new Exception("Impossivel depositar emprestimo negado");
    }
}

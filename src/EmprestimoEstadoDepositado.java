public class EmprestimoEstadoDepositado implements EmprestimoEstado{

    private EmprestimoEstadoDepositado(){};
    private static EmprestimoEstadoDepositado instancia = new EmprestimoEstadoDepositado();


    public static EmprestimoEstadoDepositado getInstancia()
    {
        return instancia;
    }

    @Override
    public String getEstado() {
        return "Emprestimo depositado";
    }

    @Override
    public String analisarCredito(Emprestimo pedido) throws Exception{
        throw new Exception("Impossivel analisar emprestimo ja depositado");
    }

    @Override
    public String negarEmprestimo(Emprestimo pedido) throws Exception {
        throw new Exception("Impossivel negar emprestimo depositado");
    }

    @Override
    public String concederEmprestimo(Emprestimo pedido)throws Exception {
        throw new Exception("Impossivel conceder emprestimo negado");
    }

    @Override
    public String depositar(Emprestimo pedido) throws Exception {
        throw new Exception("Impossivel depositar emprestimo depositado");
    }
}

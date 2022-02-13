public class EmprestimoEstadoConcedido implements  EmprestimoEstado{

    private EmprestimoEstadoConcedido(){};
    private static EmprestimoEstadoConcedido instancia = new EmprestimoEstadoConcedido();


    public static EmprestimoEstadoConcedido getInstancia()
    {
        return instancia;
    }

    @Override
    public String getEstado() {
        return "Emprestimo  concedido";
    }

    @Override
    public String analisarCredito(Emprestimo pedido) throws Exception {
        throw new Exception("Impossivel analisar emprestimo concedido");
    }

    @Override
    public String negarEmprestimo(Emprestimo pedido) throws Exception {
        throw new Exception("Impossivel negar emprestimo concedido");
    }

    @Override
    public String concederEmprestimo(Emprestimo pedido)throws Exception {
        throw new Exception("Impossivel conceder emprestimo concedido");
    }

    @Override
    public String depositar(Emprestimo pedido) throws Exception {
        return "Emprestimo sera depositado";
    }
}

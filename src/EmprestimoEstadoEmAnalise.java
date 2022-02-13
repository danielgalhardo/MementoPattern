public class EmprestimoEstadoEmAnalise implements  EmprestimoEstado{

    private static EmprestimoEstadoEmAnalise instancia = new EmprestimoEstadoEmAnalise();


    public static EmprestimoEstadoEmAnalise getInstancia()
    {
        return instancia;
    }

    @Override
    public String getEstado() {
        return "Emprestimo está em analise.";
    }

    @Override
    public String analisarCredito(Emprestimo pedido) throws Exception {
        throw new Exception("Emprestimo ja esta em analise");
    }

    @Override
    public String negarEmprestimo(Emprestimo pedido) {
        return "Emprestimo em analise negado";
    }

    @Override
    public String concederEmprestimo(Emprestimo pedido) {
        return "Emprestimo em analise concedido";
    }

    @Override
    public String depositar(Emprestimo pedido) throws Exception {
        throw new Exception("Impossivel depositar emprestimo em analise");
    }
}

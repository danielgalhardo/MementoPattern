public interface EmprestimoEstado {

    String getEstado();

    String analisarCredito(Emprestimo pedido) throws Exception;

    String negarEmprestimo(Emprestimo pedido)  throws Exception;;

    String concederEmprestimo(Emprestimo pedido)  throws Exception;;

    String depositar(Emprestimo pedido)  throws Exception;;
}

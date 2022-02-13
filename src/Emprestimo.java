import java.util.ArrayList;
import java.util.List;

public class Emprestimo {

    private String valor;
    private EmprestimoEstado estado;
    private List<EmprestimoEstado> memento = new ArrayList<EmprestimoEstado>();

    public Emprestimo()
    {
        this.estado = EmprestimoEstadoEmAnalise.getInstancia();
        this.memento.add(estado);
    }

    public String getCliente() {
        return valor;
    }

    public void setCliente(String valor) {
        this.valor = valor;
    }

    public void setEstado(EmprestimoEstado estado) {
        this.memento.add(this.estado);
        this.estado = estado;
    }

    public List<EmprestimoEstado> getEstados()
    {
        return this.memento;
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public String concederEmprestimo( )throws Exception {
        return estado.concederEmprestimo(this);
    }
    public String depositar()throws Exception {
        return estado.depositar(this);
    }

    public String analisarCredito()  throws Exception{
        return estado.analisarCredito(this);
    }

    public String negarEmprestimo() throws Exception{
        return estado.negarEmprestimo(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }


    public EmprestimoEstado getEstado() {
        return estado;
    }
}

package Telas;

/**
*
* @author Eduardo Henrique
*/
public class Sala {
    
    private String id, tipo, qtde, obs;
    private boolean computador, lousa, arcond, ventilador, tela, livros, mesa, cadeira, acessibilidade, projetor;
    
    public Sala(){
        
    }
   
    public Sala(String id, String tipo, String qtde, String obs, boolean computador, boolean lousa, boolean arcond, boolean ventilador, boolean tela, boolean livros, boolean mesa, boolean cadeira, boolean acessibilidade, boolean projetor){
        this.id = id;
        this.tipo = tipo;
        this.qtde = qtde;
        this.obs = obs;
        this.computador = computador;
        this.lousa = lousa;
        this.arcond = arcond;
        this.ventilador = ventilador;
        this.tela = tela;
        this.livros = livros;
        this.mesa = mesa;
        this.cadeira = cadeira;
        this.acessibilidade = cadeira;
        this.projetor = projetor;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getQtde() {
        return qtde;
    }

    public void setQtde(String qtde) {
        this.qtde = qtde;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public boolean isComputador() {
        return computador;
    }

    public void setComputador(boolean computador) {
        this.computador = computador;
    }

    public boolean isLousa() {
        return lousa;
    }

    public void setLousa(boolean lousa) {
        this.lousa = lousa;
    }

    public boolean isArcond() {
        return arcond;
    }

    public void setArcond(boolean arcond) {
        this.arcond = arcond;
    }

    public boolean isVentilador() {
        return ventilador;
    }

    public void setVentilador(boolean ventilador) {
        this.ventilador = ventilador;
    }

    public boolean isTela() {
        return tela;
    }

    public void setTela(boolean tela) {
        this.tela = tela;
    }

    public boolean isLivros() {
        return livros;
    }

    public void setLivros(boolean livros) {
        this.livros = livros;
    }

    public boolean isMesa() {
        return mesa;
    }

    public void setMesa(boolean mesa) {
        this.mesa = mesa;
    }

    public boolean isCadeira() {
        return cadeira;
    }

    public void setCadeira(boolean cadeira) {
        this.cadeira = cadeira;
    }

    public boolean isAcessibilidade() {
        return acessibilidade;
    }

    public void setAcessibilidade(boolean acessibilidade) {
        this.acessibilidade = acessibilidade;
    }

    public boolean isProjetor() {
        return projetor;
    }

    public void setProjetor(boolean projetor) {
        this.projetor = projetor;
    }

    
    
    
}
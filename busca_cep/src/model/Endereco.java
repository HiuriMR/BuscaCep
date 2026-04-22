package model;

public class Endereco {

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public Endereco(CepResponse cepResponse){
        this.cep = cepResponse.cep();
        this.logradouro = cepResponse.logradouro();
        this.bairro = cepResponse.bairro();
        this.localidade = cepResponse.localidade();
        this.uf = cepResponse.uf();
        this.estado = cepResponse.estado();
        this.regiao = cepResponse.regiao();
        this.ibge = cepResponse.ibge();
        this.gia = cepResponse.gia();
        this.ddd = cepResponse.ddd();
        this.siafi = cepResponse.siafi();

    }

    public String getCep(){ return cep; }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public String getEstado() {
        return estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public String getIbge() {
        return ibge;
    }

    public String getGia() {
        return gia;
    }

    public String getDdd() {
        return ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    @Override
    public String toString() {
        return  "cep = " + this.cep +
                " | logradouro = " + this.logradouro +
                " | bairro = " + this.bairro +
                " | localidade = " + this.localidade +
                " | uf = " + this.uf +
                " | estado = " + this.estado +
                " | regiao = " + this.regiao +
                " | ibge = " + this.ibge +
                " | gia = " + this.gia +
                " | ddd = " + this.ddd +
                " | siafi = " + this.siafi ;
    }
}

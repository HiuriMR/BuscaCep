package model;

public record CepResponse(String cep, String logradouro, String bairro, String localidade, String uf,
                          String estado, String regiao, String ibge, String gia, String ddd, String siafi) {

}

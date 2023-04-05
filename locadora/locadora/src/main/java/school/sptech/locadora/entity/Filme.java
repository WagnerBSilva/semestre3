package school.sptech.locadora.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3)
    private String titulo;

    @NotBlank
    @Size(min = 3)
    private String diretor;

    @PastOrPresent
    private LocalDate dataLancamento;

    private Double custoProducao;

    private Boolean indicacaoOscar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Double getCustoProducao() {
        return custoProducao;
    }

    public void setCustoProducao(Double custoProducao) {
        this.custoProducao = custoProducao;
    }

    public Boolean getIndicacaoOscar() {
        return indicacaoOscar;
    }

    public void setIndicacaoOscar(Boolean indicacaoOscar) {
        this.indicacaoOscar = indicacaoOscar;
    }

}

package school.sptech.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ProblemDetail;
import school.sptech.locadora.entity.Filme;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FilmeRepository extends JpaRepository<Filme, Long> {



    List<Filme> findByDiretorIgnoreCase(String diretor);

    List<Filme> findByDataLancamentoLessThanEqual(LocalDate dataInformada);

    List<Filme> findByIndicacaoOscarTrue();

    int countByIndicacaoOscarFalse();

    Optional<Filme> findByTitulo(String nome);

    List<Filme> findByCustoProducaoGreaterThanEqual(Double custo);
}

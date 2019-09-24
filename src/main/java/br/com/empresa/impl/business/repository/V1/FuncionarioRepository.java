package br.com.empresa.impl.business.repository.V1;

import br.com.empresa.impl.business.entity.V1.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}

package br.com.empresa.impl.business.repository.V5;

import br.com.empresa.impl.business.entity.V5.FuncionarioV5;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepositoryV5 extends JpaRepository<FuncionarioV5, Long> {

}

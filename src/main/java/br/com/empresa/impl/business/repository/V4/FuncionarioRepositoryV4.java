package br.com.empresa.impl.business.repository.V4;

import br.com.empresa.impl.business.entity.V4.FuncionarioV4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepositoryV4 extends JpaRepository<FuncionarioV4, Long> {

}

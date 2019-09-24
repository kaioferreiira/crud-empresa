package br.com.empresa.impl.business.repository.V3;

import br.com.empresa.impl.business.entity.V3.FuncionarioV3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepositoryV3 extends JpaRepository<FuncionarioV3, Long> {

}

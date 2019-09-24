package br.com.empresa.impl.business.repository.V2;

import br.com.empresa.impl.business.entity.V2.FuncionarioV2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepositoryV2 extends JpaRepository<FuncionarioV2, Long> {

}

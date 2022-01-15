package by.table.tableStructure.repository;

import by.table.tableStructure.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}

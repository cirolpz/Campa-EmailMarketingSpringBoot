package academy.atl.gestionclientes.repository;

import academy.atl.gestionclientes.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {//Inteer es el valor de la id

    @Query("SELECT c FROM Cliente c WHERE c.email = :email OR c.nombre = :nombre OR c.telefono = :telefono")

    public List<Cliente> buscarCliente(@Param("nombre") String nombre, @Param("email") String email, @Param("telefono") String telefono);


       /*
        // JPQL
        @Query("SELECT c FROM Cliente c WHERE c.email = :email OR c.nombre = :nombre OR c.telefono = :telefono")
        List<Cliente> findByEmailOrNombreOrTelefonoJPQL(@Param("email") String email, @Param("nombre") String nombre, @Param("telefono") String telefono);

        // HQL
        @Query("FROM Cliente c WHERE c.email = :email OR c.nombre = :nombre OR c.telefono = :telefono")
        List<Cliente> findByEmailOrNombreOrTelefonoHQL(@Param("email") String email, @Param("nombre") String nombre, @Param("telefono") String telefono);

        // Native Query
        @Query(value = "SELECT * FROM Cliente c WHERE c.email = :email OR c.nombre = :nombre OR c.telefono = :telefono", nativeQuery = true)
        List<Cliente> findByEmailOrNombreOrTelefonoNativeQuery(@Param("email") String email, @Param("nombre") String nombre, @Param("telefono") String telefono);

        List<Cliente> findByEmailOrNombreOrTelefono(String email, String nombre, String telefono);
    */

}

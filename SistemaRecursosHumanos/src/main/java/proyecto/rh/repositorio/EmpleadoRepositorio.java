package proyecto.rh.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.rh.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {


}

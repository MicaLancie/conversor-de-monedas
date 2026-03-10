import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class RegistroHistorial {
    private String nombreUsuario;
    private String conversion;
    private String fechaHora;


    public RegistroHistorial(String nombreUsuario, String conversion) {
        this.nombreUsuario = nombreUsuario;
        this.conversion = conversion;
        // fecha y hora generada automáticamente al momento de crear el registro
        this.fechaHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public String getNombreUsuario() { return nombreUsuario; }
    public String getConversion() { return conversion; }
    public String getFechaHora() { return fechaHora; }

    @Override
    public String toString() {
        return "[" + fechaHora + "] " + nombreUsuario + ": " + conversion;
    }
}
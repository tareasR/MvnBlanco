package uv.mx.sistemasweb;
import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        get("/aprobado", (req, res) -> "Calificacion: 9");
    }
}


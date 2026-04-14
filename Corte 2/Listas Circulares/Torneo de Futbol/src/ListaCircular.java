import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class ListaCircular {
    private Equipo cabeza;

    public void agregar(String nombre, String ciudad) {
        Equipo nuevo = new Equipo(nombre, ciudad);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.setSiguiente(cabeza);
        } else {
            Equipo actual = cabeza;
            while (actual.getSiguiente() != cabeza) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            nuevo.setSiguiente(cabeza);
        }
    }

    public void mostrar() {
        if (cabeza == null) return;

        Equipo actual = cabeza;
        do {
            System.out.println(actual.getNombre() + " - " + actual.getCiudad());
            actual = actual.getSiguiente();
        } while (actual != cabeza);
    }

    public void generarFixture() {
        if (cabeza == null) {
            System.out.println("No hay equipos.");
            return;
        }

        ArrayList<Equipo> equipos = new ArrayList<>();
        Equipo actual = cabeza;

        do {
            equipos.add(actual);
            actual = actual.getSiguiente();
        } while (actual != cabeza);

        int n = equipos.size();
        if (n != 6) {
            System.out.println("Este ejercicio está diseñado para 6 equipos.");
            return;
        }

        Random rand = new Random();

        for (int jornada = 1; jornada < n; jornada++) {
            System.out.println("\n=== JORNADA " + jornada + " ===");

            for (int i = 0; i < n / 2; i++) {
                Equipo local = equipos.get(i);
                Equipo visitante = equipos.get(n - 1 - i);

                System.out.println(local.getNombre() + " vs " + visitante.getNombre());

                // Simulación de resultado
                int golesLocal = rand.nextInt(5);
                int golesVisitante = rand.nextInt(5);

                local.setGolesFavor(local.getGolesFavor() + golesLocal);
                visitante.setGolesFavor(visitante.getGolesFavor() + golesVisitante);

                if (golesLocal > golesVisitante) {
                    local.setPuntos(local.getPuntos() + 3);
                } else if (golesLocal < golesVisitante) {
                    visitante.setPuntos(visitante.getPuntos() + 3);
                } else {
                    local.setPuntos(local.getPuntos() + 1);
                    visitante.setPuntos(visitante.getPuntos() + 1);
                }
            }

            Equipo fijo = equipos.get(0);
            Equipo ultimo = equipos.remove(equipos.size() - 1);
            equipos.add(1, ultimo);
        }

        System.out.println("\n=== TABLA DE POSICIONES ===");

        Collections.sort(equipos, new Comparator<Equipo>() {
            public int compare(Equipo a, Equipo b) {
                return b.getPuntos() - a.getPuntos();
            }
        });

        for (Equipo e : equipos) {
            System.out.println(
                e.getNombre() +
                " | Puntos: " + e.getPuntos() +
                " | Goles: " + e.getGolesFavor()
            );
        }
    }
}

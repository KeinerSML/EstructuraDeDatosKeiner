public class ArbolJugadores {

    private Jugador raiz;

    public ArbolJugadores() {
        raiz = null;
    }

    public void insertar(int elo, String nombreUsuario,
                         String pais, int partidasJugadas) {

        raiz = insertarRec(
                raiz,
                elo,
                nombreUsuario,
                pais,
                partidasJugadas);
    }

    private Jugador insertarRec(
            Jugador nodo,
            int elo,
            String nombreUsuario,
            String pais,
            int partidasJugadas) {

        if (nodo == null) {
            return new Jugador(
                    elo,
                    nombreUsuario,
                    pais,
                    partidasJugadas);
        }

        if (elo < nodo.elo) {
            nodo.izquierda = insertarRec(
                    nodo.izquierda,
                    elo,
                    nombreUsuario,
                    pais,
                    partidasJugadas);
        }
        else if (elo > nodo.elo) {
            nodo.derecha = insertarRec(
                    nodo.derecha,
                    elo,
                    nombreUsuario,
                    pais,
                    partidasJugadas);
        }

        return nodo;
    }

    public void listarEnRango(int eloMin, int eloMax) {

        System.out.println("\n=== JUGADORES CLASIFICADOS ===");
        listarEnRangoRec(raiz, eloMin, eloMax);
    }

    private void listarEnRangoRec(
            Jugador nodo,
            int eloMin,
            int eloMax) {

        if (nodo == null) {
            return;
        }

        if (nodo.elo > eloMin) {
            listarEnRangoRec(
                    nodo.izquierda,
                    eloMin,
                    eloMax);
        }

        if (nodo.elo >= eloMin &&
            nodo.elo <= eloMax) {

            System.out.println(
                    "ELO: " + nodo.elo +
                    " | Usuario: " + nodo.nombreUsuario +
                    " | País: " + nodo.pais +
                    " | Partidas: " + nodo.partidasJugadas);
        }

        if (nodo.elo < eloMax) {
            listarEnRangoRec(
                    nodo.derecha,
                    eloMin,
                    eloMax);
        }
    }
}
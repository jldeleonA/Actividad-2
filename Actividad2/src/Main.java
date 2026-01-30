class CalculadoraCalificaciones {
    // Atributos
    private String nombre;
    private double[] calificaciones = new double[5];

    public CalculadoraCalificaciones(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método 1: Calcular promedio
    public double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // Método 2: Obtener calificación final (carácter)
    public char obtenerGrado(double promedio) {
        if (promedio <= 50) return 'F';
        if (promedio <= 60) return 'E';
        if (promedio <= 70) return 'D';
        if (promedio <= 80) return 'C';
        if (promedio <= 90) return 'B';
        return 'A';
    }

    // Método 3: Imprimir resultados
    public void imprimirResultados(String nombre, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }

    // Ejecución principal
    public static void main(String[] args) {
        double[] notasAlumno = {81.0, 88.5, 98.0, 75.5, 90.0};
        CalculadoraCalificaciones alumno = new CalculadoraCalificaciones("Juan Pérez", notasAlumno);

        double promedio = alumno.calcularPromedio(notasAlumno);
        char grado = alumno.obtenerGrado(promedio);
        alumno.imprimirResultados("Juan Pérez", promedio, grado);
    }
}

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.time.LocalDate;

public class Hospital {
    public static void main(String[] args) {

        boolean opc = true;
        Scanner sc = new Scanner(System.in);

        // Cargando doctores al iniciar el sistema

        /*hotel.agregarHabitacion(new Habitacion(101, 2, 2));

        hotel.agregarHabitacion(new Habitacion(102, 1, 1));

        hotel.agregarHabitacion(new Habitacion(103, 3, 4));
                                                               */
        //parte lógica del menú
        while (opc) {
            //imprimo el menú de opciones
            System.out.println("Hospital Julio C. Perrando - Av. 9 de Julio 1100 · 0362 444-2399");
            System.out.println("-----------------------");
            System.out.println("Menú:");
            System.out.println("" +
                    "1. Listar Doctores\n" +
                    "2. Registrar un nuevo paciente.\n" +
                    "3. Actualizar información personal de un paciente.\n" +
                    "4. Consultar el historial médico de un paciente.\n" +
                    "5. Nuevo historial para un paciente.\n" +
                    "6. Guardar Historial de pacientes en archivo\n" +
                    "7. Cargar Historial de pacientes desde archivo\n" +
                    "8. Salir.");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Listar Doctores");
                    break;
                case 2:
                    System.out.println("Registrar un nuevo paciente.");
                    break;
                case 3:
                    System.out.println("Actualizar información personal de un paciente");
                    break;
                case 4:
                    System.out.println(" Consultar el historial médico de un paciente");
                    break;
                case 5:
                    System.out.println(" Nuevo historial para un paciente.");
                    break;
                case 6:
                    System.out.println(" Guardar Historial de pacientes en archivo");
                    break;
                case 7:
                    System.out.println("Cargar Historial de pacientes desde archivo");
                    break;
                case 8:
                    System.out.println("Saliendo del menú");
                    opc = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente");
            }
        }
    }

    //clase abstracta Persona
    abstract class Persona implements Serializable {
        private String nombre;
        private int dni;
        private LocalDate fechaNacimiento;

        public Persona(String nombre) {
            this.nombre = nombre;
        }

        public Persona(int dni) {
            this.dni = dni;
        }

        public Persona(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public int getDni() {
            return dni;
        }

        public void setDni(int dni) {
            this.dni = dni;
        }

        public LocalDate getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }
    }

    // Interfaz para Información
    interface Informacion {
        void verHistorialDeEventos();
    }

    //clase Doctor que extiende de Persona
    class Doctor extends Persona implements Serializable {

        private String especialidad;

        public Doctor(String nombre, String especialidad) {
            super(nombre);
            this.especialidad = especialidad;
        }

    }


    //clase Paciente que extiende de Persona
    class Paciente extends Persona implements Informacion, Serializable {

        private int nroTel;
        private int tipoDeSangre;
        private String historialMedico;

        public Paciente(String nombre, String historialMedico) {
            super(nombre);
            this.historialMedico = historialMedico;
        }

        public String getHistorialMedico() {
            return historialMedico;
        }


        @Override
        public void verHistorialDeEventos() {
            System.out.println("Historial Médico: " + getHistorialMedico());
        }
    }
}

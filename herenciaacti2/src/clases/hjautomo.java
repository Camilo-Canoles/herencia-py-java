/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ESTUDIANTES
 */
    public class hjautomo extends pdveicu {

       private String marca;
       private String modelo;
       private double precio;

       public hjautomo(String fechaFabricacion, String vinChasis, String vinMotor,
               String marca, String modelo, double precio) {
           super(fechaFabricacion, vinChasis, vinMotor);
           this.marca = marca;
           this.modelo = modelo;
           this.precio = precio;
       }

       /**
        * @return the marca
        */
       public String getMarca() {
           return marca;
       }

       /**
        * @param marca the marca to set
        */
       public void setMarca(String marca) {
           this.marca = marca;
       }

       /**
        * @return the modelo
        */
       public String getModelo() {
           return modelo;
       }

       /**
        * @param modelo the modelo to set
        */
       public void setModelo(String modelo) {
           this.modelo = modelo;
       }

       /**
        * @return the precio
        */
       public double getPrecio() {
           return precio;
       }

       /**
        * @param precio the precio to set
        */
       public void setPrecio(double precio) {
           this.precio = precio;
       }

        public void imprimir() {
         System.out.println("Informacion del auto:");
        System.out.println("Fecha de fabricación: " + getFechaFabricacion());
        System.out.println("VIN Chasis: " + getVinChasis());
        System.out.println("VIN Motor: " + getVinMotor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: $" + getPrecio());
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ESTUDIANTES
 */
public class pdveicu {

    private String fechaFabricacion;
    private String vinChasis;
    private String vinMotor;


    public pdveicu(String fechaFabricacion, String vinChasis, String vinMotor) {
        this.fechaFabricacion = fechaFabricacion;
        this.vinChasis = vinChasis;
        this.vinMotor = vinMotor;
    }

    /**
     * @return the fechaFabricacion
     */
    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    /**
     * @param fechaFabricacion the fechaFabricacion to set
     */
    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    /**
     * @return the vinChasis
     */
    public String getVinChasis() {
        return vinChasis;
    }

    /**
     * @param vinChasis the vinChasis to set
     */
    public void setVinChasis(String vinChasis) {
        this.vinChasis = vinChasis;
    }

    /**
     * @return the vinMotor
     */
    public String getVinMotor() {
        return vinMotor;
    }

    /**
     * @param vinMotor the vinMotor to set
     */
    public void setVinMotor(String vinMotor) {
        this.vinMotor = vinMotor;
    }
}

from clases.pdveicu import *
class Automovil(Vehiculo):
    def __init__(self, fecha_fabricacion, vin_chasis, vin_motor, marca, modelo, precio):
        super().__init__(fecha_fabricacion, vin_chasis, vin_motor)
        self.marca = marca
        self.modelo = modelo
        self.precio = precio

    @property
    def marca(self):
        return self._marca

    @marca.setter
    def marca(self, value):
        self._marca = value

    @property
    def modelo(self):
        return self._modelo

    @modelo.setter
    def modelo(self, value):
        self._modelo = value

    @property
    def precio(self):
        return self._precio

    @precio.setter
    def precio(self, value):
        self._precio = value

    
    def imprimir(self):
        print("=== Información del Automóvil ===")
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")
        print(f"Precio: ${self.precio:,.2f}")
        print(f"Fecha de Fabricación: {self.fecha_fabricacion}")
        print(f"VIN Chasis: {self.vin_chasis}")
        print(f"VIN Motor: {self.vin_motor}")



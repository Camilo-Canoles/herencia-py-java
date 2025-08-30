class Vehiculo:
    def __init__(self, fecha_fabricacion, vin_chasis, vin_motor):
        self.fecha_fabricacion = fecha_fabricacion
        self.vin_chasis = vin_chasis
        self.vin_motor = vin_motor

    @property
    def fecha_fabricacion(self):
        return self._fecha_fabricacion

    @fecha_fabricacion.setter
    def fecha_fabricacion(self, value):
        self._fecha_fabricacion = value

    @property
    def vin_chasis(self):
        return self._vin_chasis

    @vin_chasis.setter
    def vin_chasis(self, value):
        self._vin_chasis = value

    @property
    def vin_motor(self):
        return self._vin_motor

    @vin_motor.setter
    def vin_motor(self, value):
        self._vin_motor = value

def imprimir(self):
    print(self.fecha_fabricacion)
    print(self.vin_chasis)
    print(self.vin_motor)
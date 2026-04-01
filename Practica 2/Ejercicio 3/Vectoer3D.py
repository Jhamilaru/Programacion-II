import math
class Vector3D:
    def __init__(self, a1=0, a2=0, a3=0):
        self.a1 = a1
        self.a2 = a2
        self.a3 = a3
    def __str__(self):
        return f"({self.a1}, {self.a2}, {self.a3})"
    def __add__(self, otro):
        return Vector3D(
            self.a1 + otro.a1,
            self.a2 + otro.a2,
            self.a3 + otro.a3
        )
    def __rmul__(self, r):
        return Vector3D(
            r * self.a1,
            r * self.a2,
            r * self.a3
        )
    def __mul__(self, otro):
        return (self.a1 * otro.a1 +
                self.a2 * otro.a2 +
                self.a3 * otro.a3)
    def magnitud(self):
        return math.sqrt(self.a1**2 + self.a2**2 + self.a3**2)
    def normal(self):
        mag = self.magnitud()
        return Vector3D(
            self.a1 / mag,
            self.a2 / mag,
            self.a3 / mag
        )
    def cruz(self, otro):
        return Vector3D(
            self.a2 * otro.a3 - self.a3 * otro.a2,
            self.a3 * otro.a1 - self.a1 * otro.a3,
            self.a1 * otro.a2 - self.a2 * otro.a1
        )
    def proyeccion(self, otro):
        escalar = (self * otro) / (otro.magnitud()**2)
        return escalar * otro
    def componente(self, otro):
        return (self * otro) / otro.magnitud()
a = Vector3D(1, 2, 3)
b = Vector3D(4, 5, 6)
print("Vector a:", a)
print("Vector b:", b)
print("a + b =", a + b)
print("2 * a =", 2 * a)
print("a · b =", a * b)
print("|a| =", a.magnitud())
print("Normal de a =", a.normal())
print("a × b =", a.cruz(b))
print("Proyección de a sobre b =", a.proyeccion(b))
print("Componente de a en b =", a.componente(b))



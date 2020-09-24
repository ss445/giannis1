package physics

class PhysicsVector(var x: Double, var y: Double, var z: Double) {

      def multiplyByConstant(constant: Double): Unit = {
        this.x *= constant
        this.y *= constant
        this.z *= constant
      }
      def addVector(now: PhysicsVector): Unit = {
        this.x += now.x
        this.y += now.y
        this.z += now.z
      }

}

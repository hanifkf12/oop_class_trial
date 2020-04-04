class Cat(val callback : ICallBack) : Animal(), IAnimal {

    override fun sound(){
        println("Meow meow")
    }

    //Overloading
    fun sound(nama : String){
        println("$nama bersuara meow meow")
    }

    override fun food() {
        println("Makanan kucing adalah ikan asin")
        callback.foodCallback("Tulang Ayam")
    }

}
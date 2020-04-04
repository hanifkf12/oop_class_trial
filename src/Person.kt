open class Person(var nama : String, var alamat: String, var usia : Int) {

    open fun cetakPerson(){
        println("$nama tempat tinggal $alamat, usia $usia")
    }
    protected fun cekFun(){
        println("This is Protected")
    }


}
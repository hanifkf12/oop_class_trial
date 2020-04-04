class Dosen(var kodeDosen: String,nama : String, alamat : String, usia : Int )
    : Person(nama,alamat,usia){
    override fun cetakPerson() {
        println("Dosen dengan kode $kodeDosen yang bernama $nama")
        cekFun()
    }

}
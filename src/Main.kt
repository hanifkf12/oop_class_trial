class Main {
    companion object : ICallBack{
        @JvmStatic
        fun main(args : Array<String>){
            //Di kotlin tipe data seperti String Int Boolean merupakan sebuah boject
            //Object Everywhere
            val name = "Binar"
            println(name.toUpperCase())
            val manusia = Manusia("Hanif","Laki-Laki","BSD")
            val manusiaBaru = Manusia("Nini","Perempuan", "Bandung", 21)
            manusia.setUsia(20)
//            manusia.nama
//            manusia.alamat
//            manusia.jenisKelamin
//            val newManusia = Manusia()
            manusia.cetakManusia()
            manusiaBaru.cetakManusia()
            manusia.setNama("Nina")
            manusia.jenisKelamin = "Perempuan"
            manusia.cetakManusia()
            println("${manusia.getNama()} usia ${manusia.getUsia()} jenis kelamin ${manusia.jenisKelamin}")
//            newManusia.cetakManusia()

            val dosen = Dosen("D001", "Hanif","BSD", 34)
            dosen.cetakPerson()
            dosen.nama
            dosen.alamat
            dosen.usia
            val newClass = NewClass(12)
//            val coba = Coba("");

            val animal = Animal()
            animal.sound()
            val cat = Cat(this)
            cat.sound()
            cat.sound("Lary")
            cat.food()
            val dog : Animal = Dog()
            dog.sound()
            val robot = Robot("BumbleBee")
            robot.cetakNama()
            val iron = Iron("Black")
            iron.check()
        }

        override fun foodCallback(food: String) {
            println("Makanan Baru Kucing $food")
        }
    }


}
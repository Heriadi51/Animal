package com.erick.animal

object AnimalData {
    private val animalNames = arrayOf(
        "Singa", "Kuda", "Macan Tutul", "Harimau", "Anjing",
        "Merpati", "Ayam", "Kakatua", "Kupu-Kupu", "Ulat"
    )

    private val animalDetails = arrayOf(
        "Singa adalah spesies hewan dari keluarga felidae atau jenis kucing. Singa merupakan hewan yang hidup berkelompok. Biasanya terdiri dari seekor jantan dan banyak betina. Kelompok ini menjaga daerah kekuasaannya.",
        "Kuda adalah salah satu dari sepuluh spesies modern mamalia dari genus Equus. Hewan ini telah lama merupakan salah satu hewan peliharaan yang penting secara ekonomis dan historis, dan telah memegang peranan penting dalam pengangkutan orang dan barang selama ribuan tahun.",
        "Macan tutul adalah salah satu dari empat kucing besar. Hewan ini dikenal juga dengan sebutan harimau dahan karena kemampuannya memanjat. Pada mulanya, orang berpikiran bahwa macan tutul adalah hibrida dari singa dan harimau, sehingga muncul nama \"leopard\" di kalangan peneliti Eropa awal.",
        "Harimau adalah hewan yang tergolong dalam filum Chordata, subfilum vertebrata, kelas mamalia, pemakan daging, keluarga felidae, genus panthera, dan tergolong dalam spesies tigris. Harimau adalah jenis kucing terbesar dari spesiesnya, bahkan lebih besar dari singa.",
        "Anjing adalah mamalia yang telah mengalami domestikasi dari serigala sejak 15.000 tahun yang lalu, bahkan kemungkinan sudah sejak 100.000 tahun yang lalu berdasarkan bukti genetik berupa penemuan fosil dan tes DNA. Penelitian lain mengungkap sejarah domestikasi anjing yang belum begitu lama.",
        "Merpati dan dara termasuk dalam famili Columbidae atau burung berparuh merpati dari ordo Columbiformes, yang mencakup sekitar 300 spesies burung kerabat pekicau. Dalam percakapan umum, istilah \"dara\" dan \"merpati\" dapat saling menggantikan.",
        "Ayam adalah unggas yang biasa dipelihara orang untuk dimanfaatkan untuk keperluan hidup pemeliharanya. Ayam peliharaan merupakan keturunan langsung dari salah satu subspesies ayam hutan yang dikenal sebagai ayam hutan merah atau ayam bangkiwa. Semua ayam merupakan theropoda seperti tyrannosaurus.",
        "Kakatua adalah jenis burung hias yang memiliki bulu yang indah dengan lengkingan suara yang cukup nyaring. Spesies ini termasuk salah satu burung dengan kecerdasan yang cukup bagus, sehingga sering digunakan untuk acara-acara hiburan di kebun binatang atau tempat hiburan lainnya.",
        "Kupu-kupu dan ngengat merupakan serangga yang tergolong ke dalam ordo Lepidoptera, atau 'serangga bersayap sisik'. Secara sederhana, kupu-kupu dibedakan dari ngengat alias kupu-kupu malam berdasarkan waktu aktifnya dan ciri-ciri fisiknya.",
        "Ulat adalah tahap larva dari anggota ordo Lepidoptera. Seperti kebanyakan penamaan umum, penggunaan istilah ini sebenarnya tidak konsisten, sebab larva lalat gergaji juga sering disebut sebagai ulat. Baik larva lepidopteran maupun larva symphytan sama-sama memiliki bentuk tubuh eruciform."
    )

    private val animalImages = intArrayOf(
        R.drawable.ic_singa,
        R.drawable.ic_kuda,
        R.drawable.ic_macan_tutul,
        R.drawable.ic_harimau,
        R.drawable.ic_anjing,
        R.drawable.ic_merpati,
        R.drawable.ic_ayam,
        R.drawable.ic_kakatua,
        R.drawable.ic_kupu_kupu,
        R.drawable.ic_ulat
    )

    val listData: ArrayList<Animal>
        get() {
            val list = arrayListOf<Animal>()
            for (position in animalNames.indices) {
                val animal = Animal()
                animal.name = animalNames[position]
                animal.detail = animalDetails[position]
                animal.photo = animalImages[position]
                list.add(animal)
            }
            return list
        }
}
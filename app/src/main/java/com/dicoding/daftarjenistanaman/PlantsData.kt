package com.dicoding.daftarjenistanaman

object PlantsData {
    private val plantNames = arrayOf(
        "Keladi Hias",
        "Lidah Mertua",
        "Kaktus",
        "Monstera",
        "Philodendron",
        "Sirih Belanda",
        "Janda Bolong",
        "Sri Rejeki",
        "Suplir",
        "Kuping Gajah"
    )

    private val plantNamesScientific = arrayOf(
        "Caladium",
        "Sansevieria",
        "Cactaceae",
        "Monstera",
        "Philodendron",
        "Piper ornatum",
        "Monstera adansonii",
        "Aglaonema",
        "Adiantum",
        "Anthurium"
    )


    private val plantKingdom = arrayOf(
        "Plantae",
        "Haeckel",
        "Plantae",
        "Arum",
        "Araceae",
        "Plantae",
        "Araceae",
        "Araceae",
        "Plantae",
        "Plantae"
    )

    private val plantsComeFrom = arrayOf(
        "Amerika Selatan",
        "Afrika Timur",
        "Amerika Utara",
        "Amerika Tengah",
        "Amerika selatan",
        "Sulawesi",
        "Amerika Tropis",
        "Papua Nugini",
        "Amerika Selatan",
        "Amerika Selatan"
    )

    private val plantDetails = arrayOf(
        "Tanaman dengan genus Caladium dan Alocasia ini memiliki daun yang berwarna-warni dan berbentuk hati. Beberapa jenis keladi memiliki warna solid, dua warna solid dengan pertulangan daun berbeda, hingga lebih dari dua warna dalam satu daun.",
        "Jenis tanaman hias dengan tampilan yang unik dan juga mudah perawatannya yang pertama adalah lidah mertua. Lidah mertua memiliki nama latin Sansevieria trifasciata. Lidah mertua yang banyak dijumpai yakni lidah mertua yang memiliki bentuk daun memanjang, tekstur keras, dan corak garis vertikal pada daunnya.",
        "Jenis tanaman hias yang sangat mudah dirawat tentunya adalah kaktus. Ketahanan tanaman ini sudah terkenal dan sangat mudah untuk merawatnya. Namun, pastikan untuk menjauhkan tanaman ini dari jangkauan anak-anak. Aneka Ragam jenis dan warna kaktus yang bisa kamu pilih, cocok ditanam dipot untuk menghiasi rumah kamu antara lain Ariocarpus, Astrophytum, Cereus tetragonus, Echinocactus grusonii, Haworthia attenuata dan sebagainya.",
        "Jenis tanaman hias satu ini tengah digemari banyak orang. Nama monstera diambil dari bahasa latin monstrou yang artinya tidak normal karena memang bentuk daunnya yang berlubang. Meski kebanyakan memiliki ciri khas berlubang, ada juga yang tidak berlubang",
        "Tanaman philodendron menjadi primadona sebagai tanaman indoor maupun interior ruangan. Tanaman ini memiliki banyak ragam dan eksotis, sekitar 450 varietas. Beberapa spesies ada yang tumbuh merambat dan ada pula yang tumbuh semak.",
        "Selain meletakkan tanaman dalam pot di atas meja maupun di sudut rumah, salah satu cara menarik adalah dengan pot gantung. Tanaman Sirih Belanda ini termasuk yang cocok ditanam dalam pot gantung. Peralatannya sangat praktis. Kamu hanya perlu menyiapkan tanah dan air saja sebagai media tanamnya.",
        "Jenis tanaman hias satu ini begitu populer di masa pandemi ini. Masih masuk dalam keluarga Monstera, Janda Bolong memiliki nama lain Monstera adansonii yang memiliki bentuk daun yang unik, yakni dihiasi lubang-lubang pada permukaan tengah daunnya.",
        "Jenis tanaman hias ini dipercaya dapat memberikan keberuntungan bagi mereka yang memeliharanya. Terdapat banyak jenis tanaman hias Sri Rejeki yang bisa kamu pilih untuk dijadikan hiasan rumah.",
        "Adiantum cuneantum atau biasa disebut dengan tanaman suplir merupakan jenis tanaman hias yang memiliki ukuran daun kecil, majemuk dan berwarna hijau segar. Tanaman ini menyukai tempat yang lembap, udara bersih, dan sedikit sinar matahari.",
        "Anthurium crystallinum atau kuping gajah, memiliki bentuk daun sesuai namanya yang membentuk seperti kuping seekor gajah. Sekilas jenis tanaman hias ini tampak seperti tanaman keladi.",
    )

    private val plantsImages = intArrayOf(
        R.drawable.tanaman_keladi,
        R.drawable.tanaman_lidah_mertua,
        R.drawable.tanaman_kaktus,
        R.drawable.tanaman_monstera,
        R.drawable.tanaman_philodendron,
        R.drawable.tanaman_sirih_belanda,
        R.drawable.tanaman_janda_bolong,
        R.drawable.tanaman_sri_rejeki,
        R.drawable.tanaman_suplir,
        R.drawable.tanaman_kuping_gajah
    )

    val listData: ArrayList<Plant>
        get() {
            val list = arrayListOf<Plant>()
            for (position in plantNames.indices) {
                val plant = Plant()
                plant.name = plantNames[position]
                plant.nameScientific = plantNamesScientific[position]
                plant.kingdom = plantKingdom[position]
                plant.comeFrom = plantsComeFrom[position]
                plant.detail = plantDetails[position]
                plant.photo = plantsImages[position]
                list.add(plant)
            }
            return list
        }
}
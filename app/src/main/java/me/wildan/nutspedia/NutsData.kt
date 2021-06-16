package me.wildan.nutspedia

object NutsData {
    private val nutsName = arrayOf(
        "Kacang Tanah",
        "Kacang Kedelai",
        "Kacang Tolo",
        "Kacang Koro",
        "Kacang Merah",
        "Kacang Hijau",
        "Kacang Mete",
        "Kacang Kapri/Polong",
        "Kacang Almond",
        "Kacang Pecan",
        "Kacang Pistachio",
        "Kacang Macadamia"
    )

    private val nutsDesc = arrayOf(
        "Kacang tanah memiliki bentuk seperti biji dengan warna cokelat muda." +
        " Rasanya gurih dan legit, sehingga banyak disukai. Harga kacang tanah juga terbilang" +
        " murah.\n" +
        "Dari segi kegunaan, kacang tanah paling banyak digunakan untuk dibuat menjadi minyak. " +
        "Tapi banyak juga yang menggorengnya untuk dijadikan camilan atau diulek menjadi bumbu pecel" +
        " atau gado-gado. Kacang tanah juga sering dicampurkan ke dalam sayur asem dan kering tempe " +
        "kentang. Bahkan, kacang tanah juga sering diolah menjadi makanan manis seperti selai atau " +
        "campuran permen dan kue.",


        "Tahukah anda jika kacang kedelai merupakan kacang dengan penjualan tertinggi di Indonesia? " +
        "Itu semua karena kacang kedelai merupakan bahan utama pembuatan tahu dan tempe, " +
        "yang jadi makanan wajib sehari-hari pada masyarakat Indonesia. Tak heran, kacang yang" +
        " berukuran kecil ini memiliki rasa yang gurih.\n" +
        "Kacang kedelai juga memiliki gizi yang tinggi, sehingga sering diolah menjadi susu " +
        "yang sangat menyehatkan, dan bisa dijadikan alternatif pengganti susu sapi. Jika digoreng, " +
        "kacang kedelai akan menjadi gurih dan sangat renyah, sehingga cocok dijadikan taburan " +
        "pada bubur ayam dan makanan lainnya.",


        "Kacang tolo atau kacang tunggak merupakan biji dari tanaman sejenis kacang panjang. " +
        "Bentuk kacang tolo hampir mirip dengan kacang kedelai dan kacang hijau, hanya warnanya " +
        "cenderung krem kecokelatan. Kacang tolo memiliki rasa yang gurih, padat, dan sedikit kenyal." +
        " Dari segi pemanfaatan, kacang tolo biasa diolah menjadi camilan dan bahan campuran dalam " +
        "aneka masakan tradisional seperti sayur krecek atau brongkos.",


        "Kacang koro merupakan kacang yang masuk dalam jenis kacang polong. Bentuknya lonjong memita" +
        " dan melengkung. Warna bijinya cenderung pink sampai merah kecokelatan, tapi ada juga yang warnanya putih.\n" +
        "Di Indonesia, kacang koro yang paling populer adalah koro pedang, karena paling mudah ditemukan." +
        " Kacang koro paling cocok diolah dengan cara digoreng untuk camilan sehari-hari, karena rasanya" +
        " yang gurih dan teksturnya yang renyah. Kacang koro juga bisa dijadikan alternatif murah pengganti" +
        " kacang kedelai dalam pembuatan tahu dan tempe, karena gizinya hampir sama.",


        "Kalau kacang yang ini, anda pasti sering makan dong. Kacang merah memiliki bentuk biji yang" +
        " jauh lebih besar dari kacang tanah dan kacang kedelai, lalu dibungkus oleh cangkang lunak " +
        "berwarna merah bata yang bisa dimakan. Jika cangkang tersebut dikupas, maka anda akan melihat" +
        " bijinya yang berwarna putih. Kacang merah memiliki tekstur yang lembut dan empuk, dengan " +
        "rasa yang gurih. Di Indonesia sendiri, kacang merah jenis kidney bean paling sering dijumpai, " +
        "karena ukurannya yang besar. Kacang merah paling sering diolah menjadi sup daging sapi, " +
        "buntil, atau dijadikan es kacang merah yang menyegarkan.",


        "Kacang hijau memiliki bentuk dan ukuran yang mirip dengan kacang kedelai, namun berwarna " +
        "hijau gelap. Jika diolah, kacang hijau memiliki rasa legit.\n" +
        "Nah, olahan populer dari kacang hijau adalah bubur kacang hijau dan bakpia yang menjadi " +
        "favorit banyak orang. Selain itu, kacang hijau juga sering diambil sarinya yang penuh " +
        "akan gizi dan kaya manfaat.",


        "Kacang mete atau sering disebut juga cashew nut ini bisa dibilang unik, karena berasal dari " +
        "biji buah jambu mete. Bentuk kacang mete ini sedikit melengkung dengan ukuran sedang berwarna " +
        "kecokelatan. Teksturnya renyah dengan rasa yang enak dan gurih. Itulah sebabnya kacang mete " +
        "sering dijadikan campuran pada cokelat, kue, bahkan ada kacang mete goreng yang dijual " +
        "sebagai snack. Meski begitu, harga kacang mete ini cukup mahal, tapi harga tersebut tentu " +
        "saja sebanding dengan citarasa dan gizi yang ditawarkan.",


        "Ada 2 jenis kacang polong yang biasa dikonsumsi yaitu snow peas dan garden peas. Snow peas " +
        "ini yang paling sering kita konsumsi dalam bentuk utuh dalam sup atau tumis, dan biasa disebut " +
        "kacang kapri. Berwarna hijau pipih dan bercitarasa segar serta renyah. Berbeda dengan snow " +
        "peas, garden peas tidak bisa dimakan utuh. Melainkan hanya kacang atau polongnya, sehingga " +
        "anda harus mengupas kulitnya terlebih dulu. Kacang polong inilah yang biasa dibekukan " +
        "(frozen) atau diawetkan dalam kaleng.",


        "Di Indonesia, kacang almond atau kenari memiliki popularitas yang tinggi. Bentuk kacang " +
        "almond ini lonjong dengan warna cokelat tua (berkulit). Permukaan kulitnya tampak seperti " +
        "keriput. Kita bisa menemukan kacang ini dalam berbagai kondisi, seperti utuh atau cacah " +
        "(sliced), kupas atau berkulit, dan mentah (raw) atau panggang (roasted). Rasa dari kacang " +
        "almond ini gurih dan cenderung manis, sehingga cocok dicampurkan ke dalam aneka dessert " +
        "seperti cake, cookies, cokelat, bahkan minuman.",


        "Kacang pecan juga mungkin masih terdengar asing di telinga anda, padahal kacang ini sudah " +
        "banyak digunakan dalam pembuatan berbagai makanan. Rasanya renyah dan gurih, karena tinggi " +
        "akan lemak tak jenuh yang baik untuk kesehatan.\n" +
        "Kacang pecan memiliki bentuk seperti biji kopi yang dilindungi cangkang keras. Ukuran dari " +
        "kacang pecan kira-kira sebesar jempol orang dewasa. Dari segi pemanfaatan, kacang pecan " +
        "sering dijadikan campuran dalam pembuatan kue, cake, atau sebagai taburan pada dessert seperti es krim.",


        "Kacang pistachio ini terbilang unik. Bijinya yang berwarna hijau dilindungi oleh kulit " +
        "berwarna krem yang katupnya sedikit terbuka, sehingga menunjukkan sebagian kacang. " +
        "Teksturnya garing dan rasanya gurih serta renyah. Karena warnanya yang cantik, kacang " +
        "pistachio sering dijadikan garnish pada makanan. Tak hanya itu kacang pistachio juga sering " +
        "dijadikan isian atau topping dalam pie, cookies, ice cream, atau cake.",


        "Kacang macadamia atau yang sering disebut dengan Queensland nuts merupakan kacang yang " +
        "paling mahal di antara kacang-kacang lainnya. Sekilas bentuk dari kacang macadamia mirip " +
        "dengan biji kemiri. Rasanya cenderung manis, gurih, dan aromanya lembut. Biasanya, kacang " +
        "macadamia diolah menjadi minyak. Namun banyak juga yang mengonsumsinya sebagai camilan yang " +
        "dimakan secara mentah atau dimasak (panggang atau goreng) terlebih dahulu. Beberapa produsen " +
        "cokelat juga menjadikan kacang macadamia sebagai isian dalam produk mereka."
    )

    private val nutsPhoto = intArrayOf(
        R.drawable.kacang_tanah,
        R.drawable.kacang_kedelai,
        R.drawable.kacang_tolo,
        R.drawable.kacang_koro,
        R.drawable.kacang_merah,
        R.drawable.kacang_hijau,
        R.drawable.kacang_mete,
        R.drawable.kacang_polong,
        R.drawable.kacang_almond,
        R.drawable.kacang_pecan,
        R.drawable.kacang_pistachio,
        R.drawable.kacang_macadamia
    )

    val listData: ArrayList<Nuts>
    get() {
        val list = arrayListOf<Nuts>()
        for (position in nutsName.indices) {
            val nuts = Nuts()
            nuts.name = nutsName[position]
            nuts.desc = nutsDesc[position]
            nuts.photo = nutsPhoto[position]
            list.add(nuts)
        }
        return list
    }
}
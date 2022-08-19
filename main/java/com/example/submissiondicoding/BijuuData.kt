package com.example.submissiondicoding

object BijuuData {
    private val bijuuNames = arrayOf(
        "Shukaku",
        "Matatabi",
        "Isobu",
        "Son Goku",
        "Kokuo",
        "Saiken",
        "Choumei",
        "Gyuuki",
        "Kurama",
        "Juubi",
    )

    private val bijuuDetails = arrayOf(
        "One Tail",
        "Two Tails",
        "Three Tails",
        "Four Tails",
        "Five Tails",
        "Six Tails",
        "Seven Tails",
        "Eight Tails",
        "Nine Tails",
        "Ten Tails",
    )

    private val bijuuPhoto = arrayOf(
        R.drawable.shukaku_one,
        R.drawable.matatabi_two,
        R.drawable.isobu_thr,
        R.drawable.son_goku_four,
        R.drawable.kokuo_fiv,
        R.drawable.saiken_six,
        R.drawable.choume_sevi,
        R.drawable.gyuuki_eig,
        R.drawable.kurama_nin,
        R.drawable.juubi_ten,

    )

    private val bijuuDescription = arrayOf(
        "Shukaku Desc",
        "Matatabi Desc",
        "Isobu Desc",
        "Son Goku Desc",
        "Kokuo Desc",
        "Saiken Desc",
        "Choemi Desc",
        "Gyuki Desc",
        "Kurama Desc",
        "Juubi Desc"
        )

    private val bijuuBg = arrayOf(
        R.drawable.shukaku_bg,
        R.drawable.matatabi_bg,
        R.drawable.isobu_bg,
        R.drawable.son_goku_bg,
        R.drawable.kokuo_bg,
        R.drawable.saiken_bg,
        R.drawable.choumei_bg,
        R.drawable.gyuuki_bg,
        R.drawable.kurama_bg,
        R.drawable.juubi_ten,
    )
    val listData: ArrayList<Bijuu>
        get() {
            val list = arrayListOf<Bijuu>()
            for (position in bijuuNames.indices) {
                val bijuu = Bijuu()
                bijuu.name = bijuuNames[position]
                bijuu.details = bijuuDetails[position]
                bijuu.description = bijuuDescription[position]
                bijuu.photo = bijuuPhoto[position]
                bijuu.background = bijuuBg[position]
                list.add(bijuu)
            }
            return list
        }
}